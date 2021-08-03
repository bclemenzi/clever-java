/*
 * Data API
 * Serves the Clever Data API
 *
 * OpenAPI spec version: 2.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Section
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-14T11:42:50.295166-04:00[America/New_York]")
public class Section {
  @SerializedName("id")
  private String id = null;

  @SerializedName("course")
  private String course = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("district")
  private String district = null;

  /**
   * Gets or Sets grade
   */
  @JsonAdapter(GradeEnum.Adapter.class)
  public enum GradeEnum {
    INFANTTODDLER("InfantToddler"),
    PRESCHOOL("Preschool"),
    PREKINDERGARTEN("PreKindergarten"),
    TRANSITIONALKINDERGARTEN("TransitionalKindergarten"),
    KINDERGARTEN("Kindergarten"),
    _1("1"),
    _2("2"),
    _3("3"),
    _4("4"),
    _5("5"),
    _6("6"),
    _7("7"),
    _8("8"),
    _9("9"),
    _10("10"),
    _11("11"),
    _12("12"),
    _13("13"),
    POSTGRADUATE("PostGraduate"),
    UNGRADED("Ungraded"),
    OTHER("Other"),
    EMPTY("");

    private String value;

    GradeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GradeEnum fromValue(String text) {
      for (GradeEnum b : GradeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GradeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GradeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GradeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return GradeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("grade")
  private GradeEnum grade = null;

  @SerializedName("last_modified")
  private String lastModified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("school")
  private String school = null;

  @SerializedName("section_number")
  private String sectionNumber = null;

  @SerializedName("sis_id")
  private String sisId = null;

  @SerializedName("students")
  private List<String> students = null;

  /**
   * Gets or Sets subject
   */
  @JsonAdapter(SubjectEnum.Adapter.class)
  public enum SubjectEnum {
    ENGLISH_LANGUAGE_ARTS("english/language arts"),
    MATH("math"),
    SCIENCE("science"),
    SOCIAL_STUDIES("social studies"),
    LANGUAGE("language"),
    HOMEROOM_ADVISORY("homeroom/advisory"),
    INTERVENTIONS_ONLINE_LEARNING("interventions/online learning"),
    TECHNOLOGY_AND_ENGINEERING("technology and engineering"),
    PE_AND_HEALTH("PE and health"),
    ARTS_AND_MUSIC("arts and music"),
    OTHER("other"),
    EMPTY("");

    private String value;

    SubjectEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SubjectEnum fromValue(String text) {
      for (SubjectEnum b : SubjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SubjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubjectEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SubjectEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("subject")
  private SubjectEnum subject = null;

  @SerializedName("teacher")
  private String teacher = null;

  @SerializedName("teachers")
  private List<String> teachers = null;

  @SerializedName("term_id")
  private String termId = null;

  @SerializedName("ext")
  private Object ext = null;

  public Section id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Section course(String course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @Schema(description = "")
  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public Section created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Section district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @Schema(description = "")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Section grade(GradeEnum grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @Schema(description = "")
  public GradeEnum getGrade() {
    return grade;
  }

  public void setGrade(GradeEnum grade) {
    this.grade = grade;
  }

  public Section lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @Schema(description = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Section name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Section period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public Section school(String school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @Schema(description = "")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Section sectionNumber(String sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

   /**
   * Get sectionNumber
   * @return sectionNumber
  **/
  @Schema(description = "")
  public String getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(String sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public Section sisId(String sisId) {
    this.sisId = sisId;
    return this;
  }

   /**
   * Get sisId
   * @return sisId
  **/
  @Schema(description = "")
  public String getSisId() {
    return sisId;
  }

  public void setSisId(String sisId) {
    this.sisId = sisId;
  }

  public Section students(List<String> students) {
    this.students = students;
    return this;
  }

  public Section addStudentsItem(String studentsItem) {
    if (this.students == null) {
      this.students = new ArrayList<String>();
    }
    this.students.add(studentsItem);
    return this;
  }

   /**
   * Get students
   * @return students
  **/
  @Schema(description = "")
  public List<String> getStudents() {
    return students;
  }

  public void setStudents(List<String> students) {
    this.students = students;
  }

  public Section subject(SubjectEnum subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @Schema(description = "")
  public SubjectEnum getSubject() {
    return subject;
  }

  public void setSubject(SubjectEnum subject) {
    this.subject = subject;
  }

  public Section teacher(String teacher) {
    this.teacher = teacher;
    return this;
  }

   /**
   * Get teacher
   * @return teacher
  **/
  @Schema(description = "")
  public String getTeacher() {
    return teacher;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public Section teachers(List<String> teachers) {
    this.teachers = teachers;
    return this;
  }

  public Section addTeachersItem(String teachersItem) {
    if (this.teachers == null) {
      this.teachers = new ArrayList<String>();
    }
    this.teachers.add(teachersItem);
    return this;
  }

   /**
   * Get teachers
   * @return teachers
  **/
  @Schema(description = "")
  public List<String> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<String> teachers) {
    this.teachers = teachers;
  }

  public Section termId(String termId) {
    this.termId = termId;
    return this;
  }

   /**
   * Get termId
   * @return termId
  **/
  @Schema(description = "")
  public String getTermId() {
    return termId;
  }

  public void setTermId(String termId) {
    this.termId = termId;
  }

  public Section ext(Object ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @Schema(description = "")
  public Object getExt() {
    return ext;
  }

  public void setExt(Object ext) {
    this.ext = ext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.id, section.id) &&
        Objects.equals(this.course, section.course) &&
        Objects.equals(this.created, section.created) &&
        Objects.equals(this.district, section.district) &&
        Objects.equals(this.grade, section.grade) &&
        Objects.equals(this.lastModified, section.lastModified) &&
        Objects.equals(this.name, section.name) &&
        Objects.equals(this.period, section.period) &&
        Objects.equals(this.school, section.school) &&
        Objects.equals(this.sectionNumber, section.sectionNumber) &&
        Objects.equals(this.sisId, section.sisId) &&
        Objects.equals(this.students, section.students) &&
        Objects.equals(this.subject, section.subject) &&
        Objects.equals(this.teacher, section.teacher) &&
        Objects.equals(this.teachers, section.teachers) &&
        Objects.equals(this.termId, section.termId) &&
        Objects.equals(this.ext, section.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, course, created, district, grade, lastModified, name, period, school, sectionNumber, sisId, students, subject, teacher, teachers, termId, ext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
    sb.append("    teachers: ").append(toIndentedString(teachers)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
