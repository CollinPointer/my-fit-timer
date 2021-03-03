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
public class TimerApplicationNGTest {
    
    public TimerApplicationNGTest() {
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
     * Test of display method, of class TimerApplication.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        TimerApplication instance = new TimerApplication();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class TimerApplication.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        TimerApplication instance = new TimerApplication();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTime method, of class TimerApplication.
     */
    @Test
    public void testPrintTime() {
        System.out.println("printTime");
        TimerApplication instance = new TimerApplication();
        instance.printTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TimerApplication.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TimerApplication.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
