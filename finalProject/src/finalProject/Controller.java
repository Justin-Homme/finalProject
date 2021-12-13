package finalProject;

import finalProject.PriorityTQ.PriorityTaskQ;
import javafx.event.ActionEvent;

/**
 * The controller class for our control center GUI application.
 * 
 * This class will handle the calls to action made by the user's interaction
 * with the GUI.
 * 
 * The controller interprets these requests and tells our Model what to do.
 * 
 * @author Justin Homme
 * @version Fall 2021
 */

public class Controller extends MainPane {

	/** The Priority Task Queue that we will use for part 1 */
	private PriorityTQ myPTQ;

	/** The stack we will use for part 3 */
	private Stack<String> myStack;

	/** The Guessing game that will be implemented into our GamePane (part 4) */
	private GuessingGame myGG;

	/** The circ doublbly linkedlist used for messages */
	private CircDLL<String> myCDLL;
	private String currentMessage;
	
	private MainPane myMainPane;

	public Controller() {
		// TODO write the constructor
//		myGG = new GuessingGame();
//		myStack = new Stack<String>();
		myPTQ = new PriorityTQ();
//		myCDLL = new CircDLL();
		myMainPane = new MainPane();

	} // constructor

	/**
	 * adds and removes tasks displays highest priority task
	 * 
	 * @param b
	 */
	public void handleTask(ActionEvent b) {
		Column firstCol = myMainPane.getFirstCol();
		if (b.getSource() == firstCol.getAddTaskB()) {
			myPTQ.addPTQ(firstCol.getTextTF().getText(), Integer.parseInt(firstCol.getPriorityTF().getText()));
			firstCol.getMyTA().setText(myPTQ.toString());
			firstCol.getTextTF().setText("");
		} else if (b.getSource() == firstCol.getRemoveTaskB()) {
			myPTQ.list.deleteMin();
			firstCol.getMyTA().setText(myPTQ.toString());
		}
	}
//
//	// adds and removes messages
//	public void handleMessage(ActionEvent b) {
//		if (b.getSource() == addTaskB) {
//			String addMSG = textTF.getText();
//			myCDLL.addItem(addMSG);
//			textTF.setText("");
//		} else if (b.getSource() == removeTaskB) {
//			myCDLL.deleteItem(currentMessage);
//		}
//	}
//
//	// adds and removes tasks and displays top tasks
//	public void handleTaskStack(ActionEvent b) {
//		if (b.getSource() == addTaskB) {
//			String addTask = textTF.getText();
//			myStack.pushTask(addTask);
//			textTF.setText(addTask);
//		} else if (b.getSource() == removeTaskB) {
//			myStack.popTask();
//		}
//	}

	public static void main(String[] args) {

	}
}
