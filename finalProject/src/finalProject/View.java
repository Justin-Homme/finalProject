package finalProject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * The main GUI class that deals with displaying our data to the user
 * 
 * @author Justin Homme
 * @version 12/2/21
 */

public class View extends Application {

	private MainPane myMainPane;

	private GamePane myGP;

	private ListPane myListPane;

	private Controller myController;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 625, 500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Control Center");

			TabPane myTP = new TabPane(); // the TabPane for our Main tab and our List tab
			myTP.setPrefSize(450, 500); // set to only take up so much of the width of the root
			root.setLeft(myTP);

			FlowPane myFP = new FlowPane(); // the FlowPane to hold our GamePane
			myFP.setPrefSize(175, 500); // set to take up the remaining width of the root
			root.setRight(myFP);

			myMainPane = new MainPane(); // the MainPane
			myMainPane.getFirstCol().getAddTaskB().setOnAction(event -> {
				String mystr = myMainPane.getFirstCol().getTextTF().getText();
				int priority = Integer.parseInt(myMainPane.getFirstCol().getPriorityTF().getText());
				myController.updateFirstCol(mystr, priority);
				myMainPane.getFirstCol().getTextTF().setText("");
				myMainPane.getFirstCol().getPriorityTF().setText("");
			});

			myMainPane.getSecondCol().getAddTaskB().setOnAction(event -> {
				String string = myMainPane.getSecondCol().getTextTF().getText();
				myController.updateSecondCol(string);
				myMainPane.getSecondCol().getTextTF().setText("");
			});

			myMainPane.getThirdCol().getAddTaskB().setOnAction(event -> { // third column addTaskB
				String myStr = myMainPane.getThirdCol().getTextTF().getText();
				myController.updateThirdCol(myStr);
				myMainPane.getThirdCol().getTextTF().setText("");
			});
			// myMainPane.getThirdCol().getRemoveTaskB().setOnAction(event -> { // third
			// column addTaskB
			// getStackStr.popTask();
			// }

			myTP.getTabs().add(new Tab("Main", myMainPane));

			myListPane = new ListPane(); // the ListPane
			myTP.getTabs().add(new Tab("List", myListPane));

			myGP = new GamePane(); // the GamePane
			
			myGP.getYesB().setOnAction(event -> {
				myController.updateGG(true);
			});
			
			myGP.getNoButton().setOnAction(event -> {
				myController.updateGG(false);
			});
			
			myFP.getChildren().add(myGP);
			
			myController = new Controller(this);

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // start

	public void updatePTQTA(String pTQStr) {
		myMainPane.getFirstCol().getMyTA().setText(pTQStr);
		myListPane.getMyTA().setText(pTQStr);
	} // updatePTQTA

	public void updateCDLLTA(String curMsg) {
		myMainPane.getSecondCol().getMyTA().setText(curMsg);
		myListPane.getMyTA().setText(curMsg);
	} // updateCDLLTA

	public void updateStackTA(String stackStr) {
		myMainPane.getThirdCol().getMyTA().setText(stackStr);
		myListPane.getMyTA().setText(stackStr);
	} // updateStackTA
	
	public void updateGPTA(String str) {
		myGP.getMyTA().setText(str);
	}

//	public class Timer extends Controller {

//		private Timer timer;

//		private void rotateMessage() {
//			if (getCurMSG().equals(getMyCDLL().getPrev())) {
//				getCurMSG().equals(getMyCDLL().getNxt());
//			}
//		}

//		public void timer(int seconds) {
//			timer = new Timer();
//			timer.schedule(new showMSG(), seconds * 1000);
//		}

//		public void schedule(String msg , int time)
//		msg = getCurMSG();

//		class showMSG extends TimerTask {

//			@Override
//			public void run() {
//				rotateMessage();
//				getMyTA().setText(getCurMSG());
//				timer.cancel();
//				timer(5);
//			}
//		}

//	}
	
	public class Popup {
	    
		public void display() {
		Stage popupwindow=new Stage();
		      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		VBox layout= new VBox(10);
	      
		layout.setAlignment(Pos.CENTER);
		Label myLabel = new Label("What did you eat for Breakfast?");
		Button submitB = new Button("Submit");
		TextField myTF = new TextField();
		myTF.setPrefWidth(50);
		layout.getChildren().addAll(myLabel, myTF, submitB);
		      
		Scene scene1= new Scene(layout, 300, 250);
		      
		popupwindow.setScene(scene1);
		      
		popupwindow.showAndWait();
		       
		}

	}

	public static void main(String[] args) {
		launch(args);
	} // main
} // View
