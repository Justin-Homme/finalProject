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
	
//	private StringProperty stackStr;
	private String stackStr;
	
	public Model() {
		myGG = new GuessingGame<String>();
		myStack = new Stack<String>();
		myPTQ = new PriorityTQ();
		myCDLL = new CircDLL<String>();
	}
	
//	public GuessingGame getMyGG() {
//		return myGG;
//	} // getMyGG
//
//	public CircDLL<String> getMyCDLL() {
//		return myCDLL;
//	} // getMyCDLL
//
//	public PriorityTQ getMyPTQ() {
//		return myPTQ;
//	} // getMyPTQ
//
//	public Stack<String> getMyStack() {
//		return myStack;
//	} // getMyStack
//	
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
	
	public void updateStack(String str) {
		myStack.pushTask(str);
		stackStr = myStack.toString();
	} // updateStack
}
