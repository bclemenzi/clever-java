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
 * DistrictAdminObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-14T11:42:50.295166-04:00[America/New_York]")
public class DistrictAdminObject {
  @SerializedName("object")
  private DistrictAdmin object = null;

  public DistrictAdminObject object(DistrictAdmin object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(description = "")
  public DistrictAdmin getObject() {
    return object;
  }

  public void setObject(DistrictAdmin object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictAdminObject districtAdminObject = (DistrictAdminObject) o;
    return Objects.equals(this.object, districtAdminObject.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictAdminObject {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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