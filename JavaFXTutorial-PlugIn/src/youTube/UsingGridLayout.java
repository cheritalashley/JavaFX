// 3-5-17
// Creates a form on a window to Display user name and password

package youTube;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingGridLayout extends Application{

	Button button;
	Scene scene;
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Window Title");
		
		//Form
		TextField nameInput=new TextField();
		
		//Button
		button=new Button("Click Me");
		button.setOnAction(e->System.out.println(nameInput.getText()));
		
		// Layout
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));//Puts a 10px padding around your window
		layout.getChildren().addAll(nameInput, button);
		
		scene=new Scene(layout, 300,300);
		window.setScene(scene);
		window.show();
	}
}
