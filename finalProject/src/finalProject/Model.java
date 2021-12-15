package finalProject;

import javafx.beans.property.StringProperty;

public class Model {
	/** The Priority Task Queue that we will use for part 1 */
	private PriorityTQ myPTQ;

	/** The stack we will use for part 3 */
	private Stack<String> myStack;

	/** The Guessing game that will be implemented into our GamePane (part 4) */
	private GuessingGame myGG;

	/** The circ doublbly linkedlist used for messages */
	private CircDLL<String> myCDLL;
	
	private StringProperty pTQStr;
	
	private StringProperty curMsg;
	
	private StringProperty stackStr;
	
	public Model() {
		myGG = new GuessingGame();
		myStack = new Stack<String>();
		myPTQ = new PriorityTQ();
		myCDLL = new CircDLL();
	}
	
	public GuessingGame getMyGG() {
		return myGG;
	}

	public CircDLL<String> getMyCDLL() {
		return myCDLL;
	}

	public PriorityTQ getMyPTQ() {
		return myPTQ;
	}

	public Stack<String> getMyStack() {
		return myStack;
	}
	
	public StringProperty getPTQStrProperty() {
		return pTQStr;
	}
	
	public String getPTQStr() {
		return pTQStr.get();
	}
	
	public StringProperty getCurMsgProperty() {
		return curMsg;
	}
	
	public String getCurMsg() {
		return curMsg.get();
	}
	
	public StringProperty getStackStrProperty() {
		return stackStr;
	}
	
	public String getStackStr() {
		return stackStr.get();
	}
	
	public void setPTQStr(String str) {
		pTQStr.set(str);
	}
}
