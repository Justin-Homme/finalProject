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

	/** a TextArea to show a temporary test message */
	private TextArea myTA;

	/** add task button for the PriorityTQ */
	private Button addTaskB1;
	/** remove task button for the PriorityTQ */
	private Button removeTaskB1;
	/** TextField for the PriorityTQ */
	private TextField myTF1;
	/** TextField for int Priority */
	private TextField myintTF1;

	/** add task button for the CircDoubLL */
	private Button addTaskB2;
	/** remove task button for the CircDoubLL */
	private Button removeTaskB2;
	/** TextField for the CircBoubLL */
	private TextField myTF2;

	/** add task button for the Stack */
	private Button addTaskB3;
	/** remove task button for the Stack */
	private Button removeTaskB3;
	/** TextField for the Stack */
	private TextField myTF3;

	/** HBox for holding add and remove buttons */
	private HBox buttonHB;
	/** VBox for holding the buttonHB and TextField */
	private VBox myVB;

	/** GridPane for holding buttonHB and myVB */

	public MainPane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(450, 500);

		GridPane myGP = new GridPane();

		// begin first column
		myTA = new TextArea();
		myTA.setPrefSize(150, 300);
		myTA.setText("This is a test");
		myTA.setEditable(false);
		addTaskB1 = new Button("Add");
		addTaskB1.setOnAction((EventHandler<ActionEvent>) this);
		removeTaskB1 = new Button("Remove");
		removeTaskB1.setOnAction((EventHandler<ActionEvent>) this);

		buttonHB = new HBox();
		buttonHB.setSpacing(10);
		buttonHB.setPadding(new Insets(20, 0, 20, 0));
		buttonHB.getChildren().add(addTaskB1);
		buttonHB.getChildren().add(removeTaskB1);

		myTF1 = new TextField();
		myTF1.setPrefSize(50, 50);
		myintTF1.setPrefSize(10, 10);

		myVB = new VBox();
		myVB.setPrefSize(150, 100);
		myVB.setPadding(new Insets(20, 20, 20, 20));
		myVB.setAlignment(Pos.CENTER);
		myVB.getChildren().add(myTF1);
		myVB.getChildren().add(myintTF1);
		myVB.getChildren().add(buttonHB);

		myGP.add(myTA, 0, 0);
		myGP.add(myintTF1, 0, 0);
		myGP.add(myVB, 0, 1);
		// end first column

		// begin second column
		myTA = new TextArea();
		myTA.setPrefSize(150, 300);
		myTA.setText("This is also a test");
		myTA.setEditable(false);
		addTaskB2 = new Button("Add");
		removeTaskB2 = new Button("Remove");

		buttonHB = new HBox();
		buttonHB.setSpacing(10);
		buttonHB.setPadding(new Insets(20, 0, 20, 0));
		buttonHB.getChildren().add(addTaskB2);
		buttonHB.getChildren().add(removeTaskB2);

		myTF2 = new TextField();
		myTF2.setPrefSize(50, 50);

		myVB = new VBox();
		myVB.setPrefSize(150, 100);
		myVB.setPadding(new Insets(20, 20, 20, 20));
		myVB.setAlignment(Pos.CENTER);
		myVB.getChildren().add(myTF2);
		myVB.getChildren().add(buttonHB);

		myGP.add(myTA, 1, 0);
		myGP.add(myVB, 1, 1);
		// end second column

		// begin third column
		myTA = new TextArea();
		myTA.setPrefSize(150, 300);
		myTA.setText("Also a test");
		myTA.setEditable(false);
		addTaskB3 = new Button("Add");
		removeTaskB3 = new Button("Remove");

		buttonHB = new HBox();
		buttonHB.setSpacing(10);
		buttonHB.setPadding(new Insets(20, 0, 20, 0));
		buttonHB.getChildren().add(addTaskB3);
		buttonHB.getChildren().add(removeTaskB3);

		myTF3 = new TextField();
		myTF3.setPrefSize(50, 50);

		myVB = new VBox();
		myVB.setPrefSize(150, 100);
		myVB.setPadding(new Insets(20, 20, 20, 20));
		myVB.setAlignment(Pos.CENTER);
		myVB.getChildren().add(myTF3);
		myVB.getChildren().add(buttonHB);

		myGP.add(myTA, 2, 0);
		myGP.add(myVB, 2, 1);
		// end third column

		// add all to temp
		temp.getChildren().add(myGP);
		getChildren().add(temp);

	} // constructor

	private class Column extends GridPane {
		
	}
}
