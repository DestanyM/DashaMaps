package com.github.zipcodewilmington.sample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DashaMapThreeTest {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "aardvark";
        Integer expectedValue = 91;
        DashaMapThree three = new DashaMapThree();
        //When
        three.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, three.bucketSize("b"));
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "aardvark";
        Integer expectedValue = 91;
        DashaMapThree three = new DashaMapThree();
        three.set(expectedKey, expectedValue);
        //When
        Integer actualValue = three.delete(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, three.bucketSize("b"));
    }

    @Test
    public void get() {
        //Given
        String expectedKey = "aardvark";
        Integer expectedValue = 91;
        DashaMapThree three = new DashaMapThree();
        three.set(expectedKey, expectedValue);
        //When
        Integer actualValue = three.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}