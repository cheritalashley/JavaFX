package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

	public class MovieAlertBox {

		static void display(String title, String name, String rating, String year, String runtime){
			Stage window=new Stage();
			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle(title);
			window.setMinWidth(250);
			
			Label labelName=new Label("Movie Name: " + name);
			Label labelRating=new Label("Movie Rating: " + rating);
			Label labelYear=new Label("Movie year: " + year);
			Label labelRuntime=new Label("Movie runtime: " + runtime);
			
			Button closeButton=new Button ("Close");
			closeButton.setOnAction(e->window.close());
			
			VBox layout=new VBox(30);
			layout.setPadding(new Insets(20,20,20,20));
			layout.getChildren().addAll(labelName, labelRating, labelYear, labelRuntime, closeButton);
			
			Scene scene=new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
	}

