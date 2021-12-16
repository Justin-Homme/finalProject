package finalProject;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

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
	/** a button for answering yes */
	private Button yesB;
	/** a button for answering no */
	private Button noB;

	public GamePane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(175, 500);

		myTA = new TextArea();
		myTA.setPrefSize(175, 350);
		myTA.setText("This is our Game Pane");

		FlowPane myFP = new FlowPane();
		myFP.setPrefSize(175, 150);
		myFP.setAlignment(Pos.CENTER);

		HBox myHBox = new HBox();
		myHBox.setAlignment(Pos.CENTER);
		myHBox.setSpacing(20);
		yesB = new Button("Yes");
		myHBox.getChildren().add(yesB);

		noB = new Button("No");
		myHBox.getChildren().add(noB);

		myFP.getChildren().add(myHBox);

		temp.getChildren().add(myTA);
		temp.getChildren().add(myFP);
		getChildren().add(temp);

	} // constructor
	
	public Button getYesB() {
		return yesB;
	}
	
	public Button getNoButton() {
		return noB;
	}
	
	public TextArea getMyTA(){
		return myTA;
	}
}
