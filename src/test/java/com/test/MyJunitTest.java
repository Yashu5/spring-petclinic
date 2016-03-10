package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyJunitTest {


    @Test
    public oid testConcatenate() {
        MyJUnit myUnit = new MyJUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
