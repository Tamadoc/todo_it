package se.lexicon.teri.data;

public class TodoSequencer {
    private static int todoId = 0;

    public static int nextTodoId(){
        return ++todoId;
    }

    public static void resetTodoId(){
        todoId = 0;
    }
}
