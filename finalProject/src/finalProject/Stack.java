package finalProject;

import java.util.EmptyStackException;

public class Stack<T> {

    /** The top node in our stack */
    ListNode topn;
    /** The bottom node in our stack */
    ListNode bottom;

    public Stack() {
        topn = bottom = new ListNode(null, null);
    } // constructor

    public boolean isEmpty() {
        if (topn == bottom) {
            return true;
        }
        return false;
    } // isEmpty

    /**
     * @param element the element that we want to add to the stack
     */
    public void pushTask(T element) {
        ListNode newNode = new ListNode(element, topn);
        topn = newNode;
    } // push Task

    /**
     * @return the data held in the top node in the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T popTask() throws EmptyStackException {
        T holder;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        holder = topn.data;
        topn = topn.next;
        return holder;
    } // popTask

    /**
     * @return the data held in the top node of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T topTask() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topn.data;
    } // topTask
    
    public String toString() throws IllegalArgumentException {
    	String myStr = "";
    	Stack<T> tmpStack = this;
    	int i = 1;
    	if(tmpStack.isEmpty()) {
        	throw new IllegalArgumentException("The stack is empty");
    	} else {
    		while(!tmpStack.isEmpty()) {
    			myStr += i + " " + tmpStack.popTask() + "\n";
    			i++;
    		}
    		return myStr;
    	}
    }

    private class ListNode {
        
        /** the data that the ListNode holds */
        T data;
        /** the ListNode to which this ListNode points */
        ListNode next;

        public ListNode(T data, ListNode next) {
            this.data = data;
            this.next = next;
        } // constructor

    } // ListNode

} // Stack
