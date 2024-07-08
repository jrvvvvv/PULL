/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shirt;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author JRV
 */
public class ShirtTestNGTest {
    
    public ShirtTestNGTest() {
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
     * Test of setUpClass method, of class ShirtTest.
     */
    @Test
    public void testSetUpClass() {
        System.out.println("setUpClass");
        ShirtTest.setUpClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDownClass method, of class ShirtTest.
     */
    @Test
    public void testTearDownClass() {
        System.out.println("tearDownClass");
        ShirtTest.tearDownClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUp method, of class ShirtTest.
     */
    @Test
    public void testSetUp() {
        System.out.println("setUp");
        ShirtTest instance = new ShirtTest();
        instance.setUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDown method, of class ShirtTest.
     */
    @Test
    public void testTearDown() {
        System.out.println("tearDown");
        ShirtTest instance = new ShirtTest();
        instance.tearDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testDisplayShirtInformation method, of class ShirtTest.
     */
    @Test
    public void testTestDisplayShirtInformation() {
        System.out.println("testDisplayShirtInformation");
        ShirtTest instance = new ShirtTest();
        instance.testDisplayShirtInformation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
