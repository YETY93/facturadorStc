package com.gui.stc.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.gui.stc.model.DeclaracionComisiones;
import com.gui.stc.model.GenerarDescuento;
import com.gui.stc.model.ValidarTxtFvacio;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
		

		GenerarDescuento dcto1 = new GenerarDescuento();
		System.out.println(dcto1.DescuentoComision(valorTelef1,SPuno )); // obtiene el valor del equipos con el descuento
		System.out.println(dcto1.valorComision(valorTelef1) + " comision "); // obtiene el valor de la comision
		
		int valor1 = dcto1.DescuentoComision(valorTelef1,SPuno);
		String equipoComisionado = Integer.toString(valor1); // valor mostrado en el texto TOTAL
	
		total.setText(equipoComisionado);
		ValidarTxtFvacio textFieldVacio = new ValidarTxtFvacio();
		System.out.println(textFieldVacio.revisarVacio(valorTelef2));
		
	}
	
	
	
	
}
