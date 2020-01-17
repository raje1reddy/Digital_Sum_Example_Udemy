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
            int expectedresult = -1;
            assertEquals(expectedresult,result);
        }

    @Test
    public void whileLoopExample_num999() {
        int result = digitalSumExample.sumDigits(999);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }


    @Test
    public void WhileLoopExample4_num0() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(0);
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample5_num9999() {
        int result = digitalSumExample.sumDigits(9999);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample5_num99999() {
        int result = digitalSumExample.sumDigits(99999);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void WhileLoopExample1() {
        DigitalSumExample digitalSumExample = new DigitalSumExample();
        int result = digitalSumExample.sumDigits(125);
        System.out.println(result);
        int expectedresult = -1;
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


  /*  public void whileLoopExample6_numnegative{
        int result = digitalSumExample.sumDigits(-1);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    public void whileLoopExample7_numnegative11 {
        int result = digitalSumExample.sumDigits(-9999999);
        System.out.println(result);
        int expectedresult = -10;
        assertEquals(expectedresult,result);
    }
/*
    @Test
    public void whileLoopExample8_numinvalid_false() {
        int result = digitalSumExample.tablesExample(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000006;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample6_num00_false() {
        int result = digitalSumExample.whileLoopExample2(0,true);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample8_numinvalid1_false() {
        int result = digitalSumExample.whileLoopExample2(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000000;
        assertEquals(expectedresult,result);
    }


    @Test
    public void whileLoopExample7_numnegative1_true() {
        int result = digitalSumExample.whileLoopExample2(-9,false);
        System.out.println(result);
        int expectedresult = -10;
        assertEquals(expectedresult,result);
    }*/

}



