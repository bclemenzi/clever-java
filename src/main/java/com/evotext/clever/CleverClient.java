package com.evotext.clever;

import java.util.Map;

import org.json.JSONObject;

import com.goebl.david.Webb;
import com.goebl.david.WebbException;

/**
 * The CleverClient is used as our base client abstraction to cover a number of our common methods 
 *  
 * @author brendanclemenzi
 */
abstract class CleverClient
{
    private String m_apiUrl = "https://api.clever.com";
    private String m_version = "v1.1";
    
    /**
     * 
     * @param apiUrl
     * @param oAuthToken
     * @param parameters
     * @return
     */
    protected JSONObject get(String apiUrl, String oAuthToken, Map<String, Object> parameters)
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
    protected String getBaseUrl()
    {
        return this.m_apiUrl + "/" + this.m_version + "/";
    }
    
    protected String getApiUrl()
    {
    	return this.m_apiUrl;
    }
}
