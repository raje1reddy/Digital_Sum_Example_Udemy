package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class DigitalSumExampleTest {

        private DigitalSumExample digitalSumExample;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){
            digitalSumExample = new DigitalSumExample();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            digitalSumExample = null;
        }
        @Test
        public void whileLoopExamplenum9table() {
            int result = digitalSumExample.sumDigits(9);
            System.out.println(result);
            int expectedresult = -1;
            assertEquals(expectedresult,result);
        }
        @Test
        public void WhileLoopExample2num99() {
            DigitalSumExample digitalSumExample = new DigitalSumExample();
            int result = digitalSumExample.sumDigits(99);
            System.out.println(result);
            int expectedresult = 18;
            assertEquals(expectedresult,result);
        }

    @Test
    public void whileLoopExample_num999() {
        int result = digitalSumExample.sumDigits(999);
        System.out.println(result);
        int expectedresult = 27;
        assertEquals(expectedresult,result);
    }


     @Test
    public void WhileLoopExample4_num0() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(0);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample5_num9999() {
        int result = digitalSumExample.sumDigits(9999);
        System.out.println(result);
        int expectedresult = 36;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample5_num99999() {
        int result = digitalSumExample.sumDigits(99999);
        System.out.println(result);
        int expectedresult = 45;
        assertEquals(expectedresult,result);
    }

    @Test
    public void WhileLoopExample1() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(125);
        System.out.println(result);
        int expectedresult = 8;
        assertEquals(expectedresult,result);
    }

    @Test
    public void WhileLoopExample4() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(4);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void WhileLoopExample4_negative() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(-0125);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void WhileLoopExample4_numlarge() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(32123);
        System.out.println(result);
        int expectedresult = 11;
        assertEquals(expectedresult,result);
    }

    @Test
    public void WhileLoopExample4_num() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(2147483647);
        System.out.println(result);
        int expectedresult = 46;
        assertEquals(expectedresult,result);
    }

}



