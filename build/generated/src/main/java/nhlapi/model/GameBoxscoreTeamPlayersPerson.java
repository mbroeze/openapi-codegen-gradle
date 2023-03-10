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
import java.math.BigDecimal;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameBoxscoreTeamPlayersPerson
 */
@JsonPropertyOrder({
  GameBoxscoreTeamPlayersPerson.JSON_PROPERTY_ID,
  GameBoxscoreTeamPlayersPerson.JSON_PROPERTY_FULL_NAME,
  GameBoxscoreTeamPlayersPerson.JSON_PROPERTY_LINK,
  GameBoxscoreTeamPlayersPerson.JSON_PROPERTY_SHOOTS_CATCHES,
  GameBoxscoreTeamPlayersPerson.JSON_PROPERTY_ROSTER_STATUS
})
@JsonTypeName("GameBoxscoreTeam_players_person")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameBoxscoreTeamPlayersPerson {
  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_LINK = "link";
  private URI link;

  public static final String JSON_PROPERTY_SHOOTS_CATCHES = "shootsCatches";
  private String shootsCatches;

  public static final String JSON_PROPERTY_ROSTER_STATUS = "rosterStatus";
  private String rosterStatus;

  public GameBoxscoreTeamPlayersPerson() {
  }

  public GameBoxscoreTeamPlayersPerson id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8471709", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public GameBoxscoreTeamPlayersPerson fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Marc-Edouard Vlasic", value = "")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public GameBoxscoreTeamPlayersPerson link(URI link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/api/v1/people/8471709", value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(URI link) {
    this.link = link;
  }


  public GameBoxscoreTeamPlayersPerson shootsCatches(String shootsCatches) {
    
    this.shootsCatches = shootsCatches;
    return this;
  }

   /**
   * Get shootsCatches
   * @return shootsCatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "L", value = "")
  @JsonProperty(JSON_PROPERTY_SHOOTS_CATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShootsCatches() {
    return shootsCatches;
  }


  @JsonProperty(JSON_PROPERTY_SHOOTS_CATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShootsCatches(String shootsCatches) {
    this.shootsCatches = shootsCatches;
  }


  public GameBoxscoreTeamPlayersPerson rosterStatus(String rosterStatus) {
    
    this.rosterStatus = rosterStatus;
    return this;
  }

   /**
   * Get rosterStatus
   * @return rosterStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "")
  @JsonProperty(JSON_PROPERTY_ROSTER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRosterStatus() {
    return rosterStatus;
  }


  @JsonProperty(JSON_PROPERTY_ROSTER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRosterStatus(String rosterStatus) {
    this.rosterStatus = rosterStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameBoxscoreTeamPlayersPerson gameBoxscoreTeamPlayersPerson = (GameBoxscoreTeamPlayersPerson) o;
    return Objects.equals(this.id, gameBoxscoreTeamPlayersPerson.id) &&
        Objects.equals(this.fullName, gameBoxscoreTeamPlayersPerson.fullName) &&
        Objects.equals(this.link, gameBoxscoreTeamPlayersPerson.link) &&
        Objects.equals(this.shootsCatches, gameBoxscoreTeamPlayersPerson.shootsCatches) &&
        Objects.equals(this.rosterStatus, gameBoxscoreTeamPlayersPerson.rosterStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, link, shootsCatches, rosterStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameBoxscoreTeamPlayersPerson {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    shootsCatches: ").append(toIndentedString(shootsCatches)).append("\n");
    sb.append("    rosterStatus: ").append(toIndentedString(rosterStatus)).append("\n");
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

