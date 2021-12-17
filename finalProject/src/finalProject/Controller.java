package finalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

	private Model myModel;

	private View myView;

	/** a txt file for storing our PTQ info */
	private File pTQStorage = new File("PTQStorage.txt");
	/** a txt file for storing our CircDLL info */
	private File circDLLStorage = new File("CircDLLStorage.txt");
	/** a txt file for storing our Stack info */
	private File stackStorage = new File("StackStorage.txt");
	/** a txt file for storing our guessing game info */
	private File guessingGameStorage = new File("GGStorage.txt");

	public Controller(View myView) {
		setView(myView);
		initializeData();
	} // constructor

	public void setView(View myView) {
		this.myView = myView;
		myModel = new Model();
	} // setView

	public void updateFirstCol(String str, int priority) {
		myModel.updatePTQ(str, priority);
		myView.updatePTQLP(myModel.getPTQStr());
		myView.updatePTQMP(myModel.minTask);
	} // updateFirstCol

	public void deQ() {
		myModel.deQ();
		myView.updatePTQLP(myModel.getPTQStr());
		myView.updatePTQMP(myModel.minTask);
	} // deQ

	public void updateSecondCol(String str) {
		myModel.updateCDLL(str);
		myView.updateCDLLTA(myModel.getCurMsg());
		myView.updateCDLLPane(myModel.cDLLStr);
	} // updateSecondCol

	public void updateThirdCol(String Str) {
		myModel.updateStack(Str);
		myView.updateStackTA(myModel.getStackStr());
		myView.updateStackPane(myModel.getFullStack());
	} // updateThirdCol

	public void updateGG(boolean response) {
		myModel.updateResponse(response);
		progressGG();
	} // updateGG
	
	public void progressGG() {
		myView.updateGPTA(myModel.getCurGameStr());
		if(myModel.guessingState == false) {
			myView.guessingGamefirstPopUp();
			myView.guessingGameSecondPopUp();
		}
	} // progressGG
	
	public void endGuessing() {
		
	}

<<<<<<< Updated upstream
	public String getCurGameMsg() {
		return myModel.getCurGameStr();
	} // getCurGameMsg

=======
//	public String getCurGameMsg() {
//		return myModel.getCurGameStr();
//	} // getCurGameMsg
	
>>>>>>> Stashed changes
	public void saveChanges() {
		try {
			FileWriter myWriter = new FileWriter(pTQStorage);
			myWriter.write(myModel.pTQStr);
			myWriter.close();

			myWriter = new FileWriter(circDLLStorage);
			myWriter.write(myModel.cDLLStr);
			myWriter.close();

			myWriter = new FileWriter(stackStorage);
			myWriter.write(myModel.stackToStorage());
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initializeData() {
		// PTQ
		readFile(pTQStorage);
		myView.updatePTQLP(myModel.pTQStr);
		myView.updatePTQMP(myModel.minTask);
		// PTQ

		// circDLL
		readFile(circDLLStorage);
		myView.updateCDLLTA(myModel.getCurMsg());
		myView.updateCDLLPane(myModel.cDLLStr);
		// circDLL

		// stack
		readFile(stackStorage);
		myView.updateStackTA(myModel.getStackStr());
		myView.updateStackPane(myModel.getFullStack());
		// stack

//		readFile(guessingGameStorage);
	}

	// TODO add stuff for GuessingGame file
	private void readFile(File myFile) {
		try {
			Scanner myReader = new Scanner(myFile);
			if (myFile == pTQStorage) {
				while (myReader.hasNextLine()) {
					int priority = myReader.nextInt();
					String myTask = myReader.nextLine();
					myModel.updatePTQ(myTask, priority);
				}
			} else if (myFile == circDLLStorage) {
				while (myReader.hasNextLine()) {
					String myMessage = myReader.nextLine();
					myModel.updateCDLL(myMessage);
				}
			} else if (myFile == stackStorage) {
				while (myReader.hasNextLine()) {
					String myMessage = myReader.nextLine();
					myModel.updateStack(myMessage);
				}
//			} else if(myFile == guessingGameStorage) {
//				while(myReader.hasNextLine()) {
//					String myMessage = myReader.nextLine();
//					myModel.updateCDLL(myMessage);
//				}
			} else {
				myReader.close();
				throw new IllegalArgumentException("You cannot read that file.");
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

} // controller
