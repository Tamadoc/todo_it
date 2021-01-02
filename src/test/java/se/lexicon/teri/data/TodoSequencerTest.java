package se.lexicon.teri.data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoSequencerTest {

    @Test
    public void test_nextTodoId() {
        TodoSequencer.resetTodoId();
        int expectedId = 1;
        assertEquals(expectedId, TodoSequencer.nextTodoId());
    }
}
