import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	Button button4 = new Button();
	Button button5 = new Button();
	Button button6 = new Button();
	Label label;
	TextField textfield;
	HBox hBox;
	HBox hBox2;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager = new DataManager();
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	
	FXMainPane() 
	{
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		 button1 = new Button();
		 button2 = new Button();
		 button3 = new Button();
		 button4 = new Button();
		 button5 = new Button();
		 button6 = new Button();
		 label = new Label();
		 textfield = new TextField();
		 hBox = new HBox();
		 hBox2 = new HBox();
		//  instantiate the HBoxes
		
		//student Task #4:
		//  instantiate the DataManager instance
		DataManager dataManager = new DataManager();
		//  set margins and set alignment of the components
		HBox.setMargin(button1, new Insets(15));
		HBox.setMargin(button2, new Insets(15));
		HBox.setMargin(button3, new Insets(15));
		HBox.setMargin(button4, new Insets(15));
		HBox.setMargin(button5, new Insets(15));
		HBox.setMargin(button6, new Insets(15));
		hBox.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		button1.setText("Hello");
		button2.setText("Howdy");
		button3.setText("Chinese");
		button4.setText("Clear");
		button5.setText("Exit");
		button6.setText("French");
		label.setText("Feedback");
		
		
		hBox.getChildren().addAll(button1, button2, button3, button6, button4,  button5);
		hBox2.getChildren().addAll(label, textfield);
		getChildren().addAll(hBox, hBox2);
		
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		button6.setOnAction(new ButtonHandler());

		
	}
	//Task #4:
	//  create a private inner class to handle the button clicks
	 private class ButtonHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event) 
		{
			if(event.getTarget() == button1)
			{
				textfield.setText(dataManager.getHello());
			}
			 if(event.getTarget() == button2)
			{
				textfield.setText(dataManager.getHowdy());
			}
			 if(event.getTarget() == button3)
			{
				textfield.setText(dataManager.getChinese());
			}
			 if(event.getTarget() == button4)
			{
				textfield.setText(" ");
			}
			 if(event.getTarget() == button5)
			{
				Platform.exit(); 
				System.exit(0); 
			}
			 if(event.getTarget() == button6)
			 {
				 textfield.setText(dataManager.getFrench());
			 }
			
		}
	}
}
