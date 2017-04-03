// 3-5-17
// Creates a dropdown menu

package youTube;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropDownMenu extends Application{

	Button button;
	Stage window;
	Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Drop Down Menu");
		
		button = new Button("Submit");
		
		ChoiceBox<String> choiceBox=new ChoiceBox<>();
		
		choiceBox.getItems().addAll("Choice1","Choice2", "Choice3", "Choice4", "Choice5" );
		choiceBox.setValue("Choice1");
		
		button.setOnAction(e->getChoice(choiceBox));
		
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(choiceBox, button);
		
		scene=new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}

	private void getChoice(ChoiceBox<String> choiceBox) {
		String food=choiceBox.getValue();
		System.out.println(food);
		return;
	}
}
