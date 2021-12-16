package finalProject;

import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 * The ListPane class to be used for the List tab in our TabPane
 * 
 * This class extends GridPane so we can have multiple columns and rows for
 * customization
 * 
 * @author Justin Homme
 * @version Fall 2021
 */
public class ListPane extends GridPane {

	/** a TextArea to show a temporary test message */
	private TextArea myTA;

	// TODO change a lot of stuff, this is currently just set up as a test
	// right now this is a similar setup to MainPane, but will have a different
	// layout in the future

	public ListPane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(450, 500);

		myTA = new TextArea(); // the first column
		myTA.setPrefSize(150, 500);
		myTA.setText("This is a List test");
		temp.getChildren().add(myTA);

		myTA = new TextArea(); // the second column
		myTA.setPrefSize(150, 500);
		myTA.setText("This is also a List test");
		temp.getChildren().add(myTA);

		myTA = new TextArea(); // the third column
		myTA.setPrefSize(150, 500);
		myTA.setText("Also a List test");
		temp.getChildren().add(myTA);

		getChildren().add(temp);

	} // constructor

	public TextArea getMyTA() {
		return myTA;
	}

}
