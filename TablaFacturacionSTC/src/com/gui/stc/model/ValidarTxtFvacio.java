package com.gui.stc.model;

import javafx.scene.control.TextField;

public class ValidarTxtFvacio {
	public int revisarVacio(TextField campoTXTF) {
		int vaciotxt = 1;
		if (campoTXTF.getText().isEmpty()) {
			vaciotxt = 0;
		}
		
		return vaciotxt;
	}

}
