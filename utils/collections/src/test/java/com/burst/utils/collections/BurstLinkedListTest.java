package com.burst.utils.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author sergii.sapozhko on 2017-01-15.
 */
public class BurstLinkedListTest {

    @Test
    public void shouldAddElement() {
        final BurstLinkedList<String> list = new BurstLinkedList<>();

        final int expected = 5;
        for (int i = 1; i <= expected; i++) {
            list.add("Element " + i);
        }

        assertEquals(expected, list.size());
    }
}
