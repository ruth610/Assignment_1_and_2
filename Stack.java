package assignment_2;

import assignment_2.Node;

public class Stack {
	
	 Node top;

	  public Stack() {
	       this.top = null;
	    }

	  public void push(int data) {
	       Node node = new Node();
	       node.data = data;
	       if (top == null) {
	           top = node;
	       } else {
	           node.next = top;
	           top = node;
	        }
	       System.out.println(data);
	    }

	   public int pop() {
	       if (top == null) {
	           System.out.println("Stack is empty");
	           return -1;
	        }
	       int value = top.data;
	       top = top.next;
	       return value;
	    }

	   public int peek() {
	       if (top == null) {
	           System.out.println("Stack is empty");
	           return -1;
	        }
	       return top.data;
	    }

	public static void main(String[] args) {
		
		Stack stack = new Stack();
        stack.push(9);
        stack.push(11);
        stack.push(22);
        stack.push(23);

        System.out.println(stack.peek() + " is peeked");
        System.out.println(stack.pop() + " is popped");
        System.out.println(stack.peek() + " is peeked");
		

	}

}
