package structures;

public class Heap {
	
	Node[] heap;
	int maxSize;
	int size;
	
	public Heap(int total) {
		maxSize = total;
		size = 0;
		heap = new Node[total];
	}
	
	public void insert(Node node) {
		heap[size] = node;
		if (!isEmpty()) {
			int parent = getParent(size);
			if (heap[parent].getData() > node.getData()) {
				swap(parent,size);
			}
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private int getParent(int index) {
		return (index-1)/2;
	}
	
	private void swap(int a, int b) {
		Node n = heap[a];
		heap[a] = heap[b];
		heap[b] = n;
	}

}
