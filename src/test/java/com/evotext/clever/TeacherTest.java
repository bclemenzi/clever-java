package com.evotext.clever;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.junit.Test;
import static org.junit.Assert.*;

import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class TeacherTest
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  // set your district oAuth token here

    /**
     * 
     * @throws Exception
     */
    @Test
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
    
	@Test
	public void testTeacherCount() throws JsonParseException, JsonMappingException, IOException, JSONException 
	{
		System.out.println("====> Starting TeacherTest.testTeacherCount");
        
        CleverTeachersClient cleverClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
        
        int i = cleverClient.countTeachers();
        
        System.out.println("testTeacher Count: " + i);
        
		assertEquals(i, 92);
		
        System.out.println("====> Finished TeacherTest.testTeacherCount");
	}
    
    /**
     * 
     * @throws Exception
     */
    @Test
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
    @Test
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
    @Test
    public void testAllTeachers() throws Exception
    {
        System.out.println("====> Starting TeacherTest.testAllTeachers");
        
        CleverTeachersClient cleverClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
        
        List<Teacher> teacherList = cleverClient.getAllTeachers();
        
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
