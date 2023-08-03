package com.github.zipcodewilmington.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {

    @Test
    void setNext() {
        MyNode first = new MyNode("dolio", 1);
        MyNode second = new MyNode("Kris", 3);

        first.setNext(second);

        assertEquals(second, first.getNext());
    }

    @Test
    void testEquals() {
        MyNode myNode = new MyNode("joe", 10);
        MyNode myNode2 = new MyNode("joe", 10);

        assertEquals(myNode, myNode2);
    }
}