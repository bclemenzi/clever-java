package com.evotext.clever;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.evotext.clever.model.SchoolAdmin;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The CleverStudentsClient class is used to execute Clever's "students" API end
 * points.
 * 
 * @author brendanclemenzi
 */
public class CleverSchoolAdminsClient extends CleverClient
{
    private String m_districtOAuthToken;

    /**
     * 
     */
    public CleverSchoolAdminsClient(String districtOAuthToken)
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
    public SchoolAdmin getSchoolAdmin(String schoolAdminId) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("school_admins/" + schoolAdminId);

        Map<String, Object> parameters = new HashMap<String, Object>();

        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);

        ObjectMapper mapper = new ObjectMapper();

        SchoolAdmin objectValue = mapper.readValue(responseJSON.getString("data"), SchoolAdmin.class);

        return objectValue;
    }

    /**
     * 
     * @throws Exception
     */
    public BigInteger countSchoolAdmins() throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("school_admins");

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("count", "true");

        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);

        String countValue = responseJSON.getString("count");

        BigInteger recordCount = new BigInteger(countValue);
        return recordCount;
    }

    /**
     * 
     * @param districtOAuthToken
     * @param limit
     * @param startingAfter
     * @return
     * @throws Exception
     */
    public List<SchoolAdmin> getSchoolAdmins(int limit, String startingAfter, String endingBefore) throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("school_admins");

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", limit);

        if (StringUtils.isNotEmpty(startingAfter))
        {
            parameters.put("starting_after", startingAfter);
        }
        if (StringUtils.isNotEmpty(endingBefore))
        {
            parameters.put("ending_before", endingBefore);
        }

        JSONObject responseJSON = get(fullApiUrl.toString(), this.m_districtOAuthToken, parameters);
        JSONArray dataJSON = responseJSON.getJSONArray("data");

        ObjectMapper mapper = new ObjectMapper();
        List<SchoolAdmin> objectList = new ArrayList<SchoolAdmin>();

        for (int i = 0; i < dataJSON.length(); i++)
        {
            JSONObject joData = dataJSON.getJSONObject(i);
            SchoolAdmin objectValue = mapper.readValue(joData.getString("data"), SchoolAdmin.class);

            objectList.add(objectValue);
        }

        return objectList;
    }

    public List<SchoolAdmin> getAllSchoolAdmins() throws Exception
    {
        StringBuffer fullApiUrl = new StringBuffer();
        fullApiUrl.append(getBaseUrl());
        fullApiUrl.append("school_admins");

        List<SchoolAdmin> objectList = new ArrayList<SchoolAdmin>();
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("limit", 100); // Sets a transaction limit of 100
                                      // teachers at a time coming over the line
                                      // for each page.

        String uri = fullApiUrl.toString();
        boolean keepGoing = true;
        while (keepGoing)
        {
            keepGoing = false;
            JSONObject responseJSON = get(uri, this.m_districtOAuthToken, parameters);
            ObjectMapper mapper = new ObjectMapper();

            JSONArray dataJSON = responseJSON.getJSONArray("data");
            JSONArray linksJSON = responseJSON.getJSONArray("links");
            
            for(int i=0; i <linksJSON.length(); i++)
            {
                JSONObject linkData = linksJSON.getJSONObject(i);
                
                String relValue = linkData.getString("rel");
                if(relValue.equalsIgnoreCase("next"))
                {
                    String uriValue = linkData.getString("uri");
                    
                    keepGoing = true;
                    uri = getApiUrl() + uriValue;
                }
            }

            for (int i = 0; i < dataJSON.length(); i++)
            {
                JSONObject joData = dataJSON.getJSONObject(i);
                SchoolAdmin objectValue = mapper.readValue(joData.getString("data"), SchoolAdmin.class);

                objectList.add(objectValue);
            }

        }

        return objectList;
    }
}
