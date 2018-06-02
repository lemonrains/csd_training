package com.shanghai.day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PrimeTest {

    @Test
    public void getPrime() {

        Assert.assertEquals(Arrays.asList(2), Prime.getPrime(2));
        Assert.assertEquals(Arrays.asList(3), Prime.getPrime(3));
        Assert.assertEquals(Arrays.asList(2, 2), Prime.getPrime(4));
        Assert.assertEquals(Arrays.asList(5), Prime.getPrime(5));
        Assert.assertEquals(Arrays.asList(2,3), Prime.getPrime(6));
        Assert.assertEquals(Arrays.asList(7), Prime.getPrime(7));
        Assert.assertEquals(Arrays.asList(2,2,2), Prime.getPrime(8));
        Assert.assertEquals(Arrays.asList(3,3), Prime.getPrime(9));
        Assert.assertEquals(Arrays.asList(2,5), Prime.getPrime(10));
        Assert.assertEquals(Arrays.asList(11), Prime.getPrime(11));
        Assert.assertEquals(Arrays.asList(2,2,3,3,5), Prime.getPrime(180));
        Assert.assertEquals(Arrays.asList(2,3,5,17,19), Prime.getPrime(2*3*5*17*19));

    }
}