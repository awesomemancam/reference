package hackerrank;

import structures.Node;

public class HasCycle {
	
	/*
	  Detect cycle in the list
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	int hasCycle(Node head) {
	    if (head == null) {
	        return 0;
	    } else {
	        Node a, b, c;
	        a = head;
	        if (a == a.next)
	            return 1;
	        if (a.next != null) {
	            b = a.next;
	            while (b.next != null) {
	                c = a;
	                while (c.next != null) {
	                    if (b == c) {
	                        return 1;
	                    } else {
	                        c = c.next;
	                    }
	                }
	                b = b.next;
	            }
	        }
	    }
	    return 0;
	}

}
