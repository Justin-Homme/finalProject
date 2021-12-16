package finalProject;

/**
 * A class for the first part of our Command Center This is the priority task
 * queue that will use a minHeap
 * 
 * @author Justin Homme
 * @version 12/2/21
 *
 */
public class PriorityTQ {

	/** Sorted list of tasks */
	BinaryMinHeap<PriorityTaskQ> myMinHeap;

	/** The current highest priority task */
	private PriorityTaskQ minTask;

	public PriorityTQ() {

		myMinHeap = new BinaryMinHeap<>(100);
		if (myMinHeap.isEmpty() == false) {
			minTask = myMinHeap.findMin();
		}
	} // Constructor

	public void addPTQ(String task, int priority) {
		myMinHeap.insert(new PriorityTaskQ(task, priority));
	} // addPTQ

	/**
	 * @param task     the task to be added to the queue
	 * @param priority an int signifying the priority of the task (1 is highest
	 *                 priority, 100 is lowest priority)
	 */
	public class PriorityTaskQ implements Comparable<PriorityTaskQ> {

		/** the task */
		private String task;
		/** the int denoting the task's priority */
		private int priority;

		public PriorityTaskQ(String task, int priority) {
			this.task = task;
			this.priority = priority;
		} // Constructor

		public String getTask() {
			return task;
		} // getTask

		public int getPriority() {
			return priority;
		} // getPriority

		@Override
		public int compareTo(PriorityTaskQ t) {
			if (t.priority < priority) {
				return 1;
			} else if (t.priority > priority) {
				return -1;
			} else {
				return 0;
			}
		} // compareTo
	} // PriorityTaskQ class

	public String toString() {
		PriorityTaskQ[] myHeap = myMinHeap.getHeap();
		String myStr = "";
		int i = 1;
		while (myHeap != null) {
			myStr += i + " " + myHeap;

			i++;
		}

		return myStr;
	} // toString

	public static void main(String[] args) {
		PriorityTQ ptq = new PriorityTQ();
		ptq.addPTQ("hey", 1);
		ptq.addPTQ("hi", 2);
		System.out.print(ptq);
	}

} // PriorityTQ class
