package finalProject;

import finalProject.MainPane.Column;
import finalProject.PriorityTQ.PriorityTaskQ;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

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

	Model myModel;
	
	String stackStr;
	
	View myView;
	
	public Controller(View myView) {
//		// TODO write the constructor
//		myGG = new GuessingGame();
//		myStack = new Stack<String>();
//		myPTQ = new PriorityTQ();
//		myCDLL = new CircDLL();
//		myMainPane = new MainPane(this);
		setView(myView);
	} // constructor
	
	public void setView(View myView) {
		
		this.myView = myView;
		
		myModel = new Model();
		
		Column firstCol = myView.getMyMainPane().getFirstCol();
		Column secondCol = myView.getMyMainPane().getSecondCol();
		Column thirdCol = myView.getMyMainPane().getThirdCol();
//		
//		
//		firstCol.getMyTA().textProperty().bind(myModel.getPTQStrProperty());
//		secondCol.getMyTA().textProperty().bind(myModel.getCurMsgProperty());
//		thirdCol.getMyTA().textProperty().bind(myModel.getStackStrProperty());
		
		firstCol.getAddTaskB().setOnAction(event -> {
			String taskStr = firstCol.getTextTF().getText();
			int taskPriority = Integer.parseInt(firstCol.getPriorityTF().getText());
			
			myModel.getMyPTQ().addPTQ(taskStr, taskPriority);
			myModel.setPTQStr(myModel.getMyPTQ().toString());
			event.consume();
		});
	}
	
	public void updateThirdCol(String Str) {
		myModel.updateStack(Str);
		myView.updateStackTA(myModel.getStackStr());
	}
	

//	public GuessingGame getMyGG() {
//		return myGG;
//	}
//
//	public CircDLL<String> getMyCDLL() {
//		return myCDLL;
//	}
//
//	public String getCurMSG() {
//		return currentMessage;
//	}
//	
//	public MainPane getMyMainPane() {
//		return myMainPane;
//	}
//	
//	public PriorityTQ getMyPTQ() {
//		return myPTQ;
//	}
//
//	public Stack<String> getMyStack() {
//		return myStack;
//	}

	
//	@Override
//	public void handle(ActionEvent b) {
//		Column firstCol = myMainPane.getFirstCol();
//		Column thirdCol = myMainPane.getThirdCol();
//		if(b.getSource() == firstCol.getAddTaskB()) {
//			myPTQ.addPTQ(firstCol.getTextTF().getText(), Integer.parseInt(firstCol.getPriorityTF().getText()));
//			firstCol.getMyTA().setText(getMyPTQ().toString());
//			firstCol.getTextTF().setText("");
//			firstCol.getPriorityTF().setText("");
//		} else if(b.getSource() == thirdCol.getAddTaskB()) {
//			String addTask = thirdCol.getTextTF().getText();
//			myStack.pushTask(addTask);
//			thirdCol.displayTxt = myStack.toString();
//			thirdCol.getMyTA().setText(thirdCol.displayTxt);
//			thirdCol.getTextTF().setText("");
//		}
//			
//	}

//	/**
//	 * adds and removes tasks displays highest priority task
//	 * 
//	 * @param b
//	 */
//	public void handleTask(ActionEvent b) {
//		Column firstCol = myMainPane.getFirstCol();
//		if (b.getSource() == firstCol.getAddTaskB()) {
//			myPTQ.addPTQ(firstCol.getTextTF().getText(), Integer.parseInt(firstCol.getPriorityTF().getText()));
//			firstCol.getMyTA().setText(myPTQ.toString());
//			firstCol.getTextTF().setText("");
//		} else if (b.getSource() == firstCol.getRemoveTaskB()) {
//			myPTQ.list.deleteMin();
//			firstCol.getMyTA().setText(myPTQ.toString());
//		}
//	}
//
//	// adds and removes messages
//	public void handleMessage(ActionEvent b) {
//		Column secondCol = myMainPane.getSecondCol();
//		if (b.getSource() == secondCol.getAddTaskB()) {
//			String addMSG = secondCol.getTextTF().getText();
//			myCDLL.addItem(addMSG);
//			secondCol.getTextTF().setText("");
//		} else if (b.getSource() == secondCol.getRemoveTaskB()) {
//			myCDLL.deleteItem(currentMessage);
//		}
//	}
//
//	// adds and removes tasks and displays top tasks
//	public void handleTaskStack(ActionEvent b) {
//		Column thirdCol = myMainPane.getThirdCol();
//		if (b.getSource() == thirdCol.getAddTaskB()) {
//			String addTask = thirdCol.getTextTF().getText();
//			myStack.pushTask(addTask);
//			thirdCol.getTextTF().setText(addTask);
//		} else if (b.getSource() == thirdCol.getRemoveTaskB()) {
//			myStack.popTask();
//		}
//	}
//
//	public static void main(String[] args) {
//
//	}

//	@Override
//	public void handle(ActionEvent b) {
//		Column secondCol = myMainPane.getSecondCol();
//		if (b.getSource() == secondCol.getAddTaskB()) {
//			handleTask(b);
//		}
//		
//	}
}
