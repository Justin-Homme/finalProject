package finalProject;

import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 * The GamePane Class that sets up the pane to display our guessing game in our
 * control center
 * 
 * @author Justin Homme
 * @version Fall 2021
 */

public class GamePane extends GridPane {

	/** a text area to show a temporary test message */
	private TextArea myTA;

	public GamePane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(175, 500);

		myTA = new TextArea();
		myTA.setPrefSize(175, 500);
		myTA.setText("This is our Game Pane");

		temp.getChildren().add(myTA);
		getChildren().add(temp);

	} // constructor
}
