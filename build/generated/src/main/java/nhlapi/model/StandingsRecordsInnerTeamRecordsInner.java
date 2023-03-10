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
import java.time.OffsetDateTime;
import nhlapi.model.PlayerCurrentTeam;
import nhlapi.model.ScheduleGameTeamsHomeLeagueRecord;
import nhlapi.model.StandingsRecordsInnerTeamRecordsInnerStreak;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StandingsRecordsInnerTeamRecordsInner
 */
@JsonPropertyOrder({
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_TEAM,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_LEAGUE_RECORD,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_GOALS_AGAINST,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_GOALS_SCORED,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_POINTS,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_DIVISION_RANK,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_CONFERENCE_RANK,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_LEAGUE_RANK,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_WILD_CARD_RANK,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_ROW,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_GAMES_PLAYED,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_STREAK,
  StandingsRecordsInnerTeamRecordsInner.JSON_PROPERTY_LAST_UPDATED
})
@JsonTypeName("Standings_records_inner_teamRecords_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class StandingsRecordsInnerTeamRecordsInner {
  public static final String JSON_PROPERTY_TEAM = "team";
  private PlayerCurrentTeam team;

  public static final String JSON_PROPERTY_LEAGUE_RECORD = "leagueRecord";
  private ScheduleGameTeamsHomeLeagueRecord leagueRecord;

  public static final String JSON_PROPERTY_GOALS_AGAINST = "goalsAgainst";
  private BigDecimal goalsAgainst;

  public static final String JSON_PROPERTY_GOALS_SCORED = "goalsScored";
  private BigDecimal goalsScored;

  public static final String JSON_PROPERTY_POINTS = "points";
  private BigDecimal points;

  public static final String JSON_PROPERTY_DIVISION_RANK = "divisionRank";
  private String divisionRank;

  public static final String JSON_PROPERTY_CONFERENCE_RANK = "conferenceRank";
  private String conferenceRank;

  public static final String JSON_PROPERTY_LEAGUE_RANK = "leagueRank";
  private String leagueRank;

  public static final String JSON_PROPERTY_WILD_CARD_RANK = "wildCardRank";
  private String wildCardRank;

  public static final String JSON_PROPERTY_ROW = "row";
  private BigDecimal row;

  public static final String JSON_PROPERTY_GAMES_PLAYED = "gamesPlayed";
  private BigDecimal gamesPlayed;

  public static final String JSON_PROPERTY_STREAK = "streak";
  private StandingsRecordsInnerTeamRecordsInnerStreak streak;

  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
  private OffsetDateTime lastUpdated;

  public StandingsRecordsInnerTeamRecordsInner() {
  }

  public StandingsRecordsInnerTeamRecordsInner team(PlayerCurrentTeam team) {
    
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

  public PlayerCurrentTeam getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeam(PlayerCurrentTeam team) {
    this.team = team;
  }


  public StandingsRecordsInnerTeamRecordsInner leagueRecord(ScheduleGameTeamsHomeLeagueRecord leagueRecord) {
    
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

  public ScheduleGameTeamsHomeLeagueRecord getLeagueRecord() {
    return leagueRecord;
  }


  @JsonProperty(JSON_PROPERTY_LEAGUE_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeagueRecord(ScheduleGameTeamsHomeLeagueRecord leagueRecord) {
    this.leagueRecord = leagueRecord;
  }


  public StandingsRecordsInnerTeamRecordsInner goalsAgainst(BigDecimal goalsAgainst) {
    
    this.goalsAgainst = goalsAgainst;
    return this;
  }

   /**
   * Get goalsAgainst
   * @return goalsAgainst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "154", value = "")
  @JsonProperty(JSON_PROPERTY_GOALS_AGAINST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGoalsAgainst() {
    return goalsAgainst;
  }


  @JsonProperty(JSON_PROPERTY_GOALS_AGAINST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoalsAgainst(BigDecimal goalsAgainst) {
    this.goalsAgainst = goalsAgainst;
  }


  public StandingsRecordsInnerTeamRecordsInner goalsScored(BigDecimal goalsScored) {
    
    this.goalsScored = goalsScored;
    return this;
  }

   /**
   * Get goalsScored
   * @return goalsScored
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "162", value = "")
  @JsonProperty(JSON_PROPERTY_GOALS_SCORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGoalsScored() {
    return goalsScored;
  }


  @JsonProperty(JSON_PROPERTY_GOALS_SCORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoalsScored(BigDecimal goalsScored) {
    this.goalsScored = goalsScored;
  }


  public StandingsRecordsInnerTeamRecordsInner points(BigDecimal points) {
    
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "66", value = "")
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(BigDecimal points) {
    this.points = points;
  }


  public StandingsRecordsInnerTeamRecordsInner divisionRank(String divisionRank) {
    
    this.divisionRank = divisionRank;
    return this;
  }

   /**
   * Get divisionRank
   * @return divisionRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")
  @JsonProperty(JSON_PROPERTY_DIVISION_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDivisionRank() {
    return divisionRank;
  }


  @JsonProperty(JSON_PROPERTY_DIVISION_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivisionRank(String divisionRank) {
    this.divisionRank = divisionRank;
  }


  public StandingsRecordsInnerTeamRecordsInner conferenceRank(String conferenceRank) {
    
    this.conferenceRank = conferenceRank;
    return this;
  }

   /**
   * Get conferenceRank
   * @return conferenceRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "")
  @JsonProperty(JSON_PROPERTY_CONFERENCE_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConferenceRank() {
    return conferenceRank;
  }


  @JsonProperty(JSON_PROPERTY_CONFERENCE_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConferenceRank(String conferenceRank) {
    this.conferenceRank = conferenceRank;
  }


  public StandingsRecordsInnerTeamRecordsInner leagueRank(String leagueRank) {
    
    this.leagueRank = leagueRank;
    return this;
  }

   /**
   * Get leagueRank
   * @return leagueRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "")
  @JsonProperty(JSON_PROPERTY_LEAGUE_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLeagueRank() {
    return leagueRank;
  }


  @JsonProperty(JSON_PROPERTY_LEAGUE_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeagueRank(String leagueRank) {
    this.leagueRank = leagueRank;
  }


  public StandingsRecordsInnerTeamRecordsInner wildCardRank(String wildCardRank) {
    
    this.wildCardRank = wildCardRank;
    return this;
  }

   /**
   * Get wildCardRank
   * @return wildCardRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_WILD_CARD_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWildCardRank() {
    return wildCardRank;
  }


  @JsonProperty(JSON_PROPERTY_WILD_CARD_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWildCardRank(String wildCardRank) {
    this.wildCardRank = wildCardRank;
  }


  public StandingsRecordsInnerTeamRecordsInner row(BigDecimal row) {
    
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26", value = "")
  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRow() {
    return row;
  }


  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRow(BigDecimal row) {
    this.row = row;
  }


  public StandingsRecordsInnerTeamRecordsInner gamesPlayed(BigDecimal gamesPlayed) {
    
    this.gamesPlayed = gamesPlayed;
    return this;
  }

   /**
   * Get gamesPlayed
   * @return gamesPlayed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "55", value = "")
  @JsonProperty(JSON_PROPERTY_GAMES_PLAYED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGamesPlayed() {
    return gamesPlayed;
  }


  @JsonProperty(JSON_PROPERTY_GAMES_PLAYED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGamesPlayed(BigDecimal gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
  }


  public StandingsRecordsInnerTeamRecordsInner streak(StandingsRecordsInnerTeamRecordsInnerStreak streak) {
    
    this.streak = streak;
    return this;
  }

   /**
   * Get streak
   * @return streak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StandingsRecordsInnerTeamRecordsInnerStreak getStreak() {
    return streak;
  }


  @JsonProperty(JSON_PROPERTY_STREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreak(StandingsRecordsInnerTeamRecordsInnerStreak streak) {
    this.streak = streak;
  }


  public StandingsRecordsInnerTeamRecordsInner lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-11T00:57:18Z", value = "")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsRecordsInnerTeamRecordsInner standingsRecordsInnerTeamRecordsInner = (StandingsRecordsInnerTeamRecordsInner) o;
    return Objects.equals(this.team, standingsRecordsInnerTeamRecordsInner.team) &&
        Objects.equals(this.leagueRecord, standingsRecordsInnerTeamRecordsInner.leagueRecord) &&
        Objects.equals(this.goalsAgainst, standingsRecordsInnerTeamRecordsInner.goalsAgainst) &&
        Objects.equals(this.goalsScored, standingsRecordsInnerTeamRecordsInner.goalsScored) &&
        Objects.equals(this.points, standingsRecordsInnerTeamRecordsInner.points) &&
        Objects.equals(this.divisionRank, standingsRecordsInnerTeamRecordsInner.divisionRank) &&
        Objects.equals(this.conferenceRank, standingsRecordsInnerTeamRecordsInner.conferenceRank) &&
        Objects.equals(this.leagueRank, standingsRecordsInnerTeamRecordsInner.leagueRank) &&
        Objects.equals(this.wildCardRank, standingsRecordsInnerTeamRecordsInner.wildCardRank) &&
        Objects.equals(this.row, standingsRecordsInnerTeamRecordsInner.row) &&
        Objects.equals(this.gamesPlayed, standingsRecordsInnerTeamRecordsInner.gamesPlayed) &&
        Objects.equals(this.streak, standingsRecordsInnerTeamRecordsInner.streak) &&
        Objects.equals(this.lastUpdated, standingsRecordsInnerTeamRecordsInner.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, leagueRecord, goalsAgainst, goalsScored, points, divisionRank, conferenceRank, leagueRank, wildCardRank, row, gamesPlayed, streak, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsRecordsInnerTeamRecordsInner {\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    leagueRecord: ").append(toIndentedString(leagueRecord)).append("\n");
    sb.append("    goalsAgainst: ").append(toIndentedString(goalsAgainst)).append("\n");
    sb.append("    goalsScored: ").append(toIndentedString(goalsScored)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    divisionRank: ").append(toIndentedString(divisionRank)).append("\n");
    sb.append("    conferenceRank: ").append(toIndentedString(conferenceRank)).append("\n");
    sb.append("    leagueRank: ").append(toIndentedString(leagueRank)).append("\n");
    sb.append("    wildCardRank: ").append(toIndentedString(wildCardRank)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    gamesPlayed: ").append(toIndentedString(gamesPlayed)).append("\n");
    sb.append("    streak: ").append(toIndentedString(streak)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

