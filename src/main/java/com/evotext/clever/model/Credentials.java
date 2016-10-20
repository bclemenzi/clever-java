
package com.evotext.clever.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credentials {

    @JsonProperty("district_username")
    private String districtUsername;

    @JsonProperty("district_username")
    public String getDistrictUsername() {
        return districtUsername;
    }

    /**
     * 
     * @param districtUsername
     *     The district_username
     */
    public void setDistrictUsername(String districtUsername) {
        this.districtUsername = districtUsername;
    }

	@Override
	public String toString() {
		return "Credentials [districtUsername=" + districtUsername + "]";
	}

    
}
