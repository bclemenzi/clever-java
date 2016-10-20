
package com.evotext.clever.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class School {

    private String created;
    private String district;
    private String highGrade;
    private String lastModified;
    private Location location;
    private String lowGrade;
    private String name;
    private String ncesId;
    private String phone;
    private Principal principal;
    private String schoolNumber;
    private String sisId;
    private String stateId;
    private String id;

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 
     * @param district
     *     The district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 
     * @return
     *     The highGrade
     */
    public String getHighGrade() {
        return highGrade;
    }

    /**
     * 
     * @param highGrade
     *     The high_grade
     */
    public void setHighGrade(String highGrade) {
        this.highGrade = highGrade;
    }

    /**
     * 
     * @return
     *     The lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * 
     * @param lastModified
     *     The last_modified
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The lowGrade
     */
    public String getLowGrade() {
        return lowGrade;
    }

    /**
     * 
     * @param lowGrade
     *     The low_grade
     */
    public void setLowGrade(String lowGrade) {
        this.lowGrade = lowGrade;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The ncesId
     */
    public String getNcesId() {
        return ncesId;
    }

    /**
     * 
     * @param ncesId
     *     The nces_id
     */
    public void setNcesId(String ncesId) {
        this.ncesId = ncesId;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The principal
     */
    public Principal getPrincipal() {
        return principal;
    }

    /**
     * 
     * @param principal
     *     The principal
     */
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    /**
     * 
     * @return
     *     The schoolNumber
     */
    public String getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * 
     * @param schoolNumber
     *     The school_number
     */
    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * 
     * @return
     *     The sisId
     */
    public String getSisId() {
        return sisId;
    }

    /**
     * 
     * @param sisId
     *     The sis_id
     */
    public void setSisId(String sisId) {
        this.sisId = sisId;
    }

    /**
     * 
     * @return
     *     The stateId
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * 
     * @param stateId
     *     The state_id
     */
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
