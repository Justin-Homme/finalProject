package finalProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * The main GUI class that deals with displaying our
 * data to the user
 * 
 * @author Justin Homme
 * @version 12/2/21
 */

public class View extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 625, 500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Control Center");
			
			TabPane myTP = new TabPane();	// the TabPane for our Main tab and our List tab
			myTP.setPrefSize(450, 500);		// set to only take up so much of the width of the root
			root.setLeft(myTP);				
			
			FlowPane myFP = new FlowPane();	// the FlowPane to hold our GamePane
			myFP.setPrefSize(175, 500); 	// set to take up the remaining width of the root
			root.setRight(myFP);
			
			MainPane myMainTab = new MainPane();	// the MainPane
			myTP.getTabs().add(new Tab("Main", myMainTab));
			
			GamePane myGP = new GamePane();	// the GamePane
			myFP.getChildren().add(myGP);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // start
	
	public static void main(String[] args) {
		launch(args);
	} // main
} // View
