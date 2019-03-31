package com.test;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class SampleTest {

    String message = "Robert";

    @Test
    public void testScenario1() {
        System.out.println("Inside testPrintMessage()");
    }

    @Test
    public void testScenario2() {
        System.out.println("Inside testSalutationMessage()");
    }
}