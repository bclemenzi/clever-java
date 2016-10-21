package com.evotext.clever;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.evotext.clever.model.District;
import com.evotext.clever.model.School;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class DistrictTest extends TestCase
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DistrictTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DistrictTest.class );
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testDistricts() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistricts");
        
        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);
        
        District districtValue = cleverClient.getDistrict();
        System.out.println("testDistricts Name: " + districtValue.getName());
        
        if(districtValue != null)
        {
            assertTrue(true);
        }
        
        System.out.println("====> Finished DistrictTest.testDistricts");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testDistrictSchools() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictSchools");
        
        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);
        
        List<School> schoolList = cleverClient.getDistrictSchools("4fd43cc56d11340000000005", 10, null);
        
        boolean hasSchools = false;
        for(School schoolValue : schoolList)
        {
            System.out.println("testDistrictSchools School: " + schoolValue.getName());
            
            hasSchools = true;
        }
        
        assertTrue(hasSchools);
        
        System.out.println("====> Finished DistrictTest.testDistrictSchools");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testDistrictTeachers() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictTeachers");
        
        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Teacher> teacherList = cleverClient.getDistrictTeachers("4fd43cc56d11340000000005", 10, null);
        
        boolean hasTeachers = false;
        for(Teacher teacherValue : teacherList)
        {
            System.out.println("testDistrictTeachers Teacher: " + teacherValue.getName());
            
            hasTeachers = true;
        }
        
        assertTrue(hasTeachers);
        
        System.out.println("====> Finished DistrictTest.testDistrictTeachers");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testDistrictStudents() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictStudents");
        
        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Student> studentList = cleverClient.getDistrictStudents("4fd43cc56d11340000000005", 10, null);
        
        boolean hasStudents = false;
        for(Student studentValue : studentList)
        {
            System.out.println("testDistrictStudents Student: " + studentValue.getName());
            
            hasStudents = true;
        }
        
        assertTrue(hasStudents);
        
        System.out.println("====> Finished DistrictTest.testDistrictStudents");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testDistrictSections() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictSections");
        
        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Section> sectionList = cleverClient.getDistrictSections("4fd43cc56d11340000000005", 10, null);
        
        boolean hasSections = false;
        for(Section sectionValue : sectionList)
        {
            System.out.println("testDistrictSections Section: " + sectionValue.getName());
            
            hasSections = true;
        }
        
        assertTrue(hasSections);
        
        System.out.println("====> Finished DistrictTest.testDistrictSections");
    }
}
