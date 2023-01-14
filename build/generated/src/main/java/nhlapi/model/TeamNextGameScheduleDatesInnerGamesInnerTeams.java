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
import nhlapi.model.TeamNextGameScheduleDatesInnerGamesInnerTeamsAway;
import nhlapi.model.TeamNextGameScheduleDatesInnerGamesInnerTeamsHome;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TeamNextGameScheduleDatesInnerGamesInnerTeams
 */
@JsonPropertyOrder({
  TeamNextGameScheduleDatesInnerGamesInnerTeams.JSON_PROPERTY_AWAY,
  TeamNextGameScheduleDatesInnerGamesInnerTeams.JSON_PROPERTY_HOME
})
@JsonTypeName("Team_nextGameSchedule_dates_inner_games_inner_teams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class TeamNextGameScheduleDatesInnerGamesInnerTeams {
  public static final String JSON_PROPERTY_AWAY = "away";
  private TeamNextGameScheduleDatesInnerGamesInnerTeamsAway away;

  public static final String JSON_PROPERTY_HOME = "home";
  private TeamNextGameScheduleDatesInnerGamesInnerTeamsHome home;

  public TeamNextGameScheduleDatesInnerGamesInnerTeams() {
  }

  public TeamNextGameScheduleDatesInnerGamesInnerTeams away(TeamNextGameScheduleDatesInnerGamesInnerTeamsAway away) {
    
    this.away = away;
    return this;
  }

   /**
   * Get away
   * @return away
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamNextGameScheduleDatesInnerGamesInnerTeamsAway getAway() {
    return away;
  }


  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAway(TeamNextGameScheduleDatesInnerGamesInnerTeamsAway away) {
    this.away = away;
  }


  public TeamNextGameScheduleDatesInnerGamesInnerTeams home(TeamNextGameScheduleDatesInnerGamesInnerTeamsHome home) {
    
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamNextGameScheduleDatesInnerGamesInnerTeamsHome getHome() {
    return home;
  }


  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHome(TeamNextGameScheduleDatesInnerGamesInnerTeamsHome home) {
    this.home = home;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamNextGameScheduleDatesInnerGamesInnerTeams teamNextGameScheduleDatesInnerGamesInnerTeams = (TeamNextGameScheduleDatesInnerGamesInnerTeams) o;
    return Objects.equals(this.away, teamNextGameScheduleDatesInnerGamesInnerTeams.away) &&
        Objects.equals(this.home, teamNextGameScheduleDatesInnerGamesInnerTeams.home);
  }

  @Override
  public int hashCode() {
    return Objects.hash(away, home);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamNextGameScheduleDatesInnerGamesInnerTeams {\n");
    sb.append("    away: ").append(toIndentedString(away)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
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

