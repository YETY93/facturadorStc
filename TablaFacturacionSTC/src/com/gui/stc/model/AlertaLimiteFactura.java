package com.gui.stc.model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertaLimiteFactura {
	
	public void alertaValor(int total) {

		if(total > 763000) {
			Alert valorSuperado = new Alert(AlertType.WARNING);
			valorSuperado.setTitle("Valor superado");
			valorSuperado.setHeaderText("El valor a facturar ha sido superado");
			valorSuperado.setContentText("El valor total a facturar supera los 763000");
			valorSuperado.show();
			
		}
		
	}

}
