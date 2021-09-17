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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DistrictAdminsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-14T11:42:50.295166-04:00[America/New_York]")
public class DistrictAdminsResponse {
  @SerializedName("data")
  private List<DistrictAdminResponse> data = null;

  @SerializedName("links")
  private List<Link> links = null;

  public DistrictAdminsResponse data(List<DistrictAdminResponse> data) {
    this.data = data;
    return this;
  }

  public DistrictAdminsResponse addDataItem(DistrictAdminResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DistrictAdminResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<DistrictAdminResponse> getData() {
    return data;
  }

  public void setData(List<DistrictAdminResponse> data) {
    this.data = data;
  }

  public DistrictAdminsResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public DistrictAdminsResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictAdminsResponse districtAdminsResponse = (DistrictAdminsResponse) o;
    return Objects.equals(this.data, districtAdminsResponse.data) &&
        Objects.equals(this.links, districtAdminsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictAdminsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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