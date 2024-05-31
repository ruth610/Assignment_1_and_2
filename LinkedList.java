package assignment_2;

import assignment_2.Node;

public class LinkedList {
	static Node head;
	int data;
	
	
	
	public void deleteAtPosition(int index) {
		Node dummy = new Node();
		dummy.next = head;
	    int count=0;
		Node curr=dummy;
		while(curr.next!=null) {
			count++;
			if(count==index+1) {
				curr.next = curr.next.next;
			}
			else {
				curr=curr.next;
			}
		}
	}
	
	
	public void insertAtPos(int index,int data) {
		Node node = new Node();
		node.data = data;
		  
		if(index==0) {
			
			node.next = head;
			head = node;
		}
		else {
		  Node n = head;
		  for(int i=0; i<index-1;i++) {
			 n =  n.next;
		  }
		  node.next = n.next;
		  n.next = node;
	    }		
	}
	
	public void deleteAfter(int index) {
		Node dummy = new Node();
		
		dummy.next = head;
	    int count=0;
		Node curr=dummy;
		while(curr.next!=null) {
			count++;
			if(count==index+2) {
				curr.next = curr.next.next;
			}
			else {
				curr=curr.next;
			}
		}
		
	}
	
	public void searchNode(int value) {
		Node dummy = new Node();
		dummy.next = head;
		int count =0;
		Node curr=dummy;
		while(curr.next!=null) {
			count++;
			if(curr.next.data ==value ) {
				System.out.println("Node "+ value + " is found at index " + (count-1));
			}
			curr=curr.next;
		}
		
		
		
	}
	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
		    node = node.next;
		}
		System.out.println(node.data);
	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtPos(0, 3);
		list.insertAtPos(1, 6);
		list.insertAtPos(2, 4);
		list.insertAtPos(3, 11);
		list.insertAtPos(4, 8);
		
		
		
		list.searchNode(6);
		list.deleteAtPosition(3);
		list.deleteAfter(0);
		
		list.show();
		
		
		
		
		

	}

}
