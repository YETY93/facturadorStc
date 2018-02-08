package com.gui.stc.model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class validarTxtFdEntero {
	
	public int verificarEntero(TextField campotxtF) {
		
		Alert numeroNoValido = new Alert(AlertType.ERROR);
		try {
			int x1  = Integer.parseInt(campotxtF.getText());
			return x1;
		} catch (NumberFormatException e) {
			numeroNoValido.setTitle("Numero no valido");
			numeroNoValido.setHeaderText("Vericar numero ingresado");
			numeroNoValido.setContentText("Por favor verifique el numero ingresado"
					+ "\n Error " 
					+ e.getMessage());
			numeroNoValido.show();
			}
		return 0;
	}
	
	
}
