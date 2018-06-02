package com.shanghai.day1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeniusTest {

    @Test
    public void getScore() {

        assertEquals("LOVE ALL", Tenius.getScore(0,0));
        assertEquals("FIFTEEN ALL", Tenius.getScore(1,1));
        assertEquals("THIRTY ALL", Tenius.getScore(2,2));
        assertEquals("DENUS", Tenius.getScore(3,3));
        assertEquals("DENUS", Tenius.getScore(4,4));
        assertEquals("DENUS", Tenius.getScore(5,5));
        assertEquals("FIFTEEN LOVE", Tenius.getScore(1,0));
        assertEquals("THIRTY LOVE", Tenius.getScore(2,0));
        assertEquals("FORTY LOVE", Tenius.getScore(3,0));
        assertEquals("SERVER WIN", Tenius.getScore(4,0));
        assertEquals("THIRTY FIFTEEN", Tenius.getScore(2,1));
        assertEquals("FORTY FIFTEEN", Tenius.getScore(3,1));
        assertEquals("SERVER WIN", Tenius.getScore(4,1));
        assertEquals("FORTY THIRTY", Tenius.getScore(3,2));
        assertEquals("SERVER WIN", Tenius.getScore(4,2));
        assertEquals("SERVER ADVANTAGE", Tenius.getScore(4,3));
        assertEquals("SERVER ADVANTAGE", Tenius.getScore(5,4));
        assertEquals("SERVER ADVANTAGE", Tenius.getScore(6,5));
    }
}