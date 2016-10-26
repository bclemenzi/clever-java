package com.evotext.clever;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class StudentTest
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here

    /**
     * 
     * @throws Exception
     */
    @Test
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
    @Test
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
    @Test
    public void testAllStudentSections() throws Exception
    {
        System.out.println("====> Starting StudentTest.testAllStudentSections");
        
        CleverStudentsClient cleverClient = new CleverStudentsClient(DISTRICT_OAUTH_TOKEN);
        
        List<Section> sectionList = cleverClient.getAllStudentSections("530e5960049e75a9262cff1d");
        
        boolean hasSections = false;
        for(Section sectionValue : sectionList)
        {
            System.out.println("testAllStudentSections Section: " + sectionValue.getName());
            
            hasSections = true;
        }
        
        assertTrue(hasSections);
        
        System.out.println("====> Finished StudentTest.testAllStudentSections");
    }
    
    /**
     * 
     * @throws Exception
     */
    @Test
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
    @Test
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
