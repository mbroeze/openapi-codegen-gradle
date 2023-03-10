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
import java.time.OffsetDateTime;
import nhlapi.model.GameGameDataVenue;
import nhlapi.model.ScheduleGameContent;
import nhlapi.model.TeamNextGameScheduleDatesInnerGamesInnerStatus;
import nhlapi.model.TeamNextGameScheduleDatesInnerGamesInnerTeams;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TeamNextGameScheduleDatesInnerGamesInner
 */
@JsonPropertyOrder({
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_GAME_PK,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_LINK,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_GAME_TYPE,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_SEASON,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_GAME_DATE,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_STATUS,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_TEAMS,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_VENUE,
  TeamNextGameScheduleDatesInnerGamesInner.JSON_PROPERTY_CONTENT
})
@JsonTypeName("Team_nextGameSchedule_dates_inner_games_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class TeamNextGameScheduleDatesInnerGamesInner {
  public static final String JSON_PROPERTY_GAME_PK = "gamePk";
  private BigDecimal gamePk;

  public static final String JSON_PROPERTY_LINK = "link";
  private URI link;

  public static final String JSON_PROPERTY_GAME_TYPE = "gameType";
  private String gameType;

  public static final String JSON_PROPERTY_SEASON = "season";
  private String season;

  public static final String JSON_PROPERTY_GAME_DATE = "gameDate";
  private OffsetDateTime gameDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TeamNextGameScheduleDatesInnerGamesInnerStatus status;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private TeamNextGameScheduleDatesInnerGamesInnerTeams teams;

  public static final String JSON_PROPERTY_VENUE = "venue";
  private GameGameDataVenue venue;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private ScheduleGameContent content;

  public TeamNextGameScheduleDatesInnerGamesInner() {
  }

  public TeamNextGameScheduleDatesInnerGamesInner gamePk(BigDecimal gamePk) {
    
    this.gamePk = gamePk;
    return this;
  }

   /**
   * Get gamePk
   * @return gamePk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017020851", value = "")
  @JsonProperty(JSON_PROPERTY_GAME_PK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGamePk() {
    return gamePk;
  }


  @JsonProperty(JSON_PROPERTY_GAME_PK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGamePk(BigDecimal gamePk) {
    this.gamePk = gamePk;
  }


  public TeamNextGameScheduleDatesInnerGamesInner link(URI link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/api/v1/game/2017020851/feed/live", value = "")
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


  public TeamNextGameScheduleDatesInnerGamesInner gameType(String gameType) {
    
    this.gameType = gameType;
    return this;
  }

   /**
   * Get gameType
   * @return gameType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "R", value = "")
  @JsonProperty(JSON_PROPERTY_GAME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGameType() {
    return gameType;
  }


  @JsonProperty(JSON_PROPERTY_GAME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGameType(String gameType) {
    this.gameType = gameType;
  }


  public TeamNextGameScheduleDatesInnerGamesInner season(String season) {
    
    this.season = season;
    return this;
  }

   /**
   * Get season
   * @return season
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20172018", value = "")
  @JsonProperty(JSON_PROPERTY_SEASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSeason() {
    return season;
  }


  @JsonProperty(JSON_PROPERTY_SEASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeason(String season) {
    this.season = season;
  }


  public TeamNextGameScheduleDatesInnerGamesInner gameDate(OffsetDateTime gameDate) {
    
    this.gameDate = gameDate;
    return this;
  }

   /**
   * Get gameDate
   * @return gameDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-11T03:00Z", value = "")
  @JsonProperty(JSON_PROPERTY_GAME_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getGameDate() {
    return gameDate;
  }


  @JsonProperty(JSON_PROPERTY_GAME_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGameDate(OffsetDateTime gameDate) {
    this.gameDate = gameDate;
  }


  public TeamNextGameScheduleDatesInnerGamesInner status(TeamNextGameScheduleDatesInnerGamesInnerStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamNextGameScheduleDatesInnerGamesInnerStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TeamNextGameScheduleDatesInnerGamesInnerStatus status) {
    this.status = status;
  }


  public TeamNextGameScheduleDatesInnerGamesInner teams(TeamNextGameScheduleDatesInnerGamesInnerTeams teams) {
    
    this.teams = teams;
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamNextGameScheduleDatesInnerGamesInnerTeams getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeams(TeamNextGameScheduleDatesInnerGamesInnerTeams teams) {
    this.teams = teams;
  }


  public TeamNextGameScheduleDatesInnerGamesInner venue(GameGameDataVenue venue) {
    
    this.venue = venue;
    return this;
  }

   /**
   * Get venue
   * @return venue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameGameDataVenue getVenue() {
    return venue;
  }


  @JsonProperty(JSON_PROPERTY_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVenue(GameGameDataVenue venue) {
    this.venue = venue;
  }


  public TeamNextGameScheduleDatesInnerGamesInner content(ScheduleGameContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleGameContent getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(ScheduleGameContent content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamNextGameScheduleDatesInnerGamesInner teamNextGameScheduleDatesInnerGamesInner = (TeamNextGameScheduleDatesInnerGamesInner) o;
    return Objects.equals(this.gamePk, teamNextGameScheduleDatesInnerGamesInner.gamePk) &&
        Objects.equals(this.link, teamNextGameScheduleDatesInnerGamesInner.link) &&
        Objects.equals(this.gameType, teamNextGameScheduleDatesInnerGamesInner.gameType) &&
        Objects.equals(this.season, teamNextGameScheduleDatesInnerGamesInner.season) &&
        Objects.equals(this.gameDate, teamNextGameScheduleDatesInnerGamesInner.gameDate) &&
        Objects.equals(this.status, teamNextGameScheduleDatesInnerGamesInner.status) &&
        Objects.equals(this.teams, teamNextGameScheduleDatesInnerGamesInner.teams) &&
        Objects.equals(this.venue, teamNextGameScheduleDatesInnerGamesInner.venue) &&
        Objects.equals(this.content, teamNextGameScheduleDatesInnerGamesInner.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gamePk, link, gameType, season, gameDate, status, teams, venue, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamNextGameScheduleDatesInnerGamesInner {\n");
    sb.append("    gamePk: ").append(toIndentedString(gamePk)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    gameDate: ").append(toIndentedString(gameDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

