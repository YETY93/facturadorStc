package com.gui.stc.controller;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class MainAplicationSTC extends Application {
	
	private Stage primaryStage;
	private BorderPane root;
	
	@Override
	
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			
			BorderPane root = new BorderPane();
			
			
			FXMLLoader  guiPrincipal = new FXMLLoader();
			guiPrincipal.setLocation(MainAplicationSTC.class.getResource("/com/gui/stc/view/VistaCuadroFactura.fxml"));
			root = (BorderPane)guiPrincipal.load();
			
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.getIcons().add(new Image("/com/gui/stc/icon/iconStc.png"));
			primaryStage.setScene(scene);
			primaryStage.setTitle("Cuadro de facturascion");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
