package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BuggyClassTestSC3 {
    private BuggyClass buggyClass100;

    @Before
    public void setUp() {
        buggyClass100 = new BuggyClass();
    }

    @After
    public void tearDown() {
        buggyClass100 = null;
    }

    @Test
    public void Test1() { buggyClass100.buggyMethod3(-1,0);
    }
}