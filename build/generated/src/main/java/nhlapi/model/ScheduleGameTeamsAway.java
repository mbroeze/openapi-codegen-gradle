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
import nhlapi.model.ScheduleGameTeamsAwayLeagueRecord;
import nhlapi.model.ScheduleGameTeamsAwayTeam;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ScheduleGameTeamsAway
 */
@JsonPropertyOrder({
  ScheduleGameTeamsAway.JSON_PROPERTY_LEAGUE_RECORD,
  ScheduleGameTeamsAway.JSON_PROPERTY_SCORE,
  ScheduleGameTeamsAway.JSON_PROPERTY_TEAM
})
@JsonTypeName("ScheduleGame_teams_away")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class ScheduleGameTeamsAway {
  public static final String JSON_PROPERTY_LEAGUE_RECORD = "leagueRecord";
  private ScheduleGameTeamsAwayLeagueRecord leagueRecord;

  public static final String JSON_PROPERTY_SCORE = "score";
  private BigDecimal score;

  public static final String JSON_PROPERTY_TEAM = "team";
  private ScheduleGameTeamsAwayTeam team;

  public ScheduleGameTeamsAway() {
  }

  public ScheduleGameTeamsAway leagueRecord(ScheduleGameTeamsAwayLeagueRecord leagueRecord) {
    
    this.leagueRecord = leagueRecord;
    return this;
  }

   /**
   * Get leagueRecord
   * @return leagueRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEAGUE_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleGameTeamsAwayLeagueRecord getLeagueRecord() {
    return leagueRecord;
  }


  @JsonProperty(JSON_PROPERTY_LEAGUE_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeagueRecord(ScheduleGameTeamsAwayLeagueRecord leagueRecord) {
    this.leagueRecord = leagueRecord;
  }


  public ScheduleGameTeamsAway score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(BigDecimal score) {
    this.score = score;
  }


  public ScheduleGameTeamsAway team(ScheduleGameTeamsAwayTeam team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleGameTeamsAwayTeam getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeam(ScheduleGameTeamsAwayTeam team) {
    this.team = team;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGameTeamsAway scheduleGameTeamsAway = (ScheduleGameTeamsAway) o;
    return Objects.equals(this.leagueRecord, scheduleGameTeamsAway.leagueRecord) &&
        Objects.equals(this.score, scheduleGameTeamsAway.score) &&
        Objects.equals(this.team, scheduleGameTeamsAway.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leagueRecord, score, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGameTeamsAway {\n");
    sb.append("    leagueRecord: ").append(toIndentedString(leagueRecord)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

