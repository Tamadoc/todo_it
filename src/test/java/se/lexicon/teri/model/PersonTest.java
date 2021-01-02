package se.lexicon.teri.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person testPerson;

    @Before
    public void setUp() {
        testPerson = new Person(1, "", "");
    }

    @Test
    public void test_PersonId() {
        int expectedPersonId = 1;
        assertEquals(expectedPersonId, testPerson.getPersonId());
    }

    @Test
    public void test_FirstName() {
        testPerson.setFirstName("Teri");
        String expectedName = "Teri";
        assertEquals(expectedName, testPerson.getFirstName());
    }

    @Test
    public void test_LastName() {
        testPerson.setLastName("Sandstedt");
        String expectedName = "Sandstedt";
        assertEquals(expectedName, testPerson.getLastName());
    }
}

