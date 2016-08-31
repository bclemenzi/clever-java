package com.evotext.clever;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.evotext.clever.requests.IdListRequest;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Caller {

	public List<Teacher> getTeachers()
	{
		return null;
		//JSONObject jo = Connect.get("DEMO"), id, map)
	}
	
	public static Teacher getTeacher(final String id, final String token) throws JSONException, JsonParseException, JsonMappingException, IOException
	{
		String url = "https://api.clever.com/v1.1/teachers/" + id;
		IdListRequest request = new IdListRequest.Builder(token, url, id).build();
		JSONObject jo = Connect.get(request);
		ObjectMapper mapper = new ObjectMapper();

		Teacher teacher = mapper.readValue(jo.getString("data"),  Teacher.class);
		//Teacher teacher = (Teacher) jo.get("data");
		System.out.println(jo);
		return teacher;
	}
	
	public static void main(String [] args) throws JSONException, JsonParseException, JsonMappingException, IOException
	{
		String token = "DEMO_TOKEN";
		String id = "509fbd7ec474fab64a8e9d53";
		Teacher teacher = getTeacher(id, token);
		System.out.println(teacher);
		


	}
}
