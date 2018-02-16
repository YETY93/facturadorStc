package com.gui.stc.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.gui.stc.model.AlertaLimiteFactura;
import com.gui.stc.model.GenerarDescuento;
import com.gui.stc.model.SumaArrayValores;
import com.gui.stc.model.ValidarTxtFvacio;
import com.gui.stc.model.validarTxtFdEntero;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController implements Initializable{

	
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
	private Text total;
	@FXML
	private Text iva;
	@FXML
	private Text subTotal;





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
	
	
	
	public void imprimir () {

		validarTxtFdEntero prueba = new validarTxtFdEntero(); 
		prueba.verificarEntero(valorTelef1);
		/*
		// Mensaje de no es numero entero
		prueba.verificarEntero(valorTelef2);
		prueba.verificarEntero(valorTelef3);
		prueba.verificarEntero(valorTelef4);
		prueba.verificarEntero(valorTelef5);
		prueba.verificarEntero(valorTelef6);
		prueba.verificarEntero(valorTelef7);
		prueba.verificarEntero(valorTelef8);
		*/
		
		GenerarDescuento dcto1 = new GenerarDescuento();
		System.out.println(dcto1.DescuentoComision(valorTelef1,SPuno.getValue() )); // obtiene el valor del equipos con el descuento
		System.out.println(dcto1.valorComision(valorTelef1,SPuno.getValue() ) + " comision "); // obtiene el valor de la comision
		
		
		
		ArrayList<Integer> descuentos = new ArrayList(); 
		try {
			descuentos.add(dcto1.DescuentoComision(valorTelef1,SPuno.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef2,SPdos.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef3,SPtres.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef4,SPcuatro.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef5,SPcinco.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef6,SPseis.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef7,SPsiete.getValue()));
			descuentos.add(dcto1.DescuentoComision(valorTelef8,SPocho.getValue()));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Alert errorAdicionando = new Alert(AlertType.ERROR);
			errorAdicionando.setTitle("Error en Valor");
			errorAdicionando.setHeaderText("Error al Ingresar los valores");
			errorAdicionando.setContentText("Por favor revise los valores ingresados");
			errorAdicionando.show();
		}


		SumaArrayValores valorTotalSuma = new SumaArrayValores();
		// Sc = sin comision
		int valorEquiposSC;
		valorEquiposSC = (valorTotalSuma.totalSumaArray(descuentos));
		
		AlertaLimiteFactura validarTotal = new AlertaLimiteFactura();
		validarTotal.alertaValor(valorEquiposSC);
		
		int ivaEquipos;
		ivaEquipos = (dcto1.valorIva(valorTelef1, SPuno.getValue()));
		
		int subtotalInt; 
		subtotalInt= (valorEquiposSC - ivaEquipos);
		
		String equipoComisionado = Integer.toString(valorEquiposSC); // valor mostrado en el texto TOTAL
		String ivaEquiposSTR = Integer.toString(ivaEquipos);
		String subTotalTXT = Integer.toString(subtotalInt);
		

		iva.setText(ivaEquiposSTR);
		total.setText(equipoComisionado);
		subTotal.setText(subTotalTXT);
		
	}
	
	
	
	
}
