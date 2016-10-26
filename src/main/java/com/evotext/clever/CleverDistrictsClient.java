package com.evotext.clever;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.evotext.clever.model.Data;
import com.evotext.clever.model.District;
import com.evotext.clever.model.Link;
import com.evotext.clever.model.Paging;
import com.evotext.clever.model.School;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The CleverDistrictsClient class is used to execute Clever's "Districts" API end points.
 *  
 * @author brendanclemenzi
 */
public class CleverDistrictsClient extends CleverClient
{
    private String m_districtOAuthToken;
    
    /**
     * 
     */
    public CleverDistrictsClient(String districtOAuthToken)
    {
        this.m_districtOAuthToken = districtOAuthToken;
    }
    
    /**
     * 
     * @param districtOAuthToken
     * @return
     * @throws Exception
     */
    public District getDistrict() throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        JSONArray dataJSON = responseJSON.getJSONArray("data");
        
        ObjectMapper mapper = new ObjectMapper();
        List<District> objectList = new ArrayList<District>();
        
        for(int i=0; i <dataJSON.length(); i++)
        {
            JSONObject joData = dataJSON.getJSONObject(i);
            District objectValue = mapper.readValue(joData.getString("data"),  District.class);
            
            objectList.add(objectValue);
        }
        
        // Return NULL if we didn't find any district objects
        if(objectList.isEmpty())
        {
            return null;
        }
        else
        {
            return objectList.get(0);
        }
    }
    
    /**
     * 
     * @param districtId
     * @return
     * @throws Exception
     */
    public BigInteger countDistrictSchools(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
        fullApiUrl.append("/schools");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", 1);
        
        ObjectMapper mapper = new ObjectMapper();
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        
        Paging pagingValue = mapper.readValue(responseJSON.getString("paging"),  Paging.class);
        
        BigInteger recordCount = new BigInteger(pagingValue.getTotal());
        return recordCount;
    }
    
    /**
     * 
     * @throws Exception
     */
    public List<School> getDistrictSchools(String districtId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
        fullApiUrl.append("/schools");
        
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
        List<School> objectList = new ArrayList<School>();
        
        for(int i=0; i <dataJSON.length(); i++)
        {
            try
            {
                JSONObject joData = dataJSON.getJSONObject(i);
                School objectValue = mapper.readValue(joData.getString("data"), School.class);
                
                objectList.add(objectValue);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        return objectList;
    }
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countDistrictTeachers(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
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
    public List<Teacher> getDistrictTeachers(String districtId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
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
    public List<Teacher> getAllDistrictTeachers(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
        fullApiUrl.append("/teachers");
        
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
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countDistrictStudents(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
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
    public List<Student> getDistrictStudents(String districtId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
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
     * @param districtId
     * @return
     * @throws Exception
     */
    public List<Student> getAllDistrictStudents(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
        fullApiUrl.append("/students");
        
        List<Student> objectList = new ArrayList<Student>();
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", 100);  // Sets a transaction limit of 100 teachers at a time coming over the line for each page.
        
        String uri = fullApiUrl.toString();
        boolean keepGoing = true;
        while (keepGoing)
        {  
            keepGoing = false;
            JSONObject responseJSON = get(uri, this.m_districtOAuthToken, parameters);
            ObjectMapper mapper = new ObjectMapper();

            List<Link> linkList = this.getLinkList(responseJSON);
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
                Student objectValue = mapper.readValue(joData.getString("data"), Student.class);
                
                objectList.add(objectValue);
            }
        
        }
        
        return objectList;
    }
    
    /**
     * 
     * @throws Exception
     */
    public BigInteger countDistrictSections(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
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
     * @param districtId
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Section> getDistrictSections(String districtId, int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
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
     * @param districtId
     * @return
     * @throws Exception
     */
    public List<Section> getAllDistrictSections(String districtId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("districts/");
        fullApiUrl.append(districtId);
        fullApiUrl.append("/sections");
        
        List<Section> objectList = new ArrayList<Section>();
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", 100);  // Sets a transaction limit of 100 teachers at a time coming over the line for each page.
        
        String uri = fullApiUrl.toString();
        boolean keepGoing = true;
        while (keepGoing)
        {  
            keepGoing = false;
            JSONObject responseJSON = get(uri, this.m_districtOAuthToken, parameters);
            ObjectMapper mapper = new ObjectMapper();

            List<Link> linkList = this.getLinkList(responseJSON);
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
                Section objectValue = mapper.readValue(joData.getString("data"), Section.class);
                
                objectList.add(objectValue);
            }
        
        }
        
        return objectList;
    }
}
