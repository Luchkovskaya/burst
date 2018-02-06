package com.burst.utils.collections;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alona.luchkovska on 2018-02-03.
 */
public class BurstSinglyLinkedListTest {

    @Test
    public void get() throws Exception {
    }

    @Test
    public void add() throws Exception {
        BurstList<String> list = new BurstSinglyLinkedList<>();
        assertEquals(0, list.size());

        list.add("Alona");
        assertEquals(1, list.size());

        list.add("Sergii");
        assertEquals(2, list.size());
    }

    @Test
    public void remove() throws Exception {
        BurstList<String> list = new BurstSinglyLinkedList<>();
        assertEquals(0, list.size());

        list.add("Alona");
        list.add("Sergii");
        assertEquals(2, list.size());

        list.remove("Sergii");
        assertEquals(1, list.size());

        list.remove("Alona");
        assertEquals(0, list.size());
    }

    @Test
    public void removeAll() throws Exception {
    }

    @Test
    public void containsTrue() throws Exception {
        BurstList<String> list = new BurstSinglyLinkedList<>();
        assertEquals(0, list.size());

        list.add("Alona");
        list.add("Sergii");
        assertTrue(list.contains("Sergii"));

    }

    @Test
    public void containsFalse() throws Exception {
        BurstList<String> list = new BurstSinglyLinkedList<>();
        assertEquals(0, list.size());

        list.add("Alona");
        list.add("Sergii");
        assertFalse(list.contains("Sergii123"));

    }

    @Test
    public void size() throws Exception {
    }

}