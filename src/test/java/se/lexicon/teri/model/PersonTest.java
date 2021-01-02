package se.lexicon.teri.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.teri.data.PersonSequencer;

public class PersonTest {

    private Person testPerson;

    @Before
    public void setUp() {
        PersonSequencer.resetPersonId();
        testPerson = new Person("firstName", "lastName");
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

