// 3-5-17
// Creates a form on a window to Display user name and password

package youTube;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormPassingValues extends Application{

	Button submitButton;
	Stage window;
	Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Window Title");
		
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		
		//name label
		Label numberLabel=new Label("User Number");
		
		//name input
		TextField numberInput=new TextField();
		
		//Button
		submitButton=new Button("Submit");
		submitButton.setOnAction(e->isInt(numberInput, numberInput.getText()));
		
		layout.getChildren().addAll(numberLabel,numberInput, submitButton);
		
		scene=new Scene(layout, 300,300);
		window.setScene(scene);
		window.show();
	}

	private boolean isInt(TextField numberInput, String message) {
		try{
			int age=Integer.parseInt(numberInput.getText());
			System.out.println("User is: " + age + " years young");
			return true;
		}catch(NumberFormatException e){
			System.out.println("Error: " + message + " is not a number");
			return false;
		}
		
	}
}
