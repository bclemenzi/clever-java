package com.evotext.clever;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.evotext.clever.model.School;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class SchoolTest extends TestCase
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SchoolTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SchoolTest.class );
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testSchool() throws Exception
    {
        System.out.println("====> Starting SchoolTest.testSchool");
        
        CleverSchoolsClient cleverClient = new CleverSchoolsClient(DISTRICT_OAUTH_TOKEN);
        
        School schoolValue = cleverClient.getSchool("530e595026403103360ff9fd");
        System.out.println("SchoolTest Name: " + schoolValue.getName());
        
        if(schoolValue != null)
        {
            assertTrue(true);
        }
        
        System.out.println("====> Finished SchoolTest.testSchool");
    }
}
