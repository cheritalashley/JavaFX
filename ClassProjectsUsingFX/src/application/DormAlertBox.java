package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DormAlertBox {
	
	static void display(String title, String total, String name, String housing, String year, 
					String supplies, String credit){
		Stage window=new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label labelSName=new Label("Student Name: " + name);
		Label labelHousing=new Label("Student Housing Costs: " + housing);
		Label labelSYear=new Label("Student is a " + year);
		Label labelSupplies=new Label("Student Supply Costs: " + supplies);
		Label labelCreditAmount=new Label("Student Credit Costs:" + credit);
		Label labelExpenses=new Label("Student Total Costs: " + total);
		
		Button closeButton=new Button ("Close");
		closeButton.setOnAction(e->window.close());
		
		VBox layout=new VBox(30);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(labelSName, labelSYear, labelHousing, labelSupplies,
				labelCreditAmount, labelExpenses, closeButton);
	
		
		Scene scene=new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}
}
