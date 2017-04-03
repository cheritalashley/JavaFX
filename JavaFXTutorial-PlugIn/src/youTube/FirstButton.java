// 3-4-17
// Creates a button on a window

package youTube;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstButton extends Application implements EventHandler<ActionEvent> {

	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Window Title: Button");
		
		button = new Button();
		button.setText("Click Me");
		button.setOnAction(this);
		
		StackPane layout=new StackPane();
		layout.getChildren().add(button);
		
		Scene scene=new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==button){
			System.out.println("I am a great programmer!");
		}
	}
	
	
	
}
