// 3-4-17
// Creates a button on a window using 1) Override in new Method and 2) Lambda Expression

package youTube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonUsingLambda extends Application {

	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Window Title: Button");
		
		button = new Button();
		button.setText("Click Me");
		
		//onClick will print out to console
		/*button.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("I am a great programmer!");
			}
		});*/
		
		//also can use Lambda Expression to do the same as above, but neater
		button.setOnAction(e -> System.out.println("I am a great programmer!"));
		
		StackPane layout=new StackPane();
		layout.getChildren().add(button);
		
		Scene scene=new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	
	
	
}
