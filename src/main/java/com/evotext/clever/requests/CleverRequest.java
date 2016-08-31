package com.evotext.clever.requests;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public abstract class CleverRequest {
	
	protected Map<String, Object> parameters;
	protected String token;
	protected String url;
	
	public String getToken() {
		return token;
	}
	
	public String getId()
	{
		return StringUtils.EMPTY;
	}
	
	public String getUrl()
	{
		return url;
	}
}
