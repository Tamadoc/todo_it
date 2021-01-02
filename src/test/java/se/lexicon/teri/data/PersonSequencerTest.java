package se.lexicon.teri.data;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonSequencerTest {

    @Test
    public void test_nextPersonId() {
        PersonSequencer.resetPersonId();
        int expectedId = 1;
        assertEquals(expectedId, PersonSequencer.nextPersonId());
    }
}
