package com.evotext.clever;

import org.json.JSONObject;

import com.evotext.clever.requests.CleverRequestInterface;
import com.goebl.david.Webb;
import com.goebl.david.WebbException;

public class Connect {

	public static JSONObject get(CleverRequestInterface request)
	{
		String creds = "Bearer " + request.getToken();
		Webb webb = Webb.create();
		webb.setDefaultHeader(Webb.HDR_AUTHORIZATION, creds);
		JSONObject jsonObject = null;
		try 
		{
			jsonObject = webb.get(request.getUrl())
				//.params(request.getParameters())
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
	
	

	
}
