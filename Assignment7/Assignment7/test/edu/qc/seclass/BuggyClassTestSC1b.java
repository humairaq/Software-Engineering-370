package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BuggyClassTestSC1b {
    private BuggyClass buggyClass50;
    @Before
    public void setUp() {
        buggyClass50 = new BuggyClass();

    }

    @After
    public void tearDown() {
        buggyClass50 = new BuggyClass();

    }

    @Test
    public void Test1() {
        buggyClass50.buggyMethod1(-10,0);

    }

}