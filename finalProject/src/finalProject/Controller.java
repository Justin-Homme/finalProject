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
			myPTQ.insert(new PriorityTQ(myTF1.getText()));
			myTA.setText(PriorityTQ.findMin().task);
			myTF1.setText("");
		} else if (b.getSource() == removeTaskB1) {
			myPTQ.deleteMin();
			myTA.setText(list.findMin().task);
		}
	}

	public void handleMessage(ActionEvent b) {
		if (b.getSource() == addTaskB2) {
			LinkedMSGS.insert(new LinkedMSGS(myTF2.getText()));
			myTF2.setText("");
		} else if (b.getSource() == removeTaskB2) {
			LinkedMSGS.insert(new LinkedMSGS(myTF2.getText()));
			myTF2.setText("");
		}
	}

	public void handleTaskStack(ActionEvent b) {
		if (b.getSource() == addTaskB2) {
			Stack.insert(new PriorityTaskQ(myTF3.getText()));
			myTA.setText(list.findMin().task);
			myTF3.setText("");
		} else if (b.getSource() == addTaskB2) {
			list.insert(new PriorityTaskQ(myTF3.getText()));
			myTA.setText(list.findMin().task);
			myTF3.setText("");
		}
	}

	public static void main(String[] args) {

	}
}
