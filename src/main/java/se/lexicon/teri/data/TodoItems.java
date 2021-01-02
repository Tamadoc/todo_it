package se.lexicon.teri.data;

import se.lexicon.teri.model.Person;
import se.lexicon.teri.model.Todo;

import java.util.Arrays;

public class TodoItems {
    private static Todo[] todoArray = new Todo[0];
    private Todo[] returnArray = new Todo[0];

    private Todo[] expandArray(Todo[] currentArray) {
        returnArray = Arrays.copyOf(currentArray, currentArray.length + 1);
        return returnArray;
    }

    public int size() {
        return todoArray.length;
    }

    public Todo[] findAll() {
        return todoArray;
    }

    public Todo findById(int todoId) {

        for (Todo todo : todoArray) {
            if (todo.getTodoId() == todoId) {
                return todo;
            }
        }
        return null;
    }

    public Todo[] findByDoneStatus(boolean doneStatus) {
        returnArray = new Todo[0];

        for (Todo todo : todoArray) {
            if (todo.isDone() == doneStatus) {
                returnArray = expandArray(returnArray);
                returnArray[returnArray.length - 1] = todo;
            }
        }
        return returnArray;
    }

    public Todo[] findByAssignee(int personId) {
        returnArray = new Todo[0];

        for (Todo todo : todoArray) {
            if (todo.getAssignee() != null) {
                int assigneeID = todo.getAssignee().getPersonId();
                if (assigneeID == personId) {
                    returnArray = expandArray(returnArray);
                    returnArray[returnArray.length - 1] = todo;
                }
            }
        }
        return returnArray;
    }

    public Todo[] findByAssignee(Person assignee) {
        returnArray = new Todo[0];

        for (Todo todo : todoArray) {
            if (todo.getAssignee() == assignee) {
                returnArray = expandArray(returnArray);
                returnArray[returnArray.length - 1] = todo;
            }
        }
        return returnArray;
    }

    public Todo[] findUnassignedTodoItems() {
        returnArray = new Todo[0];

        for (Todo todo : todoArray) {
            if (todo.getAssignee() == null) {
                returnArray = expandArray(returnArray);
                returnArray[returnArray.length - 1] = todo;
            }
        }
        return returnArray;
    }

    public Todo addTodo(String description, boolean done, Person assignee) {
        todoArray = Arrays.copyOf(todoArray, todoArray.length + 1);
        Todo newTodo = new Todo(description, done, assignee);

        todoArray[todoArray.length - 1] = newTodo;
        return newTodo;
    }

    public void removeTodoItem(int todoId) {
        Todo itemToRemove = findById(todoId);
        returnArray = new Todo[0];

        for (Todo todo : todoArray) {
            if (todo == itemToRemove) {
                continue;
            }
            returnArray = expandArray(returnArray);
            returnArray[returnArray.length - 1] = todo;
        }
        todoArray = returnArray;
    }

    public void clear() {
        todoArray = new Todo[0];
    }
}
