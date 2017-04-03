// 3-5-17
// Creates a button on a window and Display Confirm Box for User to click yes/no

package youTube;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayCheckBoxes extends Application{

	Button button;
	Stage window;
	Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Checkboxes");
		
		//Checkboxes
		CheckBox box1=new CheckBox("Choice 1");
		CheckBox box2=new CheckBox("Choice 2");
		box2.setSelected(true);
		
		button = new Button();
		button.setText("Submit");
		button.setOnAction(e->handleOptions(box1, box2));
		
		VBox layout=new VBox();
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(box1, box2, button);
		
		scene=new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	
	private void handleOptions(CheckBox box1, CheckBox box2){
		String message="";
		
		if(box1.isSelected())
			message+="You selected choice 1\n";
		if(box2.isSelected())
			message+="You selected choice 2\n";
		if((!box1.isSelected())&&(!box2.isSelected()))
			message+="Select option1 or option2\n";
		System.out.println(message);
	}
}
