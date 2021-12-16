package finalProject;

//TODO fix all this so it is for CDLL and not sorted LL

/**
 * A class to create Circularly Doubly-linked lists of objects with generic type
 * T
 * 
 * @author Justin Homme
 * @version 12/10/21
 * @param <T>
 */
public class CircDLL<T extends Comparable<? super T>> {

	/** The first node in the list */
	private ListNode head; // the first node in our linked list

	/** The last node in the list */
	private ListNode tail;

	/** The number of items in the list */
	private int size;

	/**
	 * clears our linked list to only contain a Sentinel head and tail
	 */
	public void clear() {
		// TODO fix this for CDLL
		size = 0;
		tail = new ListNode(null, null, head);
		head = new ListNode(null, tail, null);
	}

	/**
	 * a constructor for a SortedLinkedList with no parameters since we always want
	 * our list to start with only a head, tail, and size zero
	 */
	public CircDLL() {
		clear();
	}

	/**
	 * a class of the nodes (of generic type T) that we will store in our
	 * SortedLinkedList
	 * 
	 * @author gosnat
	 * @author Justin Homme
	 *
	 */
	private class ListNode {
		/** The data to store in this node */
		private T rdata;
		/** A pointer to the next node in the list */
		private ListNode nxt;
		/** a pointer to the previous node in the list */
		private ListNode prev;

		/**
		 * Constructor
		 * 
		 * @param data the actual data item to store
		 * @param next A pointer to the node that should go next
		 */
		ListNode(T data, ListNode next, ListNode previous) {
			rdata = data;
			nxt = next;
			prev = previous;
		}
	}

	// methods below are not used in this class, currently but may be used in the
	// future:

	/**
	 * Helper method to locate the node at a particular index Can be used to avoid
	 * duplicated code in other methods Note this is private since it is used to
	 * support the public methods
	 * 
	 * @param index the index you want to locate
	 * @return A pointer to the node at requested index
	 * @throws IllegalArgumentException If requested index is out of bounds
	 */
	private ListNode findNodeAtPosition(int index) throws IllegalArgumentException {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("index out of range");
		}
		ListNode tmp = head;
		for (int i = 0; i < index; i++) {
			tmp = tmp.nxt;
		}
		return tmp;
	}

	/**
	 * Note that this is returning pointer the data item (type T), not the ListNode
	 * object
	 * 
	 * @param index index that you want to fetch data from
	 * @return data item located at that index
	 * @throws IllegalArgumentException if requested index is out of bounds
	 */
	public T get(int index) throws IllegalArgumentException {
		return findNodeAtPosition(index).rdata;
	}

	// end of unused methods

	/**
	 * Does this item exist in the list?
	 * 
	 * @param data The data item you're looking for
	 * @return true if data item is already in the list, false if not
	 */
	public boolean contains(T target) {
		ListNode tmp = head.nxt;
		while (tmp != tail) {
			if (tmp.rdata.equals(target)) {
				return true;
			}
			tmp = tmp.nxt;
		}
		return false;
	}

	/**
	 * removes a node, containing "data" from the list
	 * 
	 * @param data the data contained in the node we want to remove from the list
	 * @throws IllegalArgumentException if the data is not in the linked list
	 */
	public void deleteItem(T data) throws IllegalArgumentException {
		if (this.contains(data) == true) {
			ListNode cur = head.nxt;
			ListNode prev = head;
			while (cur != tail) {
				if (cur.rdata.equals(data)) { // we found the node we are looking for
					prev.nxt = cur.nxt; // changes the nxt pointer of the previous node to the next node
					cur.nxt.prev = cur.prev; // changes the prev pointer of the next node to the previous node
												// now the cur node has no connections
					size = size - 1;
					break;
				} else { // keep looking
					prev = prev.nxt;
					cur = cur.nxt;
				}
			}
		} else { // couldn't find it in the list
			throw new IllegalArgumentException("You cannot delete data that is not in the linked list.");
		}
	}

	/**
	 * Searches for the appropriate place, in our list, to store the data and
	 * creates a new node at that location
	 * 
	 * @param data the data (of type T) that we want to add to our SortedLinkedList
	 */
	public void addItem(T data) {
		ListNode prev = head;
		ListNode cur = head.nxt;

		// add item to the end of the list /
		ListNode node = new ListNode(data, cur.nxt, cur.prev);
		prev.nxt = node;
		prev = cur;
		cur = cur.nxt;
		size++;
	}

	public String toString() {
		ListNode node = head;
		String myStr = "";
		int i = 1;
		while (node.nxt != null) {
			myStr += node.rdata;
			node = node.nxt;
			i++;
		}
		return myStr;
	}

//	public ListNode getPrev() {
//		return prev;
//	}
//
//	public ListNode getNxt() {
//		return nxt;
//	}

}
