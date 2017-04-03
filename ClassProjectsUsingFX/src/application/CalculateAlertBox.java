package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CalculateAlertBox {

	static void display(String title, String message, String cal){
		Stage window=new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label1=new Label();
		label1.setText(message);
		Label label2=new Label();
		label2.setText(cal);
		
		Button closeButton=new Button ("Close");
		closeButton.setOnAction(e->window.close());
		
		VBox layout=new VBox(20);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(label1, label2, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}
}
