
package com.evotext.clever.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created",
    "credentials",
    "district",
    "dob",
    "ell_status",
    "email",
    "frl_status",
    "gender",
    "grade",
    "hispanic_ethnicity",
    "iep_status",
    "last_modified",
    "location",
    "name",
    "race",
    "school",
    "sis_id",
    "state_id",
    "student_number",
    "id"
})
public class Student {

    @JsonProperty("created")
    private String created;
    @JsonProperty("credentials")
    private Credentials credentials;
    @JsonProperty("district")
    private String district;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("ell_status")
    private String ellStatus;
    @JsonProperty("email")
    private String email;
    @JsonProperty("frl_status")
    private String frlStatus;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("hispanic_ethnicity")
    private String hispanicEthnicity;
    @JsonProperty("iep_status")
    private String iepStatus;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("race")
    private String race;
    @JsonProperty("school")
    private String school;
    @JsonProperty("sis_id")
    private String sisId;
    @JsonProperty("state_id")
    private String stateId;
    @JsonProperty("student_number")
    private String studentNumber;
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
     *     The credentials
     */
    @JsonProperty("credentials")
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * 
     * @param credentials
     *     The credentials
     */
    @JsonProperty("credentials")
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
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
     *     The dob
     */
    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    /**
     * 
     * @param dob
     *     The dob
     */
    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * 
     * @return
     *     The ellStatus
     */
    @JsonProperty("ell_status")
    public String getEllStatus() {
        return ellStatus;
    }

    /**
     * 
     * @param ellStatus
     *     The ell_status
     */
    @JsonProperty("ell_status")
    public void setEllStatus(String ellStatus) {
        this.ellStatus = ellStatus;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The frlStatus
     */
    @JsonProperty("frl_status")
    public String getFrlStatus() {
        return frlStatus;
    }

    /**
     * 
     * @param frlStatus
     *     The frl_status
     */
    @JsonProperty("frl_status")
    public void setFrlStatus(String frlStatus) {
        this.frlStatus = frlStatus;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The grade
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * 
     * @param grade
     *     The grade
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 
     * @return
     *     The hispanicEthnicity
     */
    @JsonProperty("hispanic_ethnicity")
    public String getHispanicEthnicity() {
        return hispanicEthnicity;
    }

    /**
     * 
     * @param hispanicEthnicity
     *     The hispanic_ethnicity
     */
    @JsonProperty("hispanic_ethnicity")
    public void setHispanicEthnicity(String hispanicEthnicity) {
        this.hispanicEthnicity = hispanicEthnicity;
    }

    /**
     * 
     * @return
     *     The iepStatus
     */
    @JsonProperty("iep_status")
    public String getIepStatus() {
        return iepStatus;
    }

    /**
     * 
     * @param iepStatus
     *     The iep_status
     */
    @JsonProperty("iep_status")
    public void setIepStatus(String iepStatus) {
        this.iepStatus = iepStatus;
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
     *     The name
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The race
     */
    @JsonProperty("race")
    public String getRace() {
        return race;
    }

    /**
     * 
     * @param race
     *     The race
     */
    @JsonProperty("race")
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * 
     * @return
     *     The school
     */
    @JsonProperty("school")
    public String getSchool() {
        return school;
    }

    /**
     * 
     * @param school
     *     The school
     */
    @JsonProperty("school")
    public void setSchool(String school) {
        this.school = school;
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
     *     The studentNumber
     */
    @JsonProperty("student_number")
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * 
     * @param studentNumber
     *     The student_number
     */
    @JsonProperty("student_number")
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
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
