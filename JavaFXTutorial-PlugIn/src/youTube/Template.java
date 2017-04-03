// 3-5-17
// Creates a button on a window and Display Confirm Box for User to click yes/no

package youTube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Template extends Application{

	Button button;
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Window Title");
		
		button = new Button();
		button.setText("Click Me");
		button.setOnAction(e->System.out.println("I am great!"));
		
		StackPane layout=new StackPane();
		layout.getChildren().add(button);
		
		Scene scene=new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
}
