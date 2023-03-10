/*
 * NHL API
 * Documenting the publicly accessible portions of the NHL API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package nhlapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import nhlapi.model.Franchise;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Franchises
 */
@JsonPropertyOrder({
  Franchises.JSON_PROPERTY_COPYRIGHT,
  Franchises.JSON_PROPERTY_FRANCHISES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class Franchises {
  public static final String JSON_PROPERTY_COPYRIGHT = "copyright";
  private String copyright;

  public static final String JSON_PROPERTY_FRANCHISES = "franchises";
  private List<Franchise> franchises = null;

  public Franchises() {
  }

  public Franchises copyright(String copyright) {
    
    this.copyright = copyright;
    return this;
  }

   /**
   * Get copyright
   * @return copyright
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCopyright() {
    return copyright;
  }


  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }


  public Franchises franchises(List<Franchise> franchises) {
    
    this.franchises = franchises;
    return this;
  }

  public Franchises addFranchisesItem(Franchise franchisesItem) {
    if (this.franchises == null) {
      this.franchises = new ArrayList<>();
    }
    this.franchises.add(franchisesItem);
    return this;
  }

   /**
   * Get franchises
   * @return franchises
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FRANCHISES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Franchise> getFranchises() {
    return franchises;
  }


  @JsonProperty(JSON_PROPERTY_FRANCHISES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFranchises(List<Franchise> franchises) {
    this.franchises = franchises;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Franchises franchises = (Franchises) o;
    return Objects.equals(this.copyright, franchises.copyright) &&
        Objects.equals(this.franchises, franchises.franchises);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyright, franchises);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Franchises {\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    franchises: ").append(toIndentedString(franchises)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

