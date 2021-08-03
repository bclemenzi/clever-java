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
 * Contact
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-14T11:42:50.295166-04:00[America/New_York]")
public class Contact {
  @SerializedName("id")
  private String id = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone")
  private String phone = null;

  /**
   * Gets or Sets phoneType
   */
  @JsonAdapter(PhoneTypeEnum.Adapter.class)
  public enum PhoneTypeEnum {
    CELL("Cell"),
    HOME("Home"),
    WORK("Work"),
    OTHER("Other"),
    EMPTY("");

    private String value;

    PhoneTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PhoneTypeEnum fromValue(String text) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PhoneTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PhoneTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("phone_type")
  private PhoneTypeEnum phoneType = null;

  /**
   * Gets or Sets relationship
   */
  @JsonAdapter(RelationshipEnum.Adapter.class)
  public enum RelationshipEnum {
    PARENT("Parent"),
    GRANDPARENT("Grandparent"),
    SELF("Self"),
    AUNT_UNCLE("Aunt/Uncle"),
    SIBLING("Sibling"),
    OTHER("Other"),
    EMPTY("");

    private String value;

    RelationshipEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RelationshipEnum fromValue(String text) {
      for (RelationshipEnum b : RelationshipEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RelationshipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelationshipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelationshipEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RelationshipEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("relationship")
  private RelationshipEnum relationship = null;

  @SerializedName("sis_id")
  private String sisId = null;

  @SerializedName("students")
  private List<String> students = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PARENT_GUARDIAN("Parent/Guardian"),
    EMERGENCY("Emergency"),
    PRIMARY("Primary"),
    SECONDARY("Secondary"),
    FAMILY("Family"),
    OTHER("Other"),
    EMPTY("");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public Contact id(String id) {
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

  public Contact district(String district) {
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

  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact name(String name) {
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

  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Contact phoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @Schema(description = "")
  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }

  public Contact relationship(RelationshipEnum relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @Schema(description = "")
  public RelationshipEnum getRelationship() {
    return relationship;
  }

  public void setRelationship(RelationshipEnum relationship) {
    this.relationship = relationship;
  }

  public Contact sisId(String sisId) {
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

  public Contact students(List<String> students) {
    this.students = students;
    return this;
  }

  public Contact addStudentsItem(String studentsItem) {
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

  public Contact type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.district, contact.district) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.phoneType, contact.phoneType) &&
        Objects.equals(this.relationship, contact.relationship) &&
        Objects.equals(this.sisId, contact.sisId) &&
        Objects.equals(this.students, contact.students) &&
        Objects.equals(this.type, contact.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, district, email, name, phone, phoneType, relationship, sisId, students, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
