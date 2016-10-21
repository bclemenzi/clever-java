package com.evotext.clever.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.evotext.clever.model.Teacher;
import com.evotext.clever.requests.IdListRequest;
import com.evotext.clever.requests.ListRequest;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Caller {

	public static List<Teacher> getTeachers(final Clever clever) throws JsonParseException, JsonMappingException, IOException, JSONException 
	{
		String url = clever.getFullUrl() + "teachers";

		ListRequest request = new ListRequest.Builder(clever.getToken(), url).build();
		JSONObject jo = Connect.get(request);

		JSONArray arrJson= jo.getJSONArray("data");
		ObjectMapper mapper = new ObjectMapper();
		List<Teacher> list = new ArrayList<>();
		for(int i=0;i<arrJson.length();i++)
		{
			JSONObject joData = arrJson.getJSONObject(i);
			Teacher teacher = mapper.readValue(joData.getString("data"),  Teacher.class);
			list.add(teacher);
		}
		    
		return list;

	}
	
	public static Teacher getTeacher(final String id, final Clever clever) throws JSONException, JsonParseException, JsonMappingException, IOException
	{
		String url = clever.getFullUrl() + "teachers/" + id;
		IdListRequest request = new IdListRequest.Builder(clever.getToken(), url, id).build();
		JSONObject jo = Connect.get(request);
		
		ObjectMapper mapper = new ObjectMapper();

		Teacher teacher = mapper.readValue(jo.getString("data"),  Teacher.class);
		
		//Teacher teacher = (Teacher) jo.get("data");
		return teacher;
	}

	public static int getTeacherCount(final Clever clever) throws JSONException {
		String url = clever.getFullUrl() + "teachers";

		ListRequest request = new ListRequest.Builder(clever.getToken(), url).count(true).build();
		JSONObject jo = Connect.get(request);
		int i = jo.getInt("count");
		System.out.println(jo);

		return i;
	}
	
	/*
	private List<Base> getDataList(final Clever clever, final String url) throws JSONException, JsonParseException, JsonMappingException, IOException
	{
		ListRequest request = new ListRequest.Builder(clever.getToken(), url).build();
		JSONObject jo = Connect.get(request);
		
		System.out.println(jo);

		JSONArray arrJson= jo.getJSONArray("data");
		ObjectMapper mapper = new ObjectMapper();
		Class clazz = clever.getBase().getClass();
		List<Base> list = new ArrayList<>();
		for(int i=0;i<arrJson.length();i++)
		{
			JSONObject joData = arrJson.getJSONObject(i);
			Base base = mapper.readValue(joData.getString("data"),  clever.getBase().getClass());
			list.add(base);
		}
		    
		return list;
	}
	*/
	
}
