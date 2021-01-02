package se.lexicon.teri.data;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.teri.model.Person;

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

    @Test
    public void test_clear() {
        peopleTest.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, peopleTest.size());
    }
}
