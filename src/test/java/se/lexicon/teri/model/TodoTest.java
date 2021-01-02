package se.lexicon.teri.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TodoTest {

    private Todo testTodo;
    private Person testPerson;

    @Before
    public void setUp() {
        testTodo = new Todo(1, "", false, null);
    }

    @Test
    public void test_todoId() {
        int expectedTodoId = 1;
        assertEquals(expectedTodoId, testTodo.getTodoId());
    }

    @Test
    public void test_description() {
        testTodo.setDescription("Desc");
        String expectedName = "Desc";
        assertEquals(expectedName, testTodo.getDescription());
    }

    @Test
    public void test_done() {
        testTodo.setDone(true);
        assertTrue(testTodo.isDone());
    }

    @Test
    public void test_assignee() {
        testTodo.setAssignee(testPerson);
        Person expectedAssignee = testPerson;
        assertEquals(expectedAssignee, testTodo.getAssignee());
    }
}

