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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CoursesUpdated
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-14T11:42:50.295166-04:00[America/New_York]")
public class CoursesUpdated extends Event {
  @SerializedName("data")
  private CourseObject data = null;

  @SerializedName("previous_attributes")
  private Object previousAttributes = null;

  public CoursesUpdated data(CourseObject data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public CourseObject getData() {
    return data;
  }

  public void setData(CourseObject data) {
    this.data = data;
  }

  public CoursesUpdated previousAttributes(Object previousAttributes) {
    this.previousAttributes = previousAttributes;
    return this;
  }

   /**
   * Get previousAttributes
   * @return previousAttributes
  **/
  @Schema(description = "")
  public Object getPreviousAttributes() {
    return previousAttributes;
  }

  public void setPreviousAttributes(Object previousAttributes) {
    this.previousAttributes = previousAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoursesUpdated coursesUpdated = (CoursesUpdated) o;
    return Objects.equals(this.data, coursesUpdated.data) &&
        Objects.equals(this.previousAttributes, coursesUpdated.previousAttributes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, previousAttributes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoursesUpdated {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    previousAttributes: ").append(toIndentedString(previousAttributes)).append("\n");
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
