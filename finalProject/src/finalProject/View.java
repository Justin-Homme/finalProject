package finalProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
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
			
			myMainPane.getThirdCol().getAddTaskB().setOnAction(event -> {	// third column addTaskB
				String myStr = myMainPane.getThirdCol().getTextTF().getText();
				myController.updateThirdCol(myStr);
				myMainPane.getThirdCol().getTextTF().setText("");
			});
			
			myTP.getTabs().add(new Tab("Main", myMainPane));

			myListPane = new ListPane(); // the ListPane
			myTP.getTabs().add(new Tab("List", myListPane));

			myGP = new GamePane(); // the GamePane
			myFP.getChildren().add(myGP);
			
			myController = new Controller(this);

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // start
	
	public MainPane getMyMainPane() {
		return myMainPane;
	}
	
	public GamePane getMyGP() {
		return myGP;
	}

	public ListPane getMyListPane() {
		return myListPane;
	}
	
	public void updatePTQTA(String pTQStr) {
		myMainPane.getFirstCol().getMyTA().setText(pTQStr);
	} // updatePTQTA
	
	public void updateStackTA(String stackStr) {
		myMainPane.getThirdCol().getMyTA().setText(stackStr);
	} // updateStackTA
	
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

	public static void main(String[] args) {
		launch(args);
	} // main
} // View
