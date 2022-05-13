package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC2 {
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
    public void Test1(){

         assertEquals(1,buggyClass50.buggyMethod2(6,2));

    }
}