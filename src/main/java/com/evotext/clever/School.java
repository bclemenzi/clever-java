
package com.evotext.clever;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "created",
    "district",
    "high_grade",
    "last_modified",
    "location",
    "low_grade",
    "name",
    "nces_id",
    "phone",
    "principal",
    "school_number",
    "sis_id",
    "state_id",
    "id"
})
public class School {

    @JsonProperty("created")
    private String created;
    @JsonProperty("district")
    private String district;
    @JsonProperty("high_grade")
    private String highGrade;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("low_grade")
    private String lowGrade;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nces_id")
    private String ncesId;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("principal")
    private Principal principal;
    @JsonProperty("school_number")
    private String schoolNumber;
    @JsonProperty("sis_id")
    private String sisId;
    @JsonProperty("state_id")
    private String stateId;
    @JsonProperty("id")
    private String id;

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The district
     */
    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    /**
     * 
     * @param district
     *     The district
     */
    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 
     * @return
     *     The highGrade
     */
    @JsonProperty("high_grade")
    public String getHighGrade() {
        return highGrade;
    }

    /**
     * 
     * @param highGrade
     *     The high_grade
     */
    @JsonProperty("high_grade")
    public void setHighGrade(String highGrade) {
        this.highGrade = highGrade;
    }

    /**
     * 
     * @return
     *     The lastModified
     */
    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    /**
     * 
     * @param lastModified
     *     The last_modified
     */
    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The lowGrade
     */
    @JsonProperty("low_grade")
    public String getLowGrade() {
        return lowGrade;
    }

    /**
     * 
     * @param lowGrade
     *     The low_grade
     */
    @JsonProperty("low_grade")
    public void setLowGrade(String lowGrade) {
        this.lowGrade = lowGrade;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The ncesId
     */
    @JsonProperty("nces_id")
    public String getNcesId() {
        return ncesId;
    }

    /**
     * 
     * @param ncesId
     *     The nces_id
     */
    @JsonProperty("nces_id")
    public void setNcesId(String ncesId) {
        this.ncesId = ncesId;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The principal
     */
    @JsonProperty("principal")
    public Principal getPrincipal() {
        return principal;
    }

    /**
     * 
     * @param principal
     *     The principal
     */
    @JsonProperty("principal")
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    /**
     * 
     * @return
     *     The schoolNumber
     */
    @JsonProperty("school_number")
    public String getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * 
     * @param schoolNumber
     *     The school_number
     */
    @JsonProperty("school_number")
    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * 
     * @return
     *     The sisId
     */
    @JsonProperty("sis_id")
    public String getSisId() {
        return sisId;
    }

    /**
     * 
     * @param sisId
     *     The sis_id
     */
    @JsonProperty("sis_id")
    public void setSisId(String sisId) {
        this.sisId = sisId;
    }

    /**
     * 
     * @return
     *     The stateId
     */
    @JsonProperty("state_id")
    public String getStateId() {
        return stateId;
    }

    /**
     * 
     * @param stateId
     *     The state_id
     */
    @JsonProperty("state_id")
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
