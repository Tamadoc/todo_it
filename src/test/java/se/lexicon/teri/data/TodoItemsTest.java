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
    Todo todoItem3;
    Todo todoItem4;

    @Before
    public void setUp() {
        todoItemsTest = new TodoItems();
        todoItemsTest.clear();

        testPerson1 = new Person("Teri", "Sandstedt");
        testPerson2 = new Person("Sven", "Svensson");

        todoItem1 = todoItemsTest.addTodo("Item1", true, testPerson1);
        todoItem2 = todoItemsTest.addTodo("Item2", false, testPerson2);
        todoItem3 = todoItemsTest.addTodo("Item3", true, testPerson1);
        todoItem4 = todoItemsTest.addTodo("Item4", false, null);
    }

    @Test
    public void test_size() {
        int expectedSize = 4;
        assertEquals(expectedSize, todoItemsTest.size());
    }

    @Test
    public void test_findAll() {
        int expectedArrayLength = 4;
        Todo[] testArray = todoItemsTest.findAll();
        assertEquals(expectedArrayLength, testArray.length);
    }

    // Test passes when run as individual test, but not when run with full class.
    @Test
    public void test_findById() {
        Todo expectedTodo = todoItem3;
        assertEquals(expectedTodo, todoItemsTest.findById(3));
    }

    @Test
    public void test_findByDoneStatus() {
        int expectedArrayLength = 2;
        Todo[] testArray = todoItemsTest.findByDoneStatus(true);
        assertEquals(expectedArrayLength, testArray.length);
    }

    @Test
    public void test_findByAssigneeID() {
        int expectedArrayLength = 2;
        Todo[] testArray = todoItemsTest.findByAssignee(1);
        assertEquals(expectedArrayLength, testArray.length);
    }

    @Test
    public void test_findByAssigneePerson() {
        int expectedArrayLength = 1;
        Todo[] testArray = todoItemsTest.findByAssignee(testPerson2);
        assertEquals(expectedArrayLength, testArray.length);
    }

    @Test
    public void test_findUnassigned() {
        int expectedArrayLength = 1;
        Todo[] testArray = todoItemsTest.findUnassignedTodoItems();
        assertEquals(expectedArrayLength, testArray.length);
    }

    // Test passes when run as individual test, but not when run with full class.
    @Test
    public void test_removeTodoItem() {
        int expectedArrayLength = 3;
        todoItemsTest.removeTodoItem(1);
        assertEquals(expectedArrayLength, todoItemsTest.size());
    }

    @Test
    public void test_clear() {
        todoItemsTest.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, todoItemsTest.size());
    }
}
