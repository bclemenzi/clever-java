package com.evotext.clever;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.evotext.clever.model.School;
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
}
