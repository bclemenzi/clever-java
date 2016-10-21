package com.evotext.clever.model;


/**
 * 
 * @author brendanclemenzi
 *
 */
public class Admin
{
    private String frl_status;
    private String iep_status;
    private String race;
    private String id;
    private String state_id;
    private String student_number;
    private String hispanic_ethnicity;
    private String last_modified;
    private String school;
    private String created;
    private String email;
    private String sis_id;
    private String dob;
    private String grade;
    private String gender;
    private String ell_status;
    private String district;

    private Name name;
    private Location location;
    private Credentials credentials;
    
    public Location getLocation()
    {
        return location;
    }
    public void setLocation(Location location)
    {
        this.location = location;
    }

    public String getFrl_status()
    {
        return frl_status;
    }
    public void setFrl_status(String frl_status)
    {
        this.frl_status = frl_status;
    }

    public String getIep_status()
    {
        return iep_status;
    }
    public void setIep_status(String iep_status)
    {
        this.iep_status = iep_status;
    }

    public String getRace()
    {
        return race;
    }
    public void setRace(String race)
    {
        this.race = race;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public String getState_id()
    {
        return state_id;
    }
    public void setState_id(String state_id)
    {
        this.state_id = state_id;
    }

    public String getStudent_number()
    {
        return student_number;
    }
    public void setStudent_number(String student_number)
    {
        this.student_number = student_number;
    }

    public String getHispanic_ethnicity()
    {
        return hispanic_ethnicity;
    }
    public void setHispanic_ethnicity(String hispanic_ethnicity)
    {
        this.hispanic_ethnicity = hispanic_ethnicity;
    }

    public String getLast_modified()
    {
        return last_modified;
    }
    public void setLast_modified(String last_modified)
    {
        this.last_modified = last_modified;
    }

    public String getSchool()
    {
        return school;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getCreated()
    {
        return created;
    }
    public void setCreated(String created)
    {
        this.created = created;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getSis_id()
    {
        return sis_id;
    }
    public void setSis_id(String sis_id)
    {
        this.sis_id = sis_id;
    }

    public String getDob()
    {
        return dob;
    }
    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public Name getName()
    {
        return name;
    }
    public void setName(Name name)
    {
        this.name = name;
    }

    public String getGrade()
    {
        return grade;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Credentials getCredentials()
    {
        return credentials;
    }
    public void setCredentials(Credentials credentials)
    {
        this.credentials = credentials;
    }

    public String getEll_status()
    {
        return ell_status;
    }
    public void setEll_status(String ell_status)
    {
        this.ell_status = ell_status;
    }

    public String getDistrict()
    {
        return district;
    }
    public void setDistrict(String district)
    {
        this.district = district;
    }
}
