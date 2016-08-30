package com.evotext.clever;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class CleverClientTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CleverClientTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CleverClientTest.class );
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testSomething() throws Exception
    {
        System.out.println("====> Starting CleverClientTest.testSomething");
        
        // TODO Add Test
        
        assertTrue(true);
        
        System.out.println("====> Finished CleverClientTest.testSomething");
    }
}
