package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;


public class Main extends Application {
	Button submitButton, previousButton;
	Stage window;
	Scene scene, scene1, scene2, scene3;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			window=primaryStage;
			
			VBox layout=new VBox(10);
			layout.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
			
			ChoiceBox<String> choiceBox=new ChoiceBox<>();
			
			choiceBox.getItems().addAll("Circle","Square", "Triangle");
			choiceBox.setValue("Circle");
			
			submitButton=new Button("Submit");
			submitButton.setOnAction(e->getChoice(choiceBox));
			
			layout.getChildren().addAll(choiceBox, submitButton);
			scene=new Scene(layout, 300,300);
			window.setScene(scene);
			
			
			window.setTitle("My First JAVA FX Application");
			window.setScene(scene);
			window.show();
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void getChoice(ChoiceBox<String> choiceBox) {
		String choice=choiceBox.getValue();
		
		if(choice=="Circle")
			myCircle();
			
		if(choice=="Square")
			mySquare();
		
		if(choice=="Triangle")
			myTriangle();
		
		return;
	}

	private void mySquare() {
		BorderPane layout2=new BorderPane();
		Box box=new Box();
		box.setWidth(150.0);
		box.setHeight(150.0);
		box.setDepth(150.0);
		layout2.setCenter(box);
		
		Translate translate=new Translate();
		translate.setX(400);
		translate.setY(150);
		translate.setZ(25);
		
		Rotate rxBox=new Rotate(0,0,0,0, Rotate.X_AXIS);
		Rotate ryBox=new Rotate(0,0,0,0, Rotate.Y_AXIS);
		Rotate rzBox=new Rotate(0,0,0,0, Rotate.Z_AXIS);
		rxBox.setAngle(30);
		ryBox.setAngle(50);
		rzBox.setAngle(30);
		box.getTransforms().addAll(rxBox, ryBox,rzBox);
		
		Text boxText=new Text();
		boxText.setText("Java FX Rotation-Box");
		boxText.setX(50);
		boxText.setY(50);
		layout2.setTop(boxText);
		
		previousButton=new Button("Go Back");
		previousButton.setOnAction(e->window.setScene(scene));
		layout2.setBottom(previousButton);
		
		scene2=new Scene(layout2, 400,400);
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene2);
		return;
	}
	
	private void myCircle() {
		BorderPane layout1=new BorderPane();
		
		Circle circle=new Circle();
		circle.setCenterX(50.0f);
		circle.setCenterY(50.0f);
		circle.setRadius(50.0f);
		layout1.setCenter(circle);
		
		Translate circleTranslate=new Translate();
		circleTranslate.setX(120);
		circleTranslate.setY(10);
		//circleTranslate.setZ(25);
		
		Rotate rxCircle=new Rotate(0,0,0,0, Rotate.X_AXIS);
		Rotate ryCircle=new Rotate(0,0,0,0, Rotate.Y_AXIS);
		//Rotate rzCircle=new Rotate(0,0,0,0, Rotate.Z_AXIS);
		rxCircle.setAngle(30);
		ryCircle.setAngle(50);
		//rzCircle.setAngle(30);
		circle.getTransforms().addAll(rxCircle, ryCircle/*,rzCircle*/);
		
		Text circleText=new Text();
		circleText.setText("Java FX-Circle");
		circleText.setX(50);
		circleText.setY(50);
		layout1.setTop(circleText);
		
		previousButton=new Button("Go Back");
		previousButton.setOnAction(e->window.setScene(scene));
		layout1.setBottom(previousButton);
		
		scene1=new Scene(layout1, 400,400);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene1);
	}

	private void myTriangle() {
		BorderPane layout3=new BorderPane();
		Polygon triangle=new Polygon();
		triangle.maxWidth(150.0);
		triangle.maxHeight(150.0);
		//triangle.maxDepth(150.0);
		layout3.setCenter(triangle);
		
		Translate translate=new Translate();
		translate.setX(400);
		translate.setY(150);
		translate.setZ(25);
		
		Rotate rxTriangle=new Rotate(0,0,0,0, Rotate.X_AXIS);
		Rotate ryTriangle=new Rotate(0,0,0,0, Rotate.Y_AXIS);
		Rotate rzTriangle=new Rotate(0,0,0,0, Rotate.Z_AXIS);
		rxTriangle.setAngle(30);
		ryTriangle.setAngle(50);
		rzTriangle.setAngle(30);
		triangle.getTransforms().addAll(rxTriangle, ryTriangle,rzTriangle);
		
		Text triangleText=new Text();
		triangleText.setText("Java FX-Triangle");
		triangleText.setX(50);
		triangleText.setY(50);
		layout3.setTop(triangleText);
		
		previousButton=new Button("Go Back");
		previousButton.setOnAction(e->window.setScene(scene));
		layout3.setBottom(previousButton);
		
		scene3=new Scene(layout3, 400,400);
		scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene3);
		return;
	}
}

