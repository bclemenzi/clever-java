package com.evotext.clever;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.evotext.clever.model.Paging;
import com.evotext.clever.model.School;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The CleverSchoolsClient class is used to execute Clever's "Schools" API end points.
 *  
 * @author brendanclemenzi
 */
public class CleverSchoolsClient extends CleverClient
{
    private String m_districtOAuthToken;
    
    /**
     * 
     */
    public CleverSchoolsClient(String districtOAuthToken)
    {
        this.m_districtOAuthToken = districtOAuthToken;
    }
    
    /**
     * 
     * @param schoolId
     * @return
     * @throws Exception
     */
    public School getSchool(String schoolId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/" + schoolId);
        
        Map<String, Object> parameters = new HashMap<String, Object>();
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        
        ObjectMapper mapper = new ObjectMapper();
        
        School objectValue = mapper.readValue(responseJSON.getString("data"),  School.class);
        
        return objectValue;
    }
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countSchoolTeachers(String schoolId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/");
        fullApiUrl.append(schoolId);
        fullApiUrl.append("/teachers");
        
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
    public List<Teacher> getSchoolTeachers(String schoolId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/");
        fullApiUrl.append(schoolId);
        fullApiUrl.append("/teachers");
        
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
    public BigInteger countSchoolStudents(String schoolId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/");
        fullApiUrl.append(schoolId);
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
     * @param schoolId
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Student> getSchoolStudents(String schoolId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/");
        fullApiUrl.append(schoolId);
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
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countSchoolSections(String schoolId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/");
        fullApiUrl.append(schoolId);
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
     * @param schoolId
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Section> getSchoolSections(String schoolId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("schools/");
        fullApiUrl.append(schoolId);
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
}
