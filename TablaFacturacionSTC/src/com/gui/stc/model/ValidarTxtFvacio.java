package com.gui.stc.model;

import javafx.scene.control.TextField;

public class ValidarTxtFvacio {
	public int revisarVacio(TextField campoTXTF) {
		int vaciotxt = 0;
		if (campoTXTF.getText().isEmpty()) {
			campoTXTF.setText("0");
		}else {
			vaciotxt = Integer.parseInt(campoTXTF.getText());
		}
		
		return vaciotxt;
	}

}
