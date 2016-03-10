package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyJunitTest {


    @Test
    public void testConcatenate() {
        MyJUnit myUnit = new MyJUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwotree", result);

    }
}
