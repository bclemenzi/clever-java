package com.evotext.clever;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.evotext.clever.model.Link;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
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
            System.out.println("Error executing apiUrl: " + apiUrl + "  Error: " + we.getMessage());
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
    
    protected List<Link> getLinkList(JSONObject responseJSON) throws JSONException, JsonParseException, JsonMappingException, IOException
    {
    	List<Link> linkList = new ArrayList<>();
    	JSONArray dataJSON = responseJSON.getJSONArray("links");
        
        for(int i=0; i <dataJSON.length(); i++)
        {
            JSONObject joData = dataJSON.getJSONObject(i);
            String rel = joData.getString("rel");
            String uri = joData.getString("uri");

            Link link = new Link();
            link.setRel(rel);
            link.setUri(uri);
            
            linkList.add(link);
        }
        return linkList;
    }
}
