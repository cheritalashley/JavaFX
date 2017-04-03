package youtube;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld2 extends Application {

	public static void main(String[] args) {
		launch(args);	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn=new Button("Click Me");
		Button exit=new Button("Exit");
		exit.setOnAction(e-> System.exit(0));
		btn.setOnAction(new EventHandler<ActionEvent>() {
			String name= "Cherita";
		
			@Override
			public void handle(ActionEvent event){
				System.out.println("Hello " + name);
			}
		});

		VBox root=new VBox();
		root.getChildren().addAll(btn, exit);
		Scene scene=new Scene(root, 500, 300);
		primaryStage.setTitle("My Hello World FX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
