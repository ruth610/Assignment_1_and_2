package assignment_1;
import java.util.LinkedList;
import java.util.Scanner;

public class ToDoList {
	 private Node head;
	private String title;

	 public ToDoList() {
	     this.head = null;
	    }

	 public void addTask(Task task) {
	     Node node = new Node(task);
	     if (head == null) {
	         head = node;
	     } else {
	         Node current = head;
	         while (current.next != null) {
	             current = current.next;
	            }
	         current.next = node;
	        }
	    }
	 public void markTaskAsCompleted(String taskTitle) {
		 
	    Node curr = head;
	    while (curr != null) {
	        if (curr.task.getTitle().equalsIgnoreCase(taskTitle)) {
	        curr.task.setCompleted(true);
	        System.out.println("Task '" + taskTitle + "' marked as completed.");
	           return;
	            }
	        curr = curr.next;
	        }
	     System.out.println("Task with title '" + title + "'  does not found.");
			
		}

	  public void displayTasks() {
	      Node curr = head;
	      while (curr != null) {
	          System.out.println("Task: " + curr.task.getTitle());
	          System.out.println("Description: " + curr.task.getDescription());
	          System.out.println("Completed: " + curr.task.isCompleted());
	          System.out.println("------------------------");
	          curr = curr.next;
	        }
	    }

	   public static void main(String[] args) {
	        ToDoList todoList = new ToDoList();
	        Scanner input = new Scanner(System.in);
	        String title;
	        String descri;
	        String manyOrNot;
	        
	        do {
	            System.out.println("Enter the Title of Your Task: ");
	            title = input.nextLine();
	            System.out.println("Enter the Description of Your Task: ");
	            descri = input.nextLine();

	            Task task = new Task(title, descri);
	            todoList.addTask(task);

	            System.out.println("Do you have more tasks? (yes/no): ");
	            manyOrNot = input.nextLine();
	        } while (manyOrNot.equalsIgnoreCase("yes"));
	        System.out.println("Do you want to mark any task as completed? (yes/no): ");
	        String markComplete = input.nextLine();

	        while (markComplete.equalsIgnoreCase("yes")) {
	            System.out.println("Enter the Title of the Task to mark as completed: ");
	            String theTitle = input.nextLine();
	            todoList.markTaskAsCompleted(theTitle);

	            System.out.println("Do you want to mark another task as completed? (yes/no): ");
	            markComplete = input.nextLine();

	        todoList.displayTasks();
	        input.close();
	    }

}
}
