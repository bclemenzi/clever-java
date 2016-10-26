package com.evotext.clever;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.evotext.clever.model.Data;
import com.evotext.clever.model.Link;
import com.evotext.clever.model.Paging;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.evotext.clever.requests.ListRequest;
import com.evotext.clever.util.Connect;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The CleverTeachersClient class is used to execute Clever's "Teachers" API end points.
 *  
 * @author brendanclemenzi
 */
public class CleverTeachersClient extends CleverClient
{
    private String m_districtOAuthToken;
    
    /**
     * 
     */
    public CleverTeachersClient(String districtOAuthToken)
    {
        this.m_districtOAuthToken = districtOAuthToken;
    }
    
    /**
     * 
     * @param districtOAuthToken
     * @param teacherId
     * @return
     * @throws Exception
     */
    public Teacher getTeacher(String teacherId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers/" + teacherId);
        
        Map<String, Object> parameters = new HashMap<String, Object>();
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        
        ObjectMapper mapper = new ObjectMapper();
        
        Teacher objectValue = mapper.readValue(responseJSON.getString("data"),  Teacher.class);
        
        return objectValue;
    }
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countTeacherSections(String teacherId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers/");
        fullApiUrl.append(teacherId);
        fullApiUrl.append("/sections");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("count", true);
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        
        ObjectMapper mapper = new ObjectMapper();
        Paging pagingValue = mapper.readValue(responseJSON.getString("paging"),  Paging.class);
        
        BigInteger recordCount = new BigInteger(pagingValue.getTotal());
        return recordCount;
    }
    
    /**
     * 
     * @param districtOAuthToken
     * @param teacherId
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Section> getTeacherSections(String teacherId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers/");
        fullApiUrl.append(teacherId);
        fullApiUrl.append("/sections");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(StringUtils.isNotEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if(StringUtils.isNotEmpty(endingBefore))
        {
            parameters.put("ending_before", endingBefore);
        }
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        JSONArray dataJSON = responseJSON.getJSONArray("data");
        
        ObjectMapper mapper = new ObjectMapper();
        List<Section> objectList = new ArrayList<Section>();
        
        for(int i=0; i <dataJSON.length(); i++)
        {
            JSONObject joData = dataJSON.getJSONObject(i);
            Section objectValue = mapper.readValue(joData.getString("data"), Section.class);
            
            objectList.add(objectValue);
        }
        
        return objectList;
    }
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countTeacherStudents(String teacherId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers/");
        fullApiUrl.append(teacherId);
        fullApiUrl.append("/students");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", 1);
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        
        ObjectMapper mapper = new ObjectMapper();
        Paging pagingValue = mapper.readValue(responseJSON.getString("paging"),  Paging.class);
        
        BigInteger recordCount = new BigInteger(pagingValue.getTotal());
        return recordCount;
    }
    
    /**
     * 
     * @param districtOAuthToken
     * @param districtId
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Student> getTeacherStudents(String teacherId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers/");
        fullApiUrl.append(teacherId);
        fullApiUrl.append("/students");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(StringUtils.isNotEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if(StringUtils.isNotEmpty(endingBefore))
        {
            parameters.put("ending_before", endingBefore);
        }
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        JSONArray dataJSON = responseJSON.getJSONArray("data");
        
        ObjectMapper mapper = new ObjectMapper();
        List<Student> objectList = new ArrayList<Student>();
        
        for(int i=0; i <dataJSON.length(); i++)
        {
            JSONObject joData = dataJSON.getJSONObject(i);
            Student objectValue = mapper.readValue(joData.getString("data"), Student.class);
            
            objectList.add(objectValue);
        }
        
        return objectList;
    }    
    
	public int countTeachers() throws JSONException {
		String url = getBaseUrl() + "teachers";

		ListRequest request = new ListRequest.Builder(m_districtOAuthToken, url).count(true).build();
		JSONObject jo = Connect.get(request);
		int i = jo.getInt("count");

		return i;
	}

    
    /**
     * 
     * @throws Exception
     */
    public List<Teacher> getTeachers(int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(StringUtils.isNotEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if(StringUtils.isNotEmpty(endingBefore))
        {
            parameters.put("ending_before", endingBefore);
        }
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        JSONArray dataJSON = responseJSON.getJSONArray("data");
        
        ObjectMapper mapper = new ObjectMapper();
        List<Teacher> objectList = new ArrayList<Teacher>();
        
        for(int i=0; i <dataJSON.length(); i++)
        {
            JSONObject joData = dataJSON.getJSONObject(i);
            Teacher objectValue = mapper.readValue(joData.getString("data"), Teacher.class);
            
            objectList.add(objectValue);
        }
        
        return objectList;
    }
    
    /**
     * 
     * @throws Exception
     */
    public List<Teacher> getAllTeachers() throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers");
        
        List<Teacher> objectList = new ArrayList<Teacher>();
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", 100);  // Sets a transaction limit of 100 teachers at a time coming over the line for each page.
        
        String uri = fullApiUrl.toString();
        boolean keepGoing = true;
        while (keepGoing)
        {
                
        	keepGoing = false;
        	JSONObject responseJSON = get(uri, this.m_districtOAuthToken, parameters);
        	ObjectMapper mapper = new ObjectMapper();

        	Data data = mapper.readValue(responseJSON.toString(), Data.class);
        	List<Link> linkList = data.getLinks();
        	for (Link link : linkList)
        	{
        		if (StringUtils.equals(link.getRel(), "next"))
        		{
        			keepGoing = true;
        			uri = getApiUrl() + link.getUri();
        		}
        	}
        
        	JSONArray dataJSON = responseJSON.getJSONArray("data");
            
            for(int i=0; i <dataJSON.length(); i++)
            {
                JSONObject joData = dataJSON.getJSONObject(i);
                Teacher objectValue = mapper.readValue(joData.getString("data"), Teacher.class);
                
                objectList.add(objectValue);
            }
        
        }
        
        return objectList;
    }
}
