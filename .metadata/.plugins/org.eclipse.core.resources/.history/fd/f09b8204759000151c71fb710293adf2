package structures.bst;

public class BST {
	
	private Node head;
	
	public BST() {
		head = null;
	}
	
	public BST(Node head) {
		this.head = head;
	}
	
	public Node search(int data) {
		Node current = head;
		if (current == null) {
			return null;
		}
		while (current.getData() != data) {
			if (data < current.getData()) {
				current = current.getLeft();
			} else if (data > current.getData()) {
				current = current.getRight();
			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}
	
	public void insert(Node node) {
		Node current = head;
		while (current != node) {
			if (current == null) {
				current = node;
			}
			if (node.getData() < current.getData()) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}
	}

}
