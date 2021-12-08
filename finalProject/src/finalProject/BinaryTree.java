package finalProject;

/**
 * A binary tree class made of BTNode's
 * @author Nathan Gossett- based on Dr. Gossett's code
 * @author Justin Homme
 *
 * @param <T>
 */
public class BinaryTree<T> {
	
	// attributes
	private BTNode<T> root;
	private BTNode<T> current;
	
	// constructor
	public BinaryTree() {
		root = new BTNode<T>(null, null, null);
		current = root;
	}
	
	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		root = new BTNode<T>(rootData, null, null);
		if(leftTree != null) root.left = leftTree.root;
		if(rightTree != null) root.right = rightTree.root;
		current = root;
	}// constructor
	
	// methods
	public int size() {
		return size(root);
	}
	
	public int size(BTNode<T> root) {
		if(root == null) {
			return 0;
		}
		return (1 + size(root.left) + size(root.right));
	}
	
	public int height() {
		if(root == null) {
			return -1;
		}
		return height(root);
	}
	
	public int height(BTNode<T> root) {
		if(root == null) {
			return 0;
		}
		return(1 + Math.max(height(root.left), height(root.right)));
	}
	
	public BTNode<T> getRoot() {
		return root;
	}
	
	public BTNode<T> getCurrent() {
		return current;
	}
	
	public void setCurrent(BTNode<T> cur) {
		this.current = cur;
	}
	
	public void addLeftData() {
		addLeftData(current.data, current);
	}
	
	public void addLeftData(T data, BTNode<T> cur) {
		cur.left = new BTNode<T>(cur.data, null, null);
	}
	
	public void addRightData(T data) {
		addRightData(data, current);
	}
	
	public void addRightData(T data, BTNode<T> cur) {
		cur.right = new BTNode<T>(data, null, null);
	}
	public void addRootData(T data) {
		addRootData(data, current);
	}
	
	public void addRootData(T data, BTNode<T> cur) {
		cur.data = data;
	}
	
	public boolean isLeaf() {
		return(current.left == null && current.right == null);
	}
	
	public T getLeaf() {
		return (current.data);
	}
	
	public void traverseLeft() {
		setCurrent(current.left);
	} 
	
	public void traverseRight() {
		setCurrent(current.right);
	}
	
	public T getCurData() {
		return current.data;
	}
	
	public void addQuestion(T ques) {
		this.addRootData(ques);
	}
	
	public T getRightData() {
		return current.right.data;
	}
	
	// methods

	// private classes
	private class BTNode<T> {

		/**
		 * Each of the tree nodes is one of these
		 * Consists of data and left, right ref
		 * 
		 * @param <T>
		 */
		public T data;
		public BTNode<T> left;
		public BTNode<T> right;
		
		// constructor
		public BTNode(T data, BTNode<T> left, BTNode<T> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	// private classes
}

