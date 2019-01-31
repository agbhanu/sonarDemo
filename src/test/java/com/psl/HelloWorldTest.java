package com.psl;

import com.psl.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    public void testSumOfTwoNum(){
        assertTrue(6==new HelloWorld().sumOfTwoNum(2,4));
    }
}
