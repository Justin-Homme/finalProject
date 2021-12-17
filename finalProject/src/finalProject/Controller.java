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
		myView.updatePTQLP(myModel.getPTQStr());
		myView.updatePTQMP(myModel.minTask);
	} // updateFirstCol

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
		myModel.updateGuessing(response);
		String myStr = myModel.getCurGameStr();
		myView.updateGPTA(myStr);
	} // updateGG

	public String getCurGameMsg() {
		return myModel.getCurGameStr();
	} // getCurGameMsg

} // controller
