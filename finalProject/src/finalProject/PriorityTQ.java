//package finalProject;
//
///**
// * A class for the first part of our Command Center This is the priority task
// * queue that will use a minHeap
// * 
// * @author Justin Homme
// * @version 12/2/21
// *
// */
//public class PriorityTQ {
//
//	/** Sorted list of tasks */
//	BinaryMinHeap<PriorityTaskNode> myMinHeap;
//
//	/** The current highest priority task */
//	private PriorityTaskNode minTask;
//
//	public PriorityTQ() {
//
//		myMinHeap = new BinaryMinHeap<>(100);
//		if (myMinHeap.isEmpty() == false) {
//			minTask = myMinHeap.findMin();
//		}
//	} // Constructor
//
//	public void addPTQ(String task, int priority) {
//		myMinHeap.insert(new PriorityTaskNode(task, priority));
//	} // addPTQ
//	
//	public String getMinTask() {
//		return minTask.task;
//	}
//
//	/**
//	 * @param task     the task to be added to the queue
//	 * @param priority an int signifying the priority of the task (1 is highest
//	 *                 priority, 100 is lowest priority)
//	 */
//	public class PriorityTaskNode implements Comparable<PriorityTaskNode> {
//
//		/** the task */
//		private String task;
//		/** the int denoting the task's priority */
//		private int priority;
//
//		public PriorityTaskNode(String task, int priority) {
//			this.task = task;
//			this.priority = priority;
//		} // Constructor
//
//		public String getTask() {
//			return task;
//		} // getTask
//
//		public int getPriority() {
//			return priority;
//		} // getPriority
//
//		@Override
//		public int compareTo(PriorityTaskNode t) {
//			if (t.priority < priority) {
//				return 1;
//			} else if (t.priority > priority) {
//				return -1;
//			} else {
//				return 0;
//			}
//		} // compareTo
//		
//		public String toString() {
//			return this.task;
//		}
//	} // PriorityTaskQ class
//
//	public String toString() {
//		return myMinHeap.toString();
//	} // toString
//
//	public static void main(String[] args) {
//		PriorityTQ ptq = new PriorityTQ();
//		ptq.addPTQ("hey", 1);
//		ptq.addPTQ("hi", 2);
//		System.out.print(ptq);
//	}
//
//} // PriorityTQ class
