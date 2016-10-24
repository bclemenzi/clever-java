package com.evotext.clever;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.evotext.clever.model.Paging;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.evotext.clever.util.StringUtil;
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
        
        if(!StringUtil.isNullOrEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if(!StringUtil.isNullOrEmpty(endingBefore))
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
        
        if(!StringUtil.isNullOrEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if(!StringUtil.isNullOrEmpty(endingBefore))
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
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countTeachers() throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers");
        
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
     * @throws Exception
     */
    public List<Teacher> getTeachers(int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("teachers");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(!StringUtil.isNullOrEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if(!StringUtil.isNullOrEmpty(endingBefore))
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
}
