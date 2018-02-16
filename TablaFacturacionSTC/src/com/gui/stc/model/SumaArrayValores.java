package com.gui.stc.model;

import java.util.ArrayList;

public class SumaArrayValores {
	
	public int totalSumaArray(ArrayList<Integer> valoresIngresados){
		int totalSuma;
		totalSuma = 0;
		
		for(int i = 0; i < valoresIngresados.size(); i++  ) {
			totalSuma = totalSuma + valoresIngresados.get(i);
		}
		
		
		
		
		return totalSuma;
		
	}

}
