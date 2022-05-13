package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BuggyClassTestBC3 {
    private BuggyClass buggyClass50;

    @Before
    public void setup(){
        buggyClass50 = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClass50 = null;
    }

    @Test
    public void Test1() {
        assertEquals(buggyClass50.buggyMethod3(-10,10), 0);
    }

    @Test
    public void Test2() {
        assertEquals(0, buggyClass50.buggyMethod3(10,10));
    }
}