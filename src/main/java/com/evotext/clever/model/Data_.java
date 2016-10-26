
package com.evotext.clever.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "teacher_number",
    "credentials",
    "school",
    "created",
    "district",
    "sis_id",
    "name",
    "id",
    "title",
    "last_modified",
    "email"
})
public class Data_ {

    @JsonProperty("teacher_number")
    private String teacherNumber;
    @JsonProperty("credentials")
    private Credentials credentials;
    @JsonProperty("school")
    private String school;
    @JsonProperty("created")
    private String created;
    @JsonProperty("district")
    private String district;
    @JsonProperty("sis_id")
    private String sisId;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The teacherNumber
     */
    @JsonProperty("teacher_number")
    public String getTeacherNumber() {
        return teacherNumber;
    }

    /**
     * 
     * @param teacherNumber
     *     The teacher_number
     */
    @JsonProperty("teacher_number")
    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
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

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
