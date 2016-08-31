
package com.evotext.clever;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "course_name",
    "course_number",
    "created",
    "district",
    "grade",
    "last_modified",
    "name",
    "period",
    "school",
    "sis_id",
    "students",
    "subject",
    "teacher",
    "teachers",
    "term",
    "id"
})
public class Section {

    @JsonProperty("course_name")
    private String courseName;
    @JsonProperty("course_number")
    private String courseNumber;
    @JsonProperty("created")
    private String created;
    @JsonProperty("district")
    private String district;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("name")
    private String name;
    @JsonProperty("period")
    private String period;
    @JsonProperty("school")
    private String school;
    @JsonProperty("sis_id")
    private String sisId;
    @JsonProperty("students")
    private List<String> students = new ArrayList<String>();
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("teacher")
    private String teacher;
    @JsonProperty("teachers")
    private List<String> teachers = new ArrayList<String>();
    @JsonProperty("term")
    private Term term;
    @JsonProperty("id")
    private String id;

    /**
     * 
     * @return
     *     The courseName
     */
    @JsonProperty("course_name")
    public String getCourseName() {
        return courseName;
    }

    /**
     * 
     * @param courseName
     *     The course_name
     */
    @JsonProperty("course_name")
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * 
     * @return
     *     The courseNumber
     */
    @JsonProperty("course_number")
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * 
     * @param courseNumber
     *     The course_number
     */
    @JsonProperty("course_number")
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
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
     *     The period
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     *     The period
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
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
     *     The students
     */
    @JsonProperty("students")
    public List<String> getStudents() {
        return students;
    }

    /**
     * 
     * @param students
     *     The students
     */
    @JsonProperty("students")
    public void setStudents(List<String> students) {
        this.students = students;
    }

    /**
     * 
     * @return
     *     The subject
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The teacher
     */
    @JsonProperty("teacher")
    public String getTeacher() {
        return teacher;
    }

    /**
     * 
     * @param teacher
     *     The teacher
     */
    @JsonProperty("teacher")
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 
     * @return
     *     The teachers
     */
    @JsonProperty("teachers")
    public List<String> getTeachers() {
        return teachers;
    }

    /**
     * 
     * @param teachers
     *     The teachers
     */
    @JsonProperty("teachers")
    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }

    /**
     * 
     * @return
     *     The term
     */
    @JsonProperty("term")
    public Term getTerm() {
        return term;
    }

    /**
     * 
     * @param term
     *     The term
     */
    @JsonProperty("term")
    public void setTerm(Term term) {
        this.term = term;
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
