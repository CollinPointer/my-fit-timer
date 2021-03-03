/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spc.javajuniors.myfittimer;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Laptop
 */
public class TimerNGTest {
    
    public TimerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getHour method, of class Timer.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Timer instance = new Timer();
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHour method, of class Timer.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int hour = 0;
        Timer instance = new Timer();
        instance.setHour(hour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class Timer.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Timer instance = new Timer();
        int expResult = 0;
        int result = instance.getMin();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMin method, of class Timer.
     */
    @Test
    public void testSetMin() {
        System.out.println("setMin");
        int min = 0;
        Timer instance = new Timer();
        instance.setMin(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSec method, of class Timer.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        Timer instance = new Timer();
        int expResult = 0;
        int result = instance.getSec();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSec method, of class Timer.
     */
    @Test
    public void testSetSec() {
        System.out.println("setSec");
        int sec = 0;
        Timer instance = new Timer();
        instance.setSec(sec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMilli method, of class Timer.
     */
    @Test
    public void testGetMilli() {
        System.out.println("getMilli");
        Timer instance = new Timer();
        int expResult = 0;
        int result = instance.getMilli();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMilli method, of class Timer.
     */
    @Test
    public void testSetMilli() {
        System.out.println("setMilli");
        int milli = 0;
        Timer instance = new Timer();
        instance.setMilli(milli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainDisplay method, of class Timer.
     */
    @Test
    public void testGetMainDisplay() {
        System.out.println("getMainDisplay");
        Timer instance = new Timer();
        String expResult = "";
        String result = instance.getMainDisplay();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainDisplay method, of class Timer.
     */
    @Test
    public void testSetMainDisplay() {
        System.out.println("setMainDisplay");
        String mainDisplay = "";
        Timer instance = new Timer();
        instance.setMainDisplay(mainDisplay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMilliDisplay method, of class Timer.
     */
    @Test
    public void testGetMilliDisplay() {
        System.out.println("getMilliDisplay");
        Timer instance = new Timer();
        String expResult = "";
        String result = instance.getMilliDisplay();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMilliDisplay method, of class Timer.
     */
    @Test
    public void testSetMilliDisplay() {
        System.out.println("setMilliDisplay");
        String milliDisplay = "";
        Timer instance = new Timer();
        instance.setMilliDisplay(milliDisplay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeDisplay method, of class Timer.
     */
    @Test
    public void testGetTimeDisplay() {
        System.out.println("getTimeDisplay");
        Timer instance = new Timer();
        String expResult = "";
        String result = instance.getTimeDisplay();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeDisplay method, of class Timer.
     */
    @Test
    public void testSetTimeDisplay() {
        System.out.println("setTimeDisplay");
        String timeDisplay = "";
        Timer instance = new Timer();
        instance.setTimeDisplay(timeDisplay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Timer.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Timer instance = new Timer();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Timer.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Timer instance = new Timer();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainTimer method, of class Timer.
     */
    @Test
    public void testSetMainTimer() {
        System.out.println("setMainTimer");
        Timer instance = new Timer();
        instance.setMainTimer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecondaryTimer method, of class Timer.
     */
    @Test
    public void testSetSecondaryTimer() {
        System.out.println("setSecondaryTimer");
        Timer instance = new Timer();
        instance.setSecondaryTimer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
