package com.gui.stc.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import com.gui.stc.model.GenerarDescuento;
import com.gui.stc.model.ValidarTxtFvacio;
import com.gui.stc.model.validarTxtFdEntero;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
		
		// Mensaje de no es numero entero
		validarTxtFdEntero prueba = new validarTxtFdEntero(); 
		prueba.verificarEntero(valorTelef1);
		prueba.verificarEntero(valorTelef2);
		prueba.verificarEntero(valorTelef3);
		prueba.verificarEntero(valorTelef4);
		prueba.verificarEntero(valorTelef5);
		prueba.verificarEntero(valorTelef6);
		prueba.verificarEntero(valorTelef7);
		prueba.verificarEntero(valorTelef8);
		
		GenerarDescuento dcto1 = new GenerarDescuento();
		System.out.println(dcto1.DescuentoComision(valorTelef1,SPuno )); // obtiene el valor del equipos con el descuento
		System.out.println(dcto1.valorComision(valorTelef1) + " comision "); // obtiene el valor de la comision
		
		int valor1 = dcto1.DescuentoComision(valorTelef1,SPuno);
		int valor2= dcto1.DescuentoComision(valorTelef2,SPdos);
		int valor3= dcto1.DescuentoComision(valorTelef3,SPtres);
		int valor4= dcto1.DescuentoComision(valorTelef4,SPcuatro);
		int valor5= dcto1.DescuentoComision(valorTelef5,SPcinco);
		int valor6= dcto1.DescuentoComision(valorTelef6,SPseis);
		int valor7= dcto1.DescuentoComision(valorTelef7,SPsiete);
		int valor8= dcto1.DescuentoComision(valorTelef8,SPocho);
		// Sc = sin comision
		int valorEquiposSC = (valor1 + valor2 + valor3 + valor4 + valor5+ valor6
				+ valor7 + valor8);
		String equipoComisionado = Integer.toString(valorEquiposSC); // valor mostrado en el texto TOTAL
	
		total.setText(equipoComisionado);
		ValidarTxtFvacio textFieldVacio = new ValidarTxtFvacio();

		ArrayList<Integer> sim = new ArrayList<>();
		ArrayList<Integer> celdasVacias = new ArrayList<>();
		celdasVacias.add(textFieldVacio.revisarVacio(valorTelef1));
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
				sim.add(celdasVacias.get(i));
				
			}	
		}
		
		int cantidadSim = 0;
		for(int j = 0; j <sim.size() ; j++ ) {
			cantidadSim = cantidadSim + sim.get(j);
		}
		 
		System.out.println(cantidadSim);
		
	}
	
	
	
	
}
