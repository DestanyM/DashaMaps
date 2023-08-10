package com.github.zipcodewilmington.linkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void setKey() {
        String expectedKey = "pain";
        MyPair pair = new MyPair("no", 3);
        pair.setKey(expectedKey);
        assertEquals(expectedKey, pair.getKey());
    }

    @Test
    void setValue() {
        Integer expectedValue = 19;
        MyPair pair = new MyPair("no", 3);
        pair.setValue(expectedValue);
        assertEquals(expectedValue, pair.getValue());
    }


    @Test
    void testEquals() {
        MyPair myPair = new MyPair("no", 1);
        MyPair myPair1 = new MyPair("no", 1);
        Assert.assertEquals(myPair, myPair1);

    }
}