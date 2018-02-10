package com.gui.stc.model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class validarTxtFdEntero {
	
	public void verificarEntero(TextField campotxtF) {
		
		Alert numeroNoValido = new Alert(AlertType.ERROR);
		try {
			int x1  = Integer.parseInt(campotxtF.getText());
			
		} catch (NumberFormatException e) {
			numeroNoValido.setTitle("Numero no valido");
			numeroNoValido.setHeaderText("Vericar numero ingresado");
			numeroNoValido.setContentText("Por favor verifique el numero ingresado"
					+ "\n Inform de este error " 
					+ e.getMessage());
			numeroNoValido.show();
			}
		
	}
	
	
}
