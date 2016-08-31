package com.evotext.clever;

public class Clever {

	private String apiUrl = "https://api.clever.com";
	private String version = "v1.1";
	
	public Clever setApiUrl(final String apiUrl)
	{
		this.apiUrl = apiUrl;
		return this;
	}
	
	public Clever setVersion(final String version)
	{
		this.version = version;
		return this;
	}
	
	public Teacher[] getTeachers()
	{
		return null;
	}
	public Teacher getTeacher(final String id)
	{
		return null;
	}
	
	public Section[] getTeacherSections(final String id)
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
	
}
