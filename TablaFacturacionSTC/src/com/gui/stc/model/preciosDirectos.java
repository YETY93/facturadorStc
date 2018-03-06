package com.gui.stc.model;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class preciosDirectos {
	
	public int  validarIva(TextField valorIngresado, int cantidad) {
		
	
			
		
		int valorTelefono = Integer.parseInt(valorIngresado.getText());
		int valorSimCard = 2000;
		int valorSimCardIva = 380;
		int valorMaximoIvaCelular = 728520;
		
		int iva = 0;
		if ((valorTelefono - (valorSimCard + valorSimCardIva)) > valorMaximoIvaCelular) {
			iva = (int) ((valorTelefono * 0.19) / 1.19) * cantidad;
			
		} else if(((valorTelefono - (valorSimCard + valorSimCardIva)) > 0 )&&
				((valorTelefono - (valorSimCard + valorSimCardIva) ) <= valorMaximoIvaCelular)) {
			
			iva = (valorSimCardIva * cantidad);
		}

		return iva;
	}

}
