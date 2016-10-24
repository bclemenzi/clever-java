package com.evotext.clever;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class StudentTest extends TestCase
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StudentTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StudentTest.class );
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testStudent() throws Exception
    {
        System.out.println("====> Starting StudentTest.testStudent");
        
        CleverStudentsClient cleverClient = new CleverStudentsClient(DISTRICT_OAUTH_TOKEN);
        
        Student studentValue = cleverClient.getStudent("530e5960049e75a9262cff1d");
        System.out.println("testStudent Name: " + studentValue.getName());
        
        if(studentValue != null)
        {
            assertTrue(true);
        }
        
        System.out.println("====> Finished StudentTest.testStudent");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testStudentSections() throws Exception
    {
        System.out.println("====> Starting StudentTest.testStudentSections");
        
        CleverStudentsClient cleverClient = new CleverStudentsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Section> sectionList = cleverClient.getStudentSections("530e5960049e75a9262cff1d", 10, null, null);
        
        boolean hasSections = false;
        for(Section sectionValue : sectionList)
        {
            System.out.println("testStudentSections Section: " + sectionValue.getName());
            
            hasSections = true;
        }
        
        assertTrue(hasSections);
        
        System.out.println("====> Finished StudentTest.testStudentSections");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testStudentTeachers() throws Exception
    {
        System.out.println("====> Starting StudentTest.testStudentTeachers");
        
        CleverStudentsClient cleverClient = new CleverStudentsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Teacher> teacherList = cleverClient.getStudentTeachers("530e5960049e75a9262cff1d", 10, null, null);
        
        boolean hasTeachers = false;
        for(Teacher teacherValue : teacherList)
        {
            System.out.println("testTeacherStudents teacher: " + teacherValue.getName());
            
            hasTeachers = true;
        }
        
        assertTrue(hasTeachers);
        
        System.out.println("====> Finished StudentTest.testStudentTeachers");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testAllStudents() throws Exception
    {
        System.out.println("====> Starting StudentTest.testAllStudents");
        
        CleverStudentsClient cleverClient = new CleverStudentsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Student> studentList = cleverClient.getStudents(10, null, null);
        
        boolean hasStudents = false;
        for(Student studentValue : studentList)
        {
            System.out.println("testAllStudents Student: " + studentValue.getName());
            
            hasStudents = true;
        }
        
        assertTrue(hasStudents);
        
        System.out.println("====> Finished StudentTest.testAllStudents");
    }
}
