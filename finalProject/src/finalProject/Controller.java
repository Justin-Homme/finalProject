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

	private Model myModel;

	private View myView;

	public Controller(View myView) {
		setView(myView);
	} // constructor

	public void setView(View myView) {
		this.myView = myView;
		myModel = new Model();
	} // setView

	public void updateFirstCol(String str, int priority) {
		myModel.updatePTQ(str, priority);
		myView.updatePTQTA(myModel.getPTQStr());
	} // updateFirstCol

	public void updateSecondCol(String string) {
		myModel.updateCDLL(string);
		myView.updateCDLLTA(myModel.getCurMsg());
	} // updateSecondCol

	public void updateThirdCol(String Str) {
		myModel.updateStack(Str);
		myView.updateStackTA(myModel.getStackStr());
	} // updateThirdCol
} // controller
