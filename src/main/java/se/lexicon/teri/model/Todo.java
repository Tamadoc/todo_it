package se.lexicon.teri.model;

public class Todo {
    final int todoId;
    String description;
    boolean done;
    Person assignee;

    Todo(int todoId, String description, boolean done, Person assignee){
        this.todoId = todoId;
        this.description = description;
        this.done = done;
        this.assignee = assignee;
    }

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
