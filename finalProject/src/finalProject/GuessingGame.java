package finalProject;

import java.util.Scanner;

/**
 * The user interface class to drive the animal guessing game
 * 
 * @author Justin Homme and Anna Garfield
 * @version 12/8/21
 */

//TODO change this class to fit what we want for the final project

public class GuessingGame<T> {

	BinaryTree<String> myTree = new BinaryTree<>();
	Scanner in = new Scanner(System.in);
	/** a boolean value that says if we are currently guessing */
	private boolean guessing;
	/** a boolean value that represents the response of the player */
	private boolean response;
	
	String outputStr;

	public GuessingGame() {
		resetTree();
	} // constructor

	private boolean isGuessing() {
		return guessing;
	} // isGuessing

	/**
	 * set guessing to true or false
	 * 
	 * @param guessing true if guessing, false if not guessing
	 */
	public void setGuessing(boolean guessing) {
		this.guessing = guessing;
	} // setGuessing

	/**
	 * takes in the user's response: Y for yes and N for no
	 * 
	 * @throws IllegalArgumentException if the response is not "Y" or "N"
	 */
	private void setResponse(boolean response) {
		this.response = response;
	} // setResponse

	/**
	 * @return true or false, depending on the user's past response
	 */
	private boolean getResponse() {
		return response;
	} // getResponse

	private void addBreakfast(String breakfast) {
		myTree.addRightData(breakfast);
	} // addBreakfast

	private void addQuestion() {
		myTree.addLeftData();
		outputStr = ("What is a question that you would answer yes to " + myTree.getCurData() + " and no to "
				+ myTree.getRightData() + "?");
		myTree.addQuestion(in.nextLine());
	} // addQuestion

	/**
	 * a method only called by the constructor to set the preset tree
	 */
	private void resetTree() {
		BinaryTree<String> cereal = new BinaryTree<String>("cereal", null, null);
		BinaryTree<String> pancakes = new BinaryTree<String>("pancakes", null, null);
		myTree = new BinaryTree<String>("Was your breakfast in a bowl?", cereal, pancakes);
	} // resetTree

	private void traverseTree() {
		if (response == true) {
			myTree.traverseLeft();
		} else {
			myTree.traverseRight();
		}
	} // traverseTree

	public void playGame() {
		myTree.setCurrent(myTree.getRoot());
		setGuessing(true);

		outputStr = "Did you eat breakfast? Let's see if I can guess what you ate.";
		while (isGuessing() == true) {
			if (myTree.isLeaf() == false) {
				outputStr = myTree.getCurData() + " (Y/N)";
//				setResponse();
//				traverseTree();
			} else {
				outputStr ="You are thinking of a " + myTree.getCurData() + ". Am I right? (Y/N)";
				setGuessing(false);
			}
		}
		try {
//			setResponse();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
//			setResponse();
		}
		if (getResponse() == false) {
			outputStr = "Darn! What breakfast were you thinking of?";
//			addBreakfast();
//			addQuestion();
		} else {
			outputStr = "Guessed it!";
		}
	} // playGame

//	public static void main(String[] args) {
//		GuessingGame<String> myAGG = new GuessingGame<>();
//
//		int i = 1;
//		while (i > 0) { // infinite loop since we want to keep playing
//			myAGG.playGame();
//			System.out.println("Let's play again");
//		}
//	} // main
}
