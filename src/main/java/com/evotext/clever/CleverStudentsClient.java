package com.evotext.clever;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;
import com.evotext.clever.util.StringUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.goebl.david.Webb;
import com.goebl.david.WebbException;

/**
 * The CleverStudentsClient class is used to execute Clever's "students" API end points.
 *  
 * @author brendanclemenzi
 */
public class CleverStudentsClient
{
    private String m_districtOAuthToken;
    
    private String m_apiUrl = "https://api.clever.com";
    private String m_version = "v1.1";
    
    /**
     * 
     */
    public CleverStudentsClient(String districtOAuthToken)
    {
        this.m_districtOAuthToken = districtOAuthToken;
    }
    
    /**
     * 
     * @param districtOAuthToken
     * @param studentId
     * @return
     * @throws Exception
     */
    public Student getStudent(String studentId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("students/" + studentId);
        
        Map<String, Object> parameters = new HashMap<String, Object>();
                
        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        
        ObjectMapper mapper = new ObjectMapper();
        
        Student objectValue = mapper.readValue(responseJSON.getString("data"),  Student.class);
        
        return objectValue;
    }
    
    /**
     * 
     * @throws Exception
     */
    public List<Teacher> getStudentTeachers(String studentId, int limit, String startingAfter) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("students/");
        fullApiUrl.append(studentId);
        fullApiUrl.append("/teachers");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(!StringUtil.isNullOrEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
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
     * @param districtOAuthToken
     * @param studentId
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Section> getStudentSections(String studentId, int limit, String startingAfter) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("students/");
        fullApiUrl.append(studentId);
        fullApiUrl.append("/sections");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(!StringUtil.isNullOrEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
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
     * @param districtOAuthToken
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<Student> getStudents(int limit, String startingAfter) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("students");
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);
        
        if(!StringUtil.isNullOrEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
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
     * @param apiUrl
     * @param oAuthToken
     * @param parameters
     * @return
     */
    private JSONObject get(String apiUrl, String oAuthToken, Map<String, Object> parameters)
    {
        Webb webb = Webb.create();
        webb.setDefaultHeader(Webb.HDR_AUTHORIZATION, "Bearer " + oAuthToken);
        
        JSONObject jsonObject = null;
        
        try 
        {
            jsonObject = webb.get(apiUrl)
                .params(parameters)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
        }
        catch (WebbException we)
        {
            System.out.println(we);
            jsonObject = new JSONObject();
        }
        
        return jsonObject;
    }
    
    /**
     * 
     * @return
     */
    private String getBaseUrl()
    {
        return this.m_apiUrl + "/" + this.m_version + "/";
    }
}
