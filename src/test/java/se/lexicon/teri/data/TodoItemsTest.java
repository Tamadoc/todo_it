package se.lexicon.teri.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.teri.model.Person;
import se.lexicon.teri.model.Todo;

import static org.junit.Assert.assertEquals;

public class TodoItemsTest {
    TodoItems todoItemsTest;
    Person testPerson1;
    Person testPerson2;
    Todo todoItem1;
    Todo todoItem2;

    @Before
    public void setUp() {
        todoItemsTest = new TodoItems();
        todoItemsTest.clear();

        testPerson1 = new Person("Teri", "Sandstedt");
        testPerson2 = new Person("Sven", "Svensson");

        todoItem1 = todoItemsTest.addTodo("Item1", false, testPerson1);
        todoItem2 = todoItemsTest.addTodo("Item2", false, testPerson2);
    }

    @Test
    public void test_findById() {
        Todo expectedTodo = null;
        assertEquals(expectedTodo, todoItemsTest.findById(3));
    }

    @Test
    public void test_size() {
        int expectedSize = 2;
        assertEquals(expectedSize, todoItemsTest.size());
    }

    @Test
    public void test_clear() {
        todoItemsTest.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, todoItemsTest.size());
    }
}
