package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1a {
    private BuggyClass buggyClass100;
    @Before
    public void setUp(){
        buggyClass100 = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClass100 = null;
    }

    @Test
    public void Test1() {
        assertEquals(0,buggyClass100.buggyMethod1(10,2));
    }


}