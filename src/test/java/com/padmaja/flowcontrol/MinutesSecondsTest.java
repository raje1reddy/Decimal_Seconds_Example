package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;




public class MinutesSecondsTest {
    MinutesSeconds minutesSeconds;
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }
    @Before
    public void setUp(){
         minutesSeconds = new MinutesSeconds();


    }

    @After
    public void tearDown(){
        System.out.println("tear down");


    }
    @Test
    public void setMinutesSeconds1() {
        String result = MinutesSeconds.getDurationString(65,45);
        System.out.println(" time = " + result);
        String expectedresult = "01hh05mm45ss";
        assertEquals(expectedresult,result);

    }




    @Test
    public void setMinutesSecondslong() {
        String result = MinutesSeconds.getDurationString(3945L);
        System.out.println(" time = " + result);
        String expectedresult = "01hh05mm45ss";
        assertEquals(expectedresult,result);
    }


    @Test
    public void setMinutesSecondsinvalid() {
        String result = MinutesSeconds.getDurationString(-411);
        System.out.println(" time = " + result);
        String expectedresult = "Invalid Value";
        assertEquals(expectedresult,result);    }

    @Test
    public void setMinutesSecondslow() {
        String result = MinutesSeconds.getDurationString(65,9);
        System.out.println(" time = " + result);

        String expectedresult = "01hh05mm09ss";
        assertEquals(expectedresult,result);
    }

    @Test
    public void setMinuteslessthanzero() {
        String result = MinutesSeconds.getDurationString(-1);
        System.out.println(" time = " + result);
        String expectedresult = "Invalid Value";
        assertEquals(expectedresult,result);
    }

    @Test
    public void setMinutesSecondnegative() {
        String result = MinutesSeconds.getDurationString(-1,-1);
        System.out.println(" time = " + result);

        String expectedresult = "invalid value";
        assertEquals(expectedresult,result);
    }

    @Test
    public void setMinutesSecondssame() {
        String result = MinutesSeconds.getDurationString(1000000009,1000000005);
        System.out.println(" time = " + result);
        String expectedresult = "invalid value";
        assertEquals(expectedresult,result);

    }


    @Test
    public void setMinuteslessthanzero11() {
        String result = MinutesSeconds.getDurationString(1000000000L);
        System.out.println(" time = " + result);
        String expectedresult = "277777hh46mm40ss";
        assertEquals(expectedresult,result);
    }

    @Test
    public void setMinutesSecondssamenegative() {
        String result = MinutesSeconds.getDurationString(-1000000009L,-1000000005L);
        System.out.println(" time = " + result);
        String expectedresult = "invalid value";
        assertEquals(expectedresult,result);

    }

    @Test
    public void setMinutesSeconds60() {
        String result = MinutesSeconds.getDurationString(11111111100000000L);
        System.out.println(" time = " + result);
        String expectedresult = "3086419750000hh00mm00ss";
        assertEquals(expectedresult,result);    }


    @Test
    public void setMinutesSecondsgreater59() {
        String result = MinutesSeconds.getDurationString(651000000L,11111923287L);
        System.out.println(" time = " + result);
        String expectedresult = "invalid value";
        assertEquals(expectedresult,result);

    }


}