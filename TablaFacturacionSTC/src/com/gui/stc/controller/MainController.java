package com.gui.stc.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import com.gui.stc.model.GenerarDescuento;
import com.gui.stc.model.ValidarTxtFvacio;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
		
		if (valorTelef1.getText().isEmpty()) {
			Alert empyField = new Alert(AlertType.ERROR);
			empyField.setTitle("Error en llenado datos");
			empyField.setHeaderText("Campo Vacio");
			empyField.setContentText("Revise la infomación ingresada");
		}
		
		GenerarDescuento dcto1 = new GenerarDescuento();
		System.out.println(dcto1.DescuentoComision(valorTelef1,SPuno )); // obtiene el valor del equipos con el descuento
		System.out.println(dcto1.valorComision(valorTelef1) + " comision "); // obtiene el valor de la comision
		
		int valor1 = dcto1.DescuentoComision(valorTelef1,SPuno);
		String equipoComisionado = Integer.toString(valor1); // valor mostrado en el texto TOTAL
	
		total.setText(equipoComisionado);
		ValidarTxtFvacio textFieldVacio = new ValidarTxtFvacio();

		ArrayList<Integer> Sim = new ArrayList<>();
		ArrayList<Integer> celdasVacias = new ArrayList<>();
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef2));
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef3));
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef4));
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef5));
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef6));
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef7));
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef8));
		
		
		for(int i = 0; i <celdasVacias.size() ; i++ ) {
			System.out.println(celdasVacias.get(i));
			if(celdasVacias.get(i) != 0) {
				Sim.add(celdasVacias.get(i));
				
			}
			
		}
		 
		System.out.println(Sim);
		
	}
	
	
	
	
}
