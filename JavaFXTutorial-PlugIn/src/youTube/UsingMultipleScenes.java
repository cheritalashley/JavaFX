// 3-4-17
// Creates a button on a window using 1) Override in new Method and 2) Lambda Expression

package youTube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingMultipleScenes extends Application {

	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		
		Label label1=new Label("Welcome to the 1st Scene");
		Button button1=new Button("Go to scene2");
		button1.setOnAction(e-> window.setScene(scene2));
		
		//Button 3 but on Scene1
		Button button3=new Button("Click Me");
		button3.setOnAction(e-> System.out.println("I am great!"));
		
		// Layout 1
		VBox layout1=new VBox(20);
		layout1.getChildren().addAll(label1, button1, button3);
		scene1=new Scene(layout1, 200, 200);
		
		//Button 2
		Label label2=new Label("Welcome to the 2nd Scene");
		Button button2=new Button("Go Back To Scene 1");
		button2.setOnAction(e-> window.setScene(scene1));
		
		//Layout 2
		StackPane layout2=new StackPane();
		layout2.getChildren().addAll(label2, button2);
		scene2=new Scene(layout2, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("Title of my Scene");
		window.show();
	}
}
