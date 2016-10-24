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
public class TeacherTest extends TestCase
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TeacherTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TeacherTest.class );
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testTeacher() throws Exception
    {
        System.out.println("====> Starting TeacherTest.testTeacher");
        
        CleverTeachersClient cleverClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
        
        Teacher teacherValue = cleverClient.getTeacher("509fbd7ec474fab64a8e9d53");
        System.out.println("testTeacher Name: " + teacherValue.getName());
        
        if(teacherValue != null)
        {
            assertTrue(true);
        }
        
        System.out.println("====> Finished TeacherTest.testTeacher");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testTeacherSections() throws Exception
    {
        System.out.println("====> Starting TeacherTest.testTeacherSections");
        
        CleverTeachersClient cleverClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
        
        List<Section> sectionList = cleverClient.getTeacherSections("509fbd7ec474fab64a8e9d53", 10, null, null);
        
        boolean hasSections = false;
        for(Section sectionValue : sectionList)
        {
            System.out.println("testTeacherSections Section: " + sectionValue.getName());
            
            hasSections = true;
        }
        
        assertTrue(hasSections);
        
        System.out.println("====> Finished TeacherTest.testTeacherSections");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testTeacherStudents() throws Exception
    {
        System.out.println("====> Starting TeacherTest.testTeacherStudents");
        
        CleverTeachersClient cleverClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
        
        List<Student> studentList = cleverClient.getTeacherStudents("509fbd7ec474fab64a8e9d53", 10, null, null);
        
        boolean hasStudents = false;
        for(Student studentValue : studentList)
        {
            System.out.println("testTeacherStudents Student: " + studentValue.getName());
            
            hasStudents = true;
        }
        
        assertTrue(hasStudents);
        
        System.out.println("====> Finished TeacherTest.testTeacherStudents");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testAllTeachers() throws Exception
    {
        System.out.println("====> Starting TeacherTest.testAllTeachers");
        
        CleverTeachersClient cleverClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
        
        List<Teacher> teacherList = cleverClient.getTeachers(10, null, null);
        
        boolean hasTeachers = false;
        for(Teacher teacherValue : teacherList)
        {
            System.out.println("testAllTeachers Teacher: " + teacherValue.getName());
            
            hasTeachers = true;
        }
        
        assertTrue(hasTeachers);
        
        System.out.println("====> Finished TeacherTest.testAllTeachers");
    }
}
