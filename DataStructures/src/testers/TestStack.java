package testers;

import structures.Stack;

public class TestStack {
	public static void main(String args[]) {
		
		Stack a = new Stack(10);
		
		for (int i = 0; i < 11; i++) {
			a.push(i);
		}
		
	}
}
