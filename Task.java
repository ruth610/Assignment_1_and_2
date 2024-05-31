package assignment_1;

import java.util.Scanner;

public class Task {
	private String title;
    private String description;
    private boolean isCompleted;
	Node head;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
    	isCompleted = completed;
    	
    }
    
}
