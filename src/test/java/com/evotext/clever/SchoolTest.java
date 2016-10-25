package com.evotext.clever;

import org.junit.Test;
import static org.junit.Assert.*;

import com.evotext.clever.model.School;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class SchoolTest
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here

    /**
     * 
     * @throws Exception
     */
    @Test
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
