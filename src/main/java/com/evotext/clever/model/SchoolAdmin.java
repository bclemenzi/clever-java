package com.evotext.clever.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author bclemenzi
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "district", "schools", "staff_id", "credentials", "name", "title", "email", "id" })
public class SchoolAdmin
{
    @JsonProperty("district")
    private String district;
    
    @JsonProperty("schools")
    private List<String> schools = new ArrayList<String>();
    
    @JsonProperty("staff_id")
    private String staff_id;
    
    @JsonProperty("name")
    private Name name;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("credentials")
    private Credentials credentials;

    @JsonProperty("district")
    public String getDistrict()
    {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district)
    {
        this.district = district;
    }

    @JsonProperty("schools")
    public List<String> getSchools()
    {
        return schools;
    }

    @JsonProperty("schools")
    public void setSchools(List<String> schools)
    {
        this.schools = schools;
    }

    @JsonProperty("staff_id")
    public String getStaff_id()
    {
        return staff_id;
    }

    @JsonProperty("staff_id")
    public void setStaff_id(String staff_id)
    {
        this.staff_id = staff_id;
    }

    @JsonProperty("name")
    public Name getName()
    {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name)
    {
        this.name = name;
    }

    @JsonProperty("title")
    public String getTitle()
    {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title)
    {
        this.title = title;
    }

    @JsonProperty("email")
    public String getEmail()
    {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email)
    {
        this.email = email;
    }

    @JsonProperty("id")
    public String getId()
    {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id)
    {
        this.id = id;
    }
    
    @JsonProperty("credentials")
    public Credentials getCredentials()
    {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(Credentials credentials)
    {
        this.credentials = credentials;
    }

    @Override
    public String toString()
    {
        return "School_admin [district=" + district + ", email=" + email + ", staff_id=" + staff_id + ", title=" + title
                + ", id=" + id + "]";
    }

}
