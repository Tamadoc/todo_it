package se.lexicon.teri.data;

import se.lexicon.teri.model.Person;
import se.lexicon.teri.model.Todo;

import java.util.Arrays;

public class TodoItems {
    private static Todo[] todoArray = new Todo[0];

    public int size() {
        return todoArray.length;
    }

    public Todo[] findAll(){
        return todoArray;
    }

    public Todo findById(int todoId){

        for (Todo todo : todoArray) {
            if (todo.getTodoId() == todoId) {
                return todo;
            }
        }

        return null;
    }

    public Todo addTodo(String description, boolean done, Person assignee){
        todoArray = Arrays.copyOf(todoArray, todoArray.length + 1);
        Todo newTodo = new Todo(description, done, assignee);

        todoArray[todoArray.length - 1] = newTodo;
        return newTodo;
    }

    public void clear(){
        todoArray = new Todo[0];
    }
}
