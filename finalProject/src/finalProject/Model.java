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

	private String pTQStr;

	String minTask;

	private String curMsg;

	String cDLLStr;

	private String fullStack;

	private String stackStr;

	public Model() {
		myGG = new GuessingGame<String>();
//		myGG.playGame();
		myStack = new Stack<String>();
		myPTQ = new PriorityTask();
		myCDLL = new CircDLL<String>();
	}

	public String getPTQStr() {
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
	}

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

	public void updateGuessing(boolean response) {
		myGG.setGuessing(response);
	} // updateGuessing

	public String getCurGameStr() {
		return (myGG.outputStr);
	} // getCurGameStr
}
