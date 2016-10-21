package com.evotext.clever.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author derekjackson
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "district", "email", "school", "sis_id", "teacher_number", "title", "name", "last_modified", "created", "credentials", "id", "state_id" })
public class Teacher implements Base
{
    @JsonProperty("district")
    private String district;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("school")
    private String school;
    
    @JsonProperty("sis_id")
    private String sisId;
    
    @JsonProperty("teacher_number")
    private String teacherNumber;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("name")
    private Name name;
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("credentials")
    private Credentials credentials;
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("state_id")
    private String stateId;

    /**
     * 
     * @return The district
     */
    @JsonProperty("district")
    public String getDistrict()
    {
        return district;
    }

    /**
     * 
     * @param district
     *            The district
     */
    @JsonProperty("district")
    public void setDistrict(String district)
    {
        this.district = district;
    }

    /**
     * 
     * @return The email
     */
    @JsonProperty("email")
    public String getEmail()
    {
        return email;
    }

    /**
     * 
     * @param email
     *            The email
     */
    @JsonProperty("email")
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * 
     * @return The school
     */
    @JsonProperty("school")
    public String getSchool()
    {
        return school;
    }

    /**
     * 
     * @param school
     *            The school
     */
    @JsonProperty("school")
    public void setSchool(String school)
    {
        this.school = school;
    }

    /**
     * 
     * @return The sisId
     */
    @JsonProperty("sis_id")
    public String getSisId()
    {
        return sisId;
    }

    /**
     * 
     * @param sisId
     *            The sis_id
     */
    @JsonProperty("sis_id")
    public void setSisId(String sisId)
    {
        this.sisId = sisId;
    }

    /**
     * 
     * @return The teacherNumber
     */
    @JsonProperty("teacher_number")
    public String getTeacherNumber()
    {
        return teacherNumber;
    }

    /**
     * 
     * @param teacherNumber
     *            The teacher_number
     */
    @JsonProperty("teacher_number")
    public void setTeacherNumber(String teacherNumber)
    {
        this.teacherNumber = teacherNumber;
    }

    /**
     * 
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle()
    {
        return title;
    }

    /**
     * 
     * @param title
     *            The title
     */
    @JsonProperty("title")
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * 
     * @return The name
     */
    @JsonProperty("name")
    public Name getName()
    {
        return name;
    }

    /**
     * 
     * @param name
     *            The name
     */
    @JsonProperty("name")
    public void setName(Name name)
    {
        this.name = name;
    }

    /**
     * 
     * @return The lastModified
     */
    @JsonProperty("last_modified")
    public String getLastModified()
    {
        return lastModified;
    }

    /**
     * 
     * @param lastModified
     *            The last_modified
     */
    @JsonProperty("last_modified")
    public void setLastModified(String lastModified)
    {
        this.lastModified = lastModified;
    }

    /**
     * 
     * @return The created
     */
    @JsonProperty("created")
    public String getCreated()
    {
        return created;
    }

    /**
     * 
     * @param created
     *            The created
     */
    @JsonProperty("created")
    public void setCreated(String created)
    {
        this.created = created;
    }

    /**
     * 
     * @return The credentials
     */
    @JsonProperty("credentials")
    public Credentials getCredentials()
    {
        return credentials;
    }

    /**
     * 
     * @param credentials
     *            The credentials
     */
    @JsonProperty("credentials")
    public void setCredentials(Credentials credentials)
    {
        this.credentials = credentials;
    }

    /**
     * 
     * @return The id
     */
    @JsonProperty("id")
    public String getId()
    {
        return id;
    }

    /**
     * 
     * @param id
     *            The id
     */
    @JsonProperty("id")
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * 
     * @return The stateId
     */
    @JsonProperty("state_id")
    public String getStateId()
    {
        return stateId;
    }

    /**
     * 
     * @param stateId
     *            The state_id
     */
    @JsonProperty("state_id")
    public void setStateId(String stateId)
    {
        this.stateId = stateId;
    }

    @Override
    public String toString()
    {
        return "Teacher [district=" + district + ", email=" + email + ", school=" + school + ", sisId=" + sisId + ", teacherNumber=" + teacherNumber
                + ", title=" + title + ", name=" + name + ", lastModified=" + lastModified + ", created=" + created + ", credentials=" + credentials
                + ", id=" + id + ", stateId=" + stateId + "]";
    }

}
