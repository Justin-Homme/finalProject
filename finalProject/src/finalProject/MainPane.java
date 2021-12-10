package finalProject;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

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
	private TextArea newTA;
	private Button addTaskB;
	private Button removeTaskB;
	private Button addMessageB;
	private Button removeMessageB;
	private Button addToListB;
	private Button removeFromListB;

	public MainPane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(450, 500);

		myTA = new TextArea(); // the first column
		myTA.setPrefSize(150, 200);
		myTA.setText("Priority Task");
		newTA = new TextArea();
		newTA.setPrefSize(150, 200);
		newTA.setText("Insert New Task Here");
		addTaskB = new Button("+");
		removeTaskB = new Button("-");

		HBox buttonHB = new HBox();
		buttonHB.setSpacing(10);
		buttonHB.setPadding(new Insets(20, 20, 20, 20));
		buttonHB.getChildren().add(addTaskB);
		buttonHB.getChildren().add(removeTaskB);

		GridPane myGP = new GridPane();
		myGP.add(myTA, 0, 0, 1, 1);
		myGP.add(newTA, 0, 1, 1, 1);
		myGP.add(buttonHB, 0, 2, 1, 2);
		temp.getChildren().add(myGP);

		myTA = new TextArea(); // the second column
		myTA.setPrefSize(150, 200);
		myTA.setText("Current Message");
		newTA = new TextArea();
		newTA.setPrefSize(150, 200);
		newTA.setText("Insert New Message Here");
		addMessageB = new Button("+");
		removeMessageB = new Button("-");

		HBox buttonHB2 = new HBox();
		buttonHB2.setSpacing(10);
		buttonHB2.setPadding(new Insets(20, 20, 20, 20));
		buttonHB2.getChildren().add(addMessageB);
		buttonHB2.getChildren().add(removeMessageB);

		GridPane myGP2 = new GridPane();
		myGP2.add(myTA, 0, 0, 1, 1);
		myGP2.add(newTA, 0, 1, 1, 1);
		myGP2.add(buttonHB2, 0, 2, 1, 2);
		temp.getChildren().add(myGP2);

		myTA = new TextArea(); // the third column
		myTA.setPrefSize(150, 200);
		myTA.setText("List of Tasks");
		newTA = new TextArea();
		newTA.setPrefSize(150, 200);
		newTA.setText("Insert New Task Here");
		addToListB = new Button("+");
		removeFromListB = new Button("-");

		HBox buttonHB3 = new HBox();
		buttonHB3.setSpacing(10);
		buttonHB3.setPadding(new Insets(20, 20, 20, 20));
		buttonHB3.getChildren().add(addToListB);
		buttonHB3.getChildren().add(removeFromListB);

		GridPane myGP3 = new GridPane();
		myGP3.add(myTA, 0, 0, 1, 1);
		myGP3.add(newTA, 0, 1, 1, 1);
		myGP3.add(buttonHB3, 0, 2, 1, 2);
		temp.getChildren().add(myGP3);

		getChildren().add(temp);

	} // constructor

}
