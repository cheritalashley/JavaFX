package claim;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtContainer {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Label msgLabel;
	private Panel controlPanel;
	
	private TextField firstName;;
	private TextField lastName;;
	private TextField age;
	
	private AwtContainer(){
		prepareGUI();
	}
			
	private void prepareGUI(){
			mainFrame=new Frame("Claim Java AWT Frame");
			mainFrame.setSize(400,400);
			mainFrame.setLayout(new GridLayout(3,1));
			
			mainFrame.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent windowEvent){
					System.exit(0);
				}
			});
		
			headerLabel=new Label();
			headerLabel.setAlignment(Label.CENTER);
			statusLabel=new Label();
			statusLabel.setAlignment(Label.CENTER);
			statusLabel.setSize(350, 100);
			
			msgLabel=new Label();
			msgLabel.setAlignment(Label.CENTER);
			msgLabel.setText("My First Java Frame Yea!!!!!");
			
			controlPanel= new Panel();
			controlPanel.setLayout(new FlowLayout());
			
			mainFrame.add(headerLabel);
			mainFrame.add(controlPanel);
			mainFrame.add(statusLabel);
			mainFrame.setVisible(true);
			
			firstName=new TextField();
			firstName.setSize(350, 50);
			firstName.setText("FirstName");
			
			lastName=new TextField();
			lastName.setSize(350, 50);
			lastName.setText("LastName");
			
			age=new TextField();
			age.setSize(350, 50);
			age.setText("Age");
	}
	
	private void showFrame(){
			headerLabel.setText("Container in action: Frame");
			headerLabel.setForeground(Color.RED);
			
			final Frame frame=new Frame();
			frame.setSize(300, 300);
			frame.setLayout(new FlowLayout());
			frame.add(msgLabel);
			frame.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent windowEvent){
					frame.dispose();
				}
			});
			
			Button okButton=new Button("Open New Window");
			okButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					statusLabel.setText("Look at this second Frame.");
					frame.setVisible(true);
				}
			});
			
			//New Exit Button
			Button exitButton=new Button("Exit Application");
			exitButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					statusLabel.setText("Exit");
					mainFrame.setVisible(false);
				}
			});
			
			controlPanel.add(okButton);
			controlPanel.add(exitButton);
			mainFrame.setVisible(true);	
	
			Button newexitButton=new Button("Exit Third Window");
			newexitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					statusLabel.setText("Look at this third Frame.");
					frame.setVisible(false);
				}
			});	
			
			frame.add(newexitButton);	
			
			frame.add(new Label("First Name"));
			frame.add(firstName);
			frame.add(new Label("Last Name"));
			frame.add(lastName);
			frame.add(new Label("Age"));
			frame.add(age);	
			
			Button submitButton=new Button("Submit");
			submitButton.addActionListener(new ActionListener(){ 
	            public void actionPerformed(ActionEvent e) {
	                System.out.print(firstName.getText());
	                System.out.print(lastName.getText());
	                System.out.print(age.getText());
	                frame.setVisible(false);
	            }
	        });
			
			frame.add(submitButton);	
	}
	
	public static void main(String[] args){
		AwtContainer awtcontainer=new AwtContainer();
		awtcontainer.showFrame();
		
	}
}
