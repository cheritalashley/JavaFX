// 3-5-17
// Creates a layout to have menu items at top and menu items on side 
// embed layouts using the HBox and VBox layout 

package youTube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CombiningLayouts extends Application{

	Button button1, button2, button3, button4, button5, button6;
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Window Title");
		
		HBox topMenu=new HBox();
		button1 = new Button("File");
		button2 = new Button("Edit");
		button3 = new Button("View");
		topMenu.getChildren().addAll(button1, button2, button3);
		
		VBox leftMenu=new VBox();
		button4 = new Button("Love");
		button5 = new Button("Peace");
		button6 = new Button("Family");
		leftMenu.getChildren().addAll(button4, button5, button6);
		
		BorderPane borderPane=new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		Scene scene=new Scene(borderPane,300,250);
		window.setScene(scene);
		window.show();
	}
}
