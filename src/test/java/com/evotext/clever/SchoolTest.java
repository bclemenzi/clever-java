package com.evotext.clever;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.evotext.clever.model.School;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Teacher;

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
    
    /**
     * 
     * @throws Exception
     */
    @Test
    public void testAllSchoolTeachers() throws Exception
    {
        System.out.println("====> Starting SchoolTest.testSchoolTeachers");

        CleverSchoolsClient cleverClient = new CleverSchoolsClient(DISTRICT_OAUTH_TOKEN);

        List<Teacher> teacherList = cleverClient.getAllSchoolTeachers("530e595026403103360ff9fd");

        boolean hasTeachers = false;
        for (Teacher teacherValue : teacherList)
        {
            System.out.println("testSchoolTeachers Teacher: " + teacherValue.getName());

            hasTeachers = true;
        }

        assertTrue(hasTeachers);

        System.out.println("====> Finished SchoolTest.testSchoolTeachers");
    }
    
    /**
     * 
     * @throws Exception
     */
    @Test
    public void testAllSchoolSections() throws Exception
    {
        System.out.println("====> Starting SchoolTest.testAllSchoolSections");

        CleverSchoolsClient cleverClient = new CleverSchoolsClient(DISTRICT_OAUTH_TOKEN);

        List<Section> sectionList = cleverClient.getAllSchoolSections("530e595026403103360ff9fd");

        boolean hasSections = false;
        for (Section sectionValue : sectionList)
        {
            System.out.println("testAllSchoolSections Section: " + sectionValue.getName());

            hasSections = true;
        }

        assertTrue(hasSections);

        System.out.println("====> Finished SchoolTest.testAllSchoolSections");
    }
}
