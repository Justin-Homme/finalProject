package finalProject;

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

public class Controller {

	/** BinaryMinHeap to sort task priority */
	private BinaryMinHeap tasks;

	/** The Priority Task Queue that we will use for part 1 */
	private PriorityTQ myPTQ;

	/** The stack we will use for part 3 */
	private Stack myStack;

	/** The Guessing game that will be implemented into our GamePane (part 4) */
	private GuessingGame myGG;

	public Controller() {
		// TODO write the constructor
		myGG = new GuessingGame();
		myStack = new Stack();
		myPTQ = new PriorityTQ();
	} // constructor

	public static void main(String[] args) {

	}
}
