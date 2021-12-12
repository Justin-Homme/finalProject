package finalProject;

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

	public Controller() {
		// TODO write the constructor
		myGG = new GuessingGame();
		myStack = new Stack();
		myPTQ = new PriorityTQ(dirtyChildren);
	} // constructor

	public void handleTask(ActionEvent b) {
		if (b.getSource() == addTaskB1) {
			myPTQ.insert(new PriorityTaskQ(myTF1.getText()));
			myTA.setText(PriorityTQ.findMin().task);
			myTF1.setText("");
		} else if (b.getSource() == removeTaskB1) {
			myPTQ.deleteMin();
			myTA.setText(myPTQ.findMin().task);
		}
	}

	public void handleMessage(ActionEvent b) {
		if (b.getSource() == addTaskB2) {
			LinkedMSGS.add(new LinkedMSGS(myTF2.getText()));
			myTF2.setText("");
		} else if (b.getSource() == removeTaskB2) {
			LinkedMSGS.delete(new LinkedMSGS(myTF2.getText()));
			myTF2.setText("");
		}
	}

	public void handleTaskStack(ActionEvent b) {
		if (b.getSource() == addTaskB3) {
			String addTask = myTF2.getText();
			myStack.pushTask(addTask);
		} else if (b.getSource() == removeTaskB3) {
			myStack.popTask();
		}
	}

	public static void main(String[] args) {

	}
}
