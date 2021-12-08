package finalProject;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 * The MainPane class to be used for the Main tab in our TabPane
 * 
 * This class extends GridPane so we can have multiple columns and rows for
 * customization
 * 
 * @author Justin Homme
 * @version Fall 2021
 */

public class MainPane extends GridPane implements EventHandler<ActionEvent> {

	/** a TextArea to show a temporary test message */
	private TextArea myTA;
	private Button addTaskB;

	public MainPane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(450, 500);

		myTA = new TextArea(); // the first column
		myTA.setPrefSize(150, 500);
		myTA.setText("This is a test");
		temp.getChildren().add(myTA);
		addTaskB = new Button("+");
		addTaskB.setOnAction

		myTA = new TextArea(); // the second column
		myTA.setPrefSize(150, 500);
		myTA.setText("This is also a test");
		temp.getChildren().add(myTA);

		myTA = new TextArea(); // the third column
		myTA.setPrefSize(150, 500);
		myTA.setText("Also a test");
		temp.getChildren().add(myTA);

		getChildren().add(temp);

	} // constructor

}
