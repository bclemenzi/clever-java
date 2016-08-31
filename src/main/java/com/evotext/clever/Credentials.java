
package com.evotext.clever;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "district_username"
})
public class Credentials {

    @JsonProperty("district_username")
    private String districtUsername;

    /**
     * 
     * @return
     *     The districtUsername
     */
    @JsonProperty("district_username")
    public String getDistrictUsername() {
        return districtUsername;
    }

    /**
     * 
     * @param districtUsername
     *     The district_username
     */
    @JsonProperty("district_username")
    public void setDistrictUsername(String districtUsername) {
        this.districtUsername = districtUsername;
    }

	@Override
	public String toString() {
		return "Credentials [districtUsername=" + districtUsername + "]";
	}

    
}
