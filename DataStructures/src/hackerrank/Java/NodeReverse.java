package hackerrank.Java;

import structures.Node;

public class NodeReverse {

	public static void main(String[] args) {
		Node end = new Node();
		Node z = new Node(3,end);
		Node y = new Node(2,z);
		Node x = new Node(1,y);
		Node head = new Node(2345,x);
		Node test = reverse(head);
		printAll(test);
	}
	
	public static Node reverse(Node head) {
		//TODO
		if ((head == null) || (head.getNext() == null)) {
			return head;
		}
		Node temp1 = head;
		Node temp2 = head.getNext();
		while (head.getNext() != null) {
			temp1 = temp2.getNext();
			temp2.setNext(head);
			head = temp2;
			temp2 = temp1;
		}		
		return head;
	}
	public static void printAll(Node node) {
		while (node.getNext() != null) {
			node.print();
			node = node.getNext();
		}
	}

}
