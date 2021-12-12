package finalProject;

import java.util.ArrayList;

/**
 * A class for the first part of our Command Center This is the priority task
 * queue that will use a minHeap
 * 
 * @author Justin Homme
 * @version 12/2/21
 *
 */
public class PriorityTQ<T> {

	/** Sorted list of tasks */
	BinaryMinHeap<PriorityTaskQ> list;

	/** The current highest priority task */
	private T minTask;

	public PriorityTQ(ArrayList<String> task) {

		super();

		list = new BinaryMinHeap<PriorityTaskQ>(100);

	} // Constructor

	/**
	 * @param task     the task to be added to the queue
	 * @param priority an int signifying the priority of the task (1 is highest
	 *                 priority, 100 is lowest priority)
	 */
	private class PriorityTaskQ implements Comparable<PriorityTaskQ> {

		String task;

		int priority;

		public PriorityTaskQ(String task, int priority) {
			this.task = task;
			this.priority = priority;
		}

		public int getPriority() {
			return priority;
		}

		@Override
		public int compareTo(PriorityTaskQ t) {
			if (t.priority < priority) {
				return 1;
			} else if (t.priority > priority) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
