package finalProject;

import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 * The ListPane class to be used for the List tab in our TabPane
 * 
 * This class extends GridPane so we can have multiple columns and rows for
 * customization
 * 
 * @author Justin Homme
 * @version Fall 2021
 */
public class ListPane extends GridPane {

	/** a TextArea to show a temporary test message */
	private TextArea myTA1;
	private TextArea myTA2;
	private TextArea myTA3;

	public ListPane() {
		super();
		FlowPane temp = new FlowPane();
		temp.setPrefSize(450, 500);

		myTA1 = new TextArea(); // the first column
		myTA1.setPrefSize(150, 500);
		myTA1.setText("This is a List test");
		temp.getChildren().add(myTA1);

		myTA2 = new TextArea(); // the second column
		myTA2.setPrefSize(150, 500);
		myTA2.setText("This is also a List test");
		temp.getChildren().add(myTA2);

		myTA3 = new TextArea(); // the third column
		myTA3.setPrefSize(150, 500);
		myTA3.setText("Also a List test");
		temp.getChildren().add(myTA3);

		getChildren().add(temp);

	} // constructor
	
	public void setTA1(String list) {
		myTA1.setText(list);
	} // setTA1
	
	public void setTA2(String list) {
		myTA2.setText(list);
	} // setTA2
	
	public void setTA3(String list) {
		myTA3.setText(list);
	} // setTA3

}
