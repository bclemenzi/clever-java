package com.evotext.clever;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;

import com.evotext.clever.model.District;
import com.evotext.clever.model.Event;
import com.evotext.clever.model.Grade;
import com.evotext.clever.model.School;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Clever {

	private String apiUrl = "https://api.clever.com";
	private String version = "v1.1";
	private String token = StringUtils.EMPTY;
	
	public static Clever create(final String token)
	{
		return new Clever(token);
	}
	
	private Clever (final String token)
	{
		this.token = token;
	}
	

	public Clever setLimit(int i)
	{
		
		return this;
	}
	public List<Teacher> getTeachers() throws JsonParseException, JsonMappingException, IOException, JSONException
	{
		return Caller.getTeachers(this);
	}
	
	public Teacher getTeacher(final String id) throws JsonParseException, JsonMappingException, JSONException, IOException
	{
		return Caller.getTeacher(id, this);
	}
	
	public int getTeacherCount() throws JSONException
	{
		return Caller.getTeacherCount(this);
	}
	
	public List<Section> getTeacherSections(final String id)
	{
		return null;
	}
	
	
	public Event[] getTeacherEvents(final String id)
	{
		return null;
	}
	
	public School[] getTeacherSchools(final String id)
	{
		return null;
	}
	
	public Student[] getTeacherStudents(final String id)
	{
		return null;
	}
	
	public Grade[] getTeacherGrades(final String id)
	{
		return null;
	}
	
	public District getTeacherDistrict(final String id)
	{
		return null;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFullUrl()
	{
		return this.apiUrl + "/" + this.version + "/";
	}
}
