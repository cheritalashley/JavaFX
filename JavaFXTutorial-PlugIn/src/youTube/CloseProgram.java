// 3-5-17
// Creates a button on a window and Display Confirm Box for User to click yes/no and close program

package youTube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseProgram extends Application{

	Button button;
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Window Title: Close Application");
		window.setOnCloseRequest(e->{
			e.consume(); //DO THIS ON ON THE WINDOW, If do not consume method, will not execute entire method 
			closeProgram();
			});
		
		button = new Button();
		button.setText("Close Program");
		button.setOnAction(e->closeProgram());
		
		StackPane layout=new StackPane();
		layout.getChildren().add(button);
		
		Scene scene=new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram(){
		boolean answer=ConfirmBox.display("Title", "Sure you want to exit");
		
		if (answer){
		System.out.println("File Saved");
		window.close();
		}
	}
}
