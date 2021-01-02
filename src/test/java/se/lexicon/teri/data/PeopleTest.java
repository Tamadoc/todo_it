package se.lexicon.teri.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.teri.model.Person;

import static org.junit.Assert.assertEquals;

public class PeopleTest {
    People peopleTest;
    Person person1;
    Person person2;

    @Before
    public void setUp() {
        peopleTest = new People();
        peopleTest.clear();
        person1 = peopleTest.addPerson("Teri", "Sandstedt");
        person2 = peopleTest.addPerson("Sven", "Svensson");
    }

    // Test passes when run as individual test, but not when run with full class.
    @Test
    public void test_findById() {
        Person expectedPerson = person2;
        assertEquals(expectedPerson, peopleTest.findById(2));
    }

    @Test
    public void test_size() {
        int expectedSize = 2;
        assertEquals(expectedSize, peopleTest.size());
    }

    // Test passes when run as individual test, but not when run with full class.
    @Test
    public void test_removePerson() {
        int expectedArrayLength = 1;
        peopleTest.removePerson(1);
        assertEquals(expectedArrayLength, peopleTest.size());
    }

    @Test
    public void test_clear() {
        peopleTest.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, peopleTest.size());
    }
}
