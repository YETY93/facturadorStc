package com.gui.stc.controller;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.gui.stc.model.AlertaLimiteFactura;
import com.gui.stc.model.GenerarDescuento;
import com.gui.stc.model.SumaArrayValores;
import com.gui.stc.model.preciosDirectos;
import com.gui.stc.model.validarTxtFdEntero;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@FXML
	private Spinner<Integer> SPuno;
	@FXML
	private Spinner<Integer> SPdos;
	@FXML
	private Spinner<Integer> SPtres;
	@FXML
	private Spinner<Integer> SPcuatro;
	@FXML
	private Spinner<Integer> SPcinco;
	@FXML
	private Spinner<Integer> SPseis;
	@FXML
	private Spinner<Integer> SPsiete;
	@FXML
	private Spinner<Integer> SPocho;

	@FXML
	private TextField valorTelef1;
	@FXML
	private TextField valorTelef2;
	@FXML
	private TextField valorTelef3;
	@FXML
	private TextField valorTelef4;
	@FXML
	private TextField valorTelef5;
	@FXML
	private TextField valorTelef6;
	@FXML
	private TextField valorTelef7;
	@FXML
	private TextField valorTelef8;

	@FXML
	private Button imprime;
	@FXML
	private Button btn_salir;

	@FXML
	private Text total;
	@FXML
	private Text iva;
	@FXML
	private Text subTotal;

	@FXML
	private RadioButton realizarDesctoSub;
	@FXML
	private RadioButton comisionDirecta;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		// Editables todos los Spinner
		SPuno.setEditable(true);
		SPdos.setEditable(true);
		SPtres.setEditable(true);
		SPcuatro.setEditable(true);
		SPcinco.setEditable(true);
		SPseis.setEditable(true);
		SPsiete.setEditable(true);
		SPocho.setEditable(true);

	}

	public void generarDescuentoSub() {

		validarTxtFdEntero prueba = new validarTxtFdEntero();
		prueba.verificarEntero(valorTelef1);

		GenerarDescuento dcto1 = new GenerarDescuento();
		
		
		ArrayList<Integer> descuentos = new ArrayList<Integer>();
		try {
			descuentos.add(dcto1.DescuentoComision(valorTelef1, SPuno.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef2, SPdos.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef3, SPtres.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef4, SPcuatro.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef5, SPcinco.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef6, SPseis.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef7, SPsiete.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef8, SPocho.getValue()));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

			Alert errorAdicionando = new Alert(AlertType.ERROR);
			errorAdicionando.setTitle("Error en Valor");
			errorAdicionando.setHeaderText("Error al Ingresar los valores");
			errorAdicionando.setContentText("Por favor revise los valores ingresados" + "NOTA:"
					+ "\n -Revise que no tenga espacios en blanco" + "\n -Que no tenga literales");
			errorAdicionando.show();
		}

		ArrayList<Integer> ivasList = new ArrayList<Integer>();
		ivasList.add(dcto1.valorIva(valorTelef1, SPuno.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef2, SPdos.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef3, SPtres.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef4, SPcuatro.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef5, SPcinco.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef6, SPseis.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef7, SPsiete.getValue()));
		ivasList.add(dcto1.valorIva(valorTelef8, SPocho.getValue()));

		// sumas de arrays precios e ivas

		SumaArrayValores valorTotalSuma = new SumaArrayValores();
		SumaArrayValores valorTotalIvas = new SumaArrayValores();

		int valorEquiposSC;
		valorEquiposSC = (valorTotalSuma.totalSumaArray(descuentos));

		if (valorEquiposSC == 0) {
			Alert errorNumCero = new Alert(AlertType.INFORMATION);
			errorNumCero.setTitle("Valor numerico");
			errorNumCero.setHeaderText("Algun campo vacio o en (0)");
			errorNumCero.setContentText("Por favor revise los valores ingresados" + "\n NOTA:"
					+ "\n 	-Revise que la cantidad sellecionada no sea (0)");
			errorNumCero.show();
		}

		AlertaLimiteFactura validarTotal = new AlertaLimiteFactura();
		validarTotal.alertaValor(valorEquiposSC);

		int ivaEquipos;
		ivaEquipos = (valorTotalIvas.totalSumaArray(ivasList));

		int subtotalInt;
		subtotalInt = (valorEquiposSC - ivaEquipos);

		// FORMATEO DE VALORES A SEPARADOS POR (.)
		DecimalFormat formatMil = new DecimalFormat("###,###.##");

		// valores mostrados en pantalla
		subTotal.setText("$ " + formatMil.format(subtotalInt));
		iva.setText("$ " + formatMil.format(ivaEquipos));
		total.setText("$ " + formatMil.format(valorEquiposSC));

	}

	public void valorEquipoButique() {
		preciosDirectos nuevoCalculo = new preciosDirectos();

		SumaArrayValores sumTotal = new SumaArrayValores();

		ArrayList<Integer> valorIvaEquipos = new ArrayList<Integer>();

		try {
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef1, SPuno.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef2, SPdos.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef3, SPtres.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef4, SPcuatro.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef5, SPcinco.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef6, SPseis.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef7, SPsiete.getValue()));
			valorIvaEquipos.add(nuevoCalculo.validarIva(valorTelef8, SPocho.getValue()));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

			Alert errorAdicionando = new Alert(AlertType.ERROR);
			errorAdicionando.setTitle("Error en Valor");
			errorAdicionando.setHeaderText("Error al Ingresar los valores");
			errorAdicionando.setContentText("Por favor revise los valores ingresados" + "NOTA:"
					+ "\n -Revise que no tenga espacios en blanco" + "\n -Que no tenga literales");
			errorAdicionando.show();
		}

		ArrayList<Integer> totalEquipos = new ArrayList<Integer>();
		totalEquipos.add(Integer.parseInt(valorTelef1.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef2.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef3.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef4.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef5.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef6.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef7.getText()));
		totalEquipos.add(Integer.parseInt(valorTelef8.getText()));

		sumTotal.totalSumaArray(valorIvaEquipos);
		sumTotal.totalSumaArray(totalEquipos);

		AlertaLimiteFactura validarTotal = new AlertaLimiteFactura();
		validarTotal.alertaValor(sumTotal.totalSumaArray(totalEquipos));

		int ivaEquipos;
		ivaEquipos = (sumTotal.totalSumaArray(valorIvaEquipos));

		int subtotalInt;
		subtotalInt = (sumTotal.totalSumaArray(totalEquipos) - ivaEquipos);

		// FORMATEO DE VALORES A SEPARADOS POR (.)
		DecimalFormat formatMil = new DecimalFormat("###,###.##");

		// valores mostrados en pantalla
		subTotal.setText("$ " + formatMil.format(subtotalInt));
		iva.setText("$ " + formatMil.format(ivaEquipos));
		total.setText("$ " + formatMil.format(sumTotal.totalSumaArray(totalEquipos)));
	}
	
	

	public void efectuarComision() {
		if (realizarDesctoSub.isSelected() == true) {
			generarDescuentoSub();

		} else if (comisionDirecta.isSelected() == true) {
			valorEquipoButique();

		}
	}
	
	
	@FXML
	private void cerraVentana(){
	    // get a handle to the stage
	    Stage stage = (Stage) btn_salir.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}

}
