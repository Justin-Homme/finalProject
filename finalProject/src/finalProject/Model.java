package finalProject;

public class Model {
	/** The Priority Task Queue that we will use for part 1 */
	private PriorityTQ myPTQ;

	/** The stack we will use for part 3 */
	private Stack<String> myStack;

	/** The Guessing game that will be implemented into our GamePane (part 4) */
	private GuessingGame myGG;

	/** The circ doublbly linkedlist used for messages */
	private CircDLL<String> myCDLL;

	private String pTQStr;

	private String curMsg;
	
	String cDLLStr;

	private String stackStr;

	public Model() {
		myGG = new GuessingGame<String>();
//		myGG.playGame();
		myStack = new Stack<String>();
		myPTQ = new PriorityTQ();
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

	public void updatePTQ(String str, int priority) {
		myPTQ.addPTQ(str, priority);
		pTQStr = myPTQ.toString();
	} // updatePTQ

	public void updateCDLL(String str) {
		myCDLL.addItem(str);
		curMsg = myCDLL.getCurData();
		cDLLStr = myCDLL.toString();
	} // updateCDLL

	public void updateStack(String str) {
		myStack.pushTask(str);
		stackStr = myStack.toString();
	} // updateStack
	
	public void updateGuessing(boolean response) {
		myGG.setGuessing(response);
	} // updateGuessing
	
	public String getCurGameStr() {
		return(myGG.outputStr);
	} // getCurGameStr
}
