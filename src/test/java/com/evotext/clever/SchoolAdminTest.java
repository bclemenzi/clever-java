package com.evotext.clever;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.evotext.clever.model.SchoolAdmin;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class SchoolAdminTest
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testSchoolAdmin() throws Exception
    {
        System.out.println("====> Starting SchoolAdminTest.testSchoolAdmin");
        
        CleverSchoolAdminsClient cleverClient = new CleverSchoolAdminsClient(DISTRICT_OAUTH_TOKEN);
        
        SchoolAdmin adminValue = cleverClient.getSchoolAdmin("5600a2281c29fa0001000002");
        System.out.println("testSchoolAdmin Name: " + adminValue.getName().getLast());
        
        if(adminValue != null)
        {
            assertTrue(true);
        }
        
        System.out.println("====> Finished SchoolAdminTest.testSchoolAdmin");
    }
    
	@Test
	public void testAdminCount() throws Exception
	{
		System.out.println("====> Starting SchoolAdminTest.testSchoolAdminCount");
        
        CleverSchoolAdminsClient cleverClient = new CleverSchoolAdminsClient(DISTRICT_OAUTH_TOKEN);
        
        int i = cleverClient.countSchoolAdmins().intValue();
        
        System.out.println("testSchoolAdmin Count: " + i);
        
		assertEquals(i, 1);
		
        System.out.println("====> Finished SchoolAdminTest.testSchoolAdminCount");
	}
    
    /**
     * 
     * @throws Exception
     */
    @Test
    public void testAllSchoolAdmins() throws Exception
    {
        System.out.println("====> Starting SchoolAdminTest.testAllSchoolAdmins");
        
        CleverSchoolAdminsClient cleverClient = new CleverSchoolAdminsClient(DISTRICT_OAUTH_TOKEN);
        
        List<SchoolAdmin> tempList = cleverClient.getAllSchoolAdmins();
        
        boolean hasAdmins = false;
        for(SchoolAdmin tempValue : tempList)
        {
            System.out.println("testAllSchoolAdmins SchoolAdmin: " + tempValue.getName());
            
            hasAdmins = true;
        }
        
        assertTrue(hasAdmins);
        
        System.out.println("====> Finished SchoolAdminTest.testAllSchoolAdmins");
    }
}
