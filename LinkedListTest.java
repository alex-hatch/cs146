package cs146F21.hatch.project1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(5);
    }

    @Test
    void remove() {


    }

    @Test
    void printList() {
    }

    @Test
    void contains() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for(int i = 0; i < 10000; i++) {
            integerLinkedList.add(i);
        }
        assertTrue(integerLinkedList.contains(0));
    }

    @Test
    void getNode() {
    }

    @Test
    void union() {

    }

    @Test
    void intersection() {

    }

    @Test
    void size() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
        list.remove(1);
        assertEquals(0, list.size());

        for(int i = 0; i < 100; i++) {
            list.add(i);
        }

        assertEquals(100, list.size());

        for(int i = 0; i < 100; i++) {
            list.remove(i);
        }

        assertEquals(0, list.size());
    }
}