package finalProject;

import javafx.scene.control.Button;
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
	
	private Button yesB;
	
	private Button noB;

	public GamePane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(175, 500);

		myTA = new TextArea();
		myTA.setPrefSize(175, 350);
		myTA.setText("This is our Game Pane");
		
		GridPane myGP = new GridPane();
		myGP.setHgap(10);
		myGP.setVgap(10);
		
		yesB = new Button("Yes");
		myGP.add(yesB, 0, 0);
		
		noB = new Button("No");
		myGP.add(noB, 1, 0);

		temp.getChildren().add(myTA);
		temp.getChildren().add(myGP);
		getChildren().add(temp);

	} // constructor
}
