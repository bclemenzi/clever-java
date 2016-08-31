package com.evotext.clever.requests;

import java.util.Map;

public interface CleverRequestInterface {

	
	public Map<String, Object> getParameters();
	public String getToken();
	public String getId();
	public String getUrl();
}
