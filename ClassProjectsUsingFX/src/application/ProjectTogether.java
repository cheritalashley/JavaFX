// 3-19-17
// Calculate Area of Triangle and Circle depending on User Choice
// Display Movie by user input
// Calculate Dorm Expenses

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProjectTogether extends Application{

	Button circleButton, triangleButton, squareButton, movieButton, dormButton;
	Button cButton, sButton, tButton, mButton, dButton, calButton;
	Button addButton, subButton, divButton, mulButton;
	Stage window;
	Scene scene, scene1, scene2, scene3, scene4, scene5, scene6;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		window.setTitle("Select Option");
		
		//Choice layout
		VBox layout=new VBox(10);
		Label welcome=new Label("Welcome Friends!" + "\n" + 
					"Calculate Area of Cirle, Triangle, or Square");
		Label seperation=new Label("---------------------------------------------------");
		Label seperation2=new Label("---------------------------------------------------");
		Label welcome2=new Label("Movie and Dorm Information:");
		layout.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		
		//Button to Go to 5 Different Views
		cButton=new Button("Select Circle");
		cButton.setOnAction(e->window.setScene(scene1));
		tButton=new Button("Select Triange");
		tButton.setOnAction(e->window.setScene(scene2));
		sButton=new Button("Select Square");
		sButton.setOnAction(e->window.setScene(scene3));				
		mButton=new Button("Enter Movies");
		mButton.setOnAction(e->window.setScene(scene4));
		dButton=new Button("Enter Dorm Costs");
		dButton.setOnAction(e->window.setScene(scene5));
		calButton=new Button("Calculator");
		calButton.setOnAction(e->window.setScene(scene6));
	
		//Layout - Circle, label and Input
		VBox layoutCircle=new VBox(10);
		layoutCircle.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		Label labelRadius=new Label("Enter radius");
		TextField numberInput=new TextField();
		
		//Layout - Triangle, label and Input
		VBox layoutTriangle=new VBox(10);
		layoutTriangle.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		Label labelBase=new Label("Enter base");
		TextField baseInput=new TextField();
		Label labelHeight=new Label("Enter height");
		TextField heightInput=new TextField();
				
		//Layout - Square, label and Input
		VBox layoutSquare=new VBox(10);
		layoutSquare.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window 
		Label labelSide=new Label("Enter side");
		TextField sideInput=new TextField();
		
		//Layout - Movie, label and Input
		VBox layoutMovie=new VBox(10);
		layoutMovie.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		Label labelTitle=new Label("Enter Title");
		TextField titleInput=new TextField();
		Label labelRating=new Label("Enter G, PG, PG-13, R");
		TextField ratingInput=new TextField();
		Label labelYear=new Label("Enter Year");
		TextField yearInput=new TextField();
		Label labelRuntime=new Label("Enter Runtime");
		TextField runtimeInput=new TextField();
		
		//Layout - Dorm, label and Input
		VBox layoutDorm=new VBox(10);
		layoutDorm.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		Label labelSName=new Label("Enter Name");
		TextField snameInput=new TextField();
		Label labelHousing=new Label("Enter Cost for Housing");
		TextField housingInput=new TextField();
		Label labelExpenses=new Label("Enter Cost for Living Expenses for Month");
		TextField expensesInput=new TextField();
		Label labelSYear=new Label("Enter Freshman/Sophmore/Junior/Senior");
		TextField syearInput=new TextField();
		Label labelSupplies=new Label("Enter Amount Supplies for Year");
		TextField suppliesInput=new TextField();
		Label labelCreditAmount=new Label("Enter Number of Credits for Year");
		TextField creditAmountInput=new TextField();
		Label labelCredit=new Label("Enter Cost for Credit Hour");
		TextField creditInput=new TextField();
		
		//Layout - Calculator, label and Input
		VBox layoutCalculator=new VBox(10);
		layoutCalculator.setPadding(new Insets(20,20,20,20));//Puts a 20px padding around your window
		Label labelValue1=new Label("Enter first number");
		TextField value1Input=new TextField();
		Label labelValue2=new Label("Enter second number");
		TextField value2Input=new TextField();
		
		//Circle Button
		circleButton=new Button("Calculate");
		circleButton.setOnAction(e->{
		double cArea= CalculateArea.circleArea(numberInput.getText());
		String cirArea=String.format("%s", cArea);
		AreaAlertBox.display("Triangle Area", "The area is:", cirArea);
						});
		
		//Triangle Button
		triangleButton=new Button("Calculate");
		triangleButton.setOnAction(e->{
		double tArea= CalculateArea.triangleArea(baseInput.getText(), heightInput.getText());
		String triArea=String.format("%s", tArea);
		AreaAlertBox.display("Triangle Area", "The area is:", triArea);
						});
		
		//Square Button
		squareButton=new Button("Calculate");
		squareButton.setOnAction(e->{
		double sArea=CalculateArea.squareArea(sideInput.getText());
		String squaArea=String.format("%s", sArea);
		AreaAlertBox.display("Square Area", "The area is:", squaArea);
						});
		
		//Movie Button
		movieButton=new Button("Display Results");
		movieButton.setOnAction(e->{
		MovieAlertBox.display("Movie Results", titleInput.getText(), ratingInput.getText(), 
				yearInput.getText(), runtimeInput.getText());
						});
		
		//Dorm Button
		dormButton=new Button("Calculate Results");
		dormButton.setOnAction(e->{
		double housing=DormExpenses.housing(housingInput.getText(), expensesInput.getText());
		double credit=DormExpenses.credits(creditAmountInput.getText(), creditInput.getText());
		double total=DormExpenses.totalCosts(suppliesInput.getText(), housing, credit);
		String housingTotal=String.format("%s", housing);
		String creditTotal=String.format("%s", credit);
		String totalCost=String.format("%s", total);
		DormAlertBox.display("Dorm Results", totalCost, snameInput.getText(), housingTotal, 
				syearInput.getText(), suppliesInput.getText(), creditTotal);
								});
		//Calculator Button
		addButton=new Button("Add");
		subButton=new Button("Subtract");
		divButton=new Button("Divide");
		mulButton=new Button("Multiply");
		addButton.setOnAction(e->{
		double sum= Calculator.add(value1Input.getText(), value2Input.getText());
		String sumS=String.format("%s", sum);
		CalculateAlertBox.display("Add Values", "The sum is:", sumS);
						});
		
		subButton.setOnAction(e->{
		double difference= Calculator.sub(value1Input.getText(), value2Input.getText());
		String differenceS=String.format("%s", difference);
		CalculateAlertBox.display("Subtract Values", "The difference is:", differenceS);
						});
		
		divButton.setOnAction(e->{
		double quotient= Calculator.div(value1Input.getText(), value2Input.getText());
		String quotientS=String.format("%s", quotient);
		CalculateAlertBox.display("Divide Values", "The quotient is:", quotientS);
							});
		
		mulButton.setOnAction(e->{
		double product= Calculator.multi(value1Input.getText(), value2Input.getText());
		String productS=String.format("%s", product);
		CalculateAlertBox.display("Multiply Values", "The product is:", productS);
						});
		
		//Close Buttons
		Button closeButton1=new Button ("Close");
		closeButton1.setOnAction(e->window.close());
		Button closeButton2=new Button ("Close");
		closeButton2.setOnAction(e->window.close());
		Button closeButton3=new Button ("Close");
		closeButton3.setOnAction(e->window.close());
		Button closeButton4=new Button ("Close");
		closeButton4.setOnAction(e->window.close());
		Button closeButton5=new Button ("Close");
		closeButton5.setOnAction(e->window.close());
		Button closeButton6=new Button ("Close");
		closeButton6.setOnAction(e->window.close());
		
		//Back Buttons
		Button backButton1=new Button ("Back");
		backButton1.setOnAction(e->window.setScene(scene));
		Button backButton2=new Button ("Back");
		backButton2.setOnAction(e->window.setScene(scene));
		Button backButton3=new Button ("Back");
		backButton3.setOnAction(e->window.setScene(scene));
		Button backButton4=new Button ("Back");
		backButton4.setOnAction(e->window.setScene(scene));
		Button backButton5=new Button ("Back");
		backButton5.setOnAction(e->window.setScene(scene));
		Button backButton6=new Button ("Back");
		backButton6.setOnAction(e->window.setScene(scene));
		
		//Layouts
		layout.getChildren().addAll(welcome, cButton, tButton, sButton, 
				seperation, welcome2, mButton, dButton, seperation2, calButton); 
		layoutCircle.getChildren().addAll(labelRadius, numberInput, circleButton, 
				closeButton1, backButton1);
		layoutTriangle.getChildren().addAll(labelBase, baseInput, labelHeight, heightInput, 
				triangleButton, closeButton2, backButton2);
		layoutSquare.getChildren().addAll(labelSide, sideInput, 
				squareButton, closeButton3, backButton3);
		layoutMovie.getChildren().addAll(labelTitle, titleInput, labelRating, ratingInput, labelYear,
				yearInput, labelRuntime, runtimeInput, movieButton, closeButton4, backButton4);
		layoutDorm.getChildren().addAll(labelSName, snameInput, labelHousing, housingInput, labelExpenses,
				expensesInput, labelSYear, syearInput, labelSupplies, suppliesInput, labelCreditAmount, 
				creditAmountInput, labelCredit, creditInput, dormButton, closeButton5, backButton5);
		layoutCalculator.getChildren().addAll(labelValue1, value1Input, labelValue2, value2Input, 
				addButton, subButton, divButton, mulButton, closeButton2, backButton2);		
		
		//Scene Show
		scene=new Scene(layout, 400,400);
		scene1=new Scene(layoutCircle, 400, 400);
		scene2=new Scene(layoutTriangle, 400, 400);
		scene3=new Scene(layoutSquare, 400, 400);
		scene4=new Scene(layoutMovie, 400, 600);
		scene5=new Scene(layoutDorm, 400, 600);
		scene6=new Scene(layoutCalculator, 400, 600);
		
		//Windows Show
		window.setScene(scene);
		window.show();
	}
	
}
