package com.evotext.clever;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.junit.Test;

import com.evotext.clever.model.Teacher;
import com.evotext.clever.util.Clever;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TeacherTestOld {

	private static final String DEMO_TOKEN = "DEMO_TOKEN";
	private Clever clever = Clever.create(DEMO_TOKEN);


	@Test
    public void testTeacher() throws JsonParseException, JsonMappingException, JSONException, IOException
    {
    	Teacher teacher = clever.getTeacher("509fbd7ec474fab64a8e9d53");
    	assertEquals(teacher.getEmail(), "spinka.leo@example.net");
    }
	
	@Test
	public void testTeacherList() throws JsonParseException, JsonMappingException, IOException, JSONException 
	{
		List<Teacher> list = clever.getTeachers();
		assertEquals(list.size(), 92);
	}
	
	@Test
	public void testTeacherCount() throws JsonParseException, JsonMappingException, IOException, JSONException 
	{
		int i = clever.getTeacherCount();
		assertEquals(i, 92);
	}
}
