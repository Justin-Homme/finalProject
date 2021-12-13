package finalProject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * The MainPane class to be used for the Main tab in our TabPane
 * 
 * This class extends GridPane so we can have multiple columns and rows for
 * customization
 * 
 * @author Justin Homme
 * @version Fall 2021
 */

public class MainPane extends GridPane {
	
	/** the column for the PriorityTQ */
	private Column firstCol;
	/** the column for the CircDoubLL */
	private Column secondCol;
	/** the column for the Stack */
	private Column thirdCol;

	/** HBox for holding add and remove buttons */
	private HBox buttonHB;
	/** VBox for holding the buttonHB and TextField */
	private VBox myVB;
	
	private Controller myController;

	public MainPane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(450, 500);

		GridPane myGP = new GridPane();

		// begin first column
		firstCol = new Column();
		firstCol.addPriorityTF();	// we need a priority TF for this column
		myGP.add(firstCol, 0, 0);
		// end first column

		// begin second column
		secondCol = new Column();
		myGP.add(secondCol, 1, 0);
		// end second column

		// begin third column
		thirdCol = new Column();
		myGP.add(thirdCol, 2, 0);
		// end third column

		// add all to temp
		temp.getChildren().add(myGP);
		getChildren().add(temp);
	} // constructor

	public Column getFirstCol() {
		return firstCol;
	}
	
	// ask Albing if this visibility is ok
	protected class Column extends GridPane {
		/** a button for adding tasks*/
		private Button addTaskB;
		/** a button for removing tasks */
		private Button removeTaskB;
		/** TextArea for displaying text */
		private TextArea myTA;
		/** TextField for the text to be added */
		private TextField textTF;
		/** a TextField for the priority that will only be added via addPriorityTF method */
		private TextField priorityTF;
		/** HBox for textFields*/
		private HBox txtFHB;
		
		public Column() {
			super();
			
			myTA = new TextArea();
			myTA.setPrefSize(150, 300);
			myTA.setEditable(false);
			
			addTaskB = new Button("Add");
			removeTaskB = new Button("Remove");
//			removeTaskB.setOnAction((EventHandler<ActionEvent>) this);
			
			buttonHB = new HBox();
			buttonHB.setSpacing(10);
			buttonHB.setPadding(new Insets(20, 0, 20, 0));
			buttonHB.getChildren().add(addTaskB);
			buttonHB.getChildren().add(removeTaskB);
			
			textTF = new TextField();
			textTF.setPrefSize(110, 50);
			
			txtFHB = new HBox();
			txtFHB.setAlignment(Pos.CENTER);
			txtFHB.getChildren().add(textTF);
			
			myVB = new VBox();
			myVB.setPrefSize(150, 100);
			myVB.setPadding(new Insets(20, 20, 20, 20));
			myVB.setAlignment(Pos.CENTER);
			myVB.getChildren().add(txtFHB);
			myVB.getChildren().add(buttonHB);
			
			this.add(myTA, 0, 0);
			this.add(myVB, 0, 1);
		} // constructor
		
		public Button getAddTaskB() {
			return addTaskB;
		} // getAddTaskB

		public Button getRemoveTaskB() {
			return removeTaskB;
		} // getRemoveTaskB
		
		public TextField getTextTF() {
			return textTF;
		} // getTextTF
		
		public TextField getPriorityTF() throws IllegalArgumentException {
			if(priorityTF == null) {
				throw new IllegalArgumentException("There is no priority text field for this column.");
			} else {
				return priorityTF;
			}	
		} // getPriorityTF
		
		public TextArea getMyTA() {
			return myTA;
		} // getMyTA
		
		public void addPriorityTF() {
			textTF.setPrefWidth(75);
			priorityTF = new TextField();
			priorityTF.setPrefSize(35, 50);
			txtFHB.getChildren().add(0, priorityTF);
		} // addPriorityTF
		
	} // Column class
} // MainPane class
