package finalProject;

public class Model {
	/** The Priority Task Queue that we will use for part 1 */
	private PriorityTask myPTQ;

	/** The stack we will use for part 3 */
	private Stack<String> myStack;

	/** The Guessing game that will be implemented into our GamePane (part 4) */
	private GuessingGame myGG;

	/** The circ doublbly linkedlist used for messages */
	private CircDLL<String> myCDLL;

	String pTQStr;

	String minTask;

	private String curMsg;

	String cDLLStr;

	private String fullStack;

	private String stackStr;
	
	boolean guessingState;

	public Model() {
		myGG = new GuessingGame<String>();
//		myGG.playGame();
		myStack = new Stack<String>();
		myPTQ = new PriorityTask();
		myCDLL = new CircDLL<String>();
	}

	String getPTQStr() {
		return pTQStr;
	} // getPTQStr

	public String getCurMsg() {
		return curMsg;
	} // getCurMsg

	public String getStackStr() {
		return stackStr;
	} // getStackStr

	public String getFullStack() {
		return fullStack;
	}

	public void updatePTQ(String str, int priority) {
		myPTQ.addPT(str, priority);
		pTQStr = myPTQ.toString();
		minTask = myPTQ.minTask.getTask();
	} // updatePTQ

	public void deQ() {
		myPTQ.deleteMin();
		pTQStr = myPTQ.toString();
		minTask = myPTQ.minTask.getTask();
	} // deQ

	public void updateCDLL(String str) {
		myCDLL.addItem(str);
		curMsg = myCDLL.getCurData();
		cDLLStr = myCDLL.toString();
	} // updateCDLL

	public void updateStack(String str) {
		myStack.pushTask(str);
		fullStack = myStack.getFullStack();
		stackStr = myStack.toString();
	} // updateStack

	public void updateResponse(boolean response) {
		myGG.setResponse(response);
		guessingState = myGG.guessing;
	} // updateGuessing

	public String getCurGameStr() {
		return (myGG.outputStr);
	} // getCurGameStr

	private Stack<String> reverseStack(Stack<String> myStack) {
		Stack<String> reverseStack = new Stack<>();
		while (!myStack.isEmpty()) {
			reverseStack.pushTask(myStack.popTask());
		}
		return reverseStack;
	} // reverseStack

	public String stackToStorage() {
		Stack<String> reverseStack = reverseStack(myStack);
		String myStr = "";
		while (!reverseStack.isEmpty()) {
			myStr += reverseStack.popTask() + "\n";
		}
		return myStr;
	} // stackToStorage
<<<<<<< Updated upstream
=======
	
	public String getCDLLFileStr() {
		cDLL_FileStr = myCDLL.getFileString();
		return cDLL_FileStr;
	}
	
	public void playMyGG() {
		
	}
>>>>>>> Stashed changes
}
