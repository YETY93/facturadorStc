package com.gui.stc.model;

import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class GenerarDescuento {
	
	public int  DescuentoComision(TextField  valortxtf, Spinner<Integer> cantidad ) {
		
		DeclaracionComisiones Telefono1 = new DeclaracionComisiones();
		
		
		int valorTelefono = Integer.parseInt(valortxtf.getText());
		
		Telefono1.setTelefono1(valorTelefono);
		int comision = 0;
		
		if (Telefono1.getTelefono1()> Telefono1.getINI_COMISION_1() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_1() ) {
			
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_1());
			comision = Telefono1.getCOMISION_1();
			
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_2() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_2()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_2());
			comision = Telefono1.getCOMISION_2();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_3() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_3()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_3());
		    comision = Telefono1.getCOMISION_3();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_4() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_4()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_4());
			comision = Telefono1.getCOMISION_4();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_5() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_5()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_5() );
			comision = Telefono1.getCOMISION_5();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_6() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_6()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_6() );
			comision = Telefono1.getCOMISION_6();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_7() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_7()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_7() );
			comision = Telefono1.getCOMISION_7();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_8() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_8()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_8() );
			comision = Telefono1.getCOMISION_8();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_9()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_9() );
			comision = Telefono1.getCOMISION_9();
		}
		
		 return (valorTelefono * cantidad.getValue());
	}
	
public int  valorComision(TextField  valortxtf) {
		
		DeclaracionComisiones Telefono1 = new DeclaracionComisiones();
		
		//String valorString = valortxtf.getText();
		int valorTelefono = Integer.parseInt(valortxtf.getText());
		
		Telefono1.setTelefono1(valorTelefono);
		int comision = 0;
		
		if (Telefono1.getTelefono1()> Telefono1.getINI_COMISION_1() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_1() ) {
			
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_1() );
			comision = Telefono1.getCOMISION_1();
			
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_2() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_2()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_2() );
			comision = Telefono1.getCOMISION_2();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_3() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_3()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_3() );
		    comision = Telefono1.getCOMISION_3();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_4() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_4()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_4() );
			comision = Telefono1.getCOMISION_4();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_5() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_5()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_5() );
			comision = Telefono1.getCOMISION_5();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_6() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_6()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_6() );
			comision = Telefono1.getCOMISION_6();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_7() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_7()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_7() );
			comision = Telefono1.getCOMISION_7();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_8() &&
				Telefono1.getTelefono1() < Telefono1.getFIN_COMISION_8()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_8() );
			comision = Telefono1.getCOMISION_8();
		}else if(Telefono1.getTelefono1()> Telefono1.getINI_COMISION_9()) {
		
			valorTelefono =(Telefono1.getTelefono1() - Telefono1.getCOMISION_9() );
			comision = Telefono1.getCOMISION_9();
		}
		
		 return comision;
	}


}
