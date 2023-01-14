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
import nhlapi.model.Roster;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TeamRoster
 */
@JsonPropertyOrder({
  TeamRoster.JSON_PROPERTY_ROSTER
})
@JsonTypeName("Team_roster")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class TeamRoster {
  public static final String JSON_PROPERTY_ROSTER = "roster";
  private List<Roster> roster = null;

  public TeamRoster() {
  }

  public TeamRoster roster(List<Roster> roster) {
    
    this.roster = roster;
    return this;
  }

  public TeamRoster addRosterItem(Roster rosterItem) {
    if (this.roster == null) {
      this.roster = new ArrayList<>();
    }
    this.roster.add(rosterItem);
    return this;
  }

   /**
   * Get roster
   * @return roster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Roster> getRoster() {
    return roster;
  }


  @JsonProperty(JSON_PROPERTY_ROSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoster(List<Roster> roster) {
    this.roster = roster;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRoster teamRoster = (TeamRoster) o;
    return Objects.equals(this.roster, teamRoster.roster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRoster {\n");
    sb.append("    roster: ").append(toIndentedString(roster)).append("\n");
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

