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
import nhlapi.model.GameGameDataDatetime;
import nhlapi.model.GameGameDataGame;
import nhlapi.model.GameGameDataStatus;
import nhlapi.model.GameGameDataTeams;
import nhlapi.model.GameGameDataVenue;
import nhlapi.model.Player;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameGameData
 */
@JsonPropertyOrder({
  GameGameData.JSON_PROPERTY_GAME,
  GameGameData.JSON_PROPERTY_DATETIME,
  GameGameData.JSON_PROPERTY_STATUS,
  GameGameData.JSON_PROPERTY_TEAMS,
  GameGameData.JSON_PROPERTY_PLAYERS,
  GameGameData.JSON_PROPERTY_VENUE
})
@JsonTypeName("Game_gameData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameGameData {
  public static final String JSON_PROPERTY_GAME = "game";
  private GameGameDataGame game;

  public static final String JSON_PROPERTY_DATETIME = "datetime";
  private GameGameDataDatetime datetime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private GameGameDataStatus status;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private GameGameDataTeams teams;

  public static final String JSON_PROPERTY_PLAYERS = "players";
  private Player players;

  public static final String JSON_PROPERTY_VENUE = "venue";
  private GameGameDataVenue venue;

  public GameGameData() {
  }

  public GameGameData game(GameGameDataGame game) {
    
    this.game = game;
    return this;
  }

   /**
   * Get game
   * @return game
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameGameDataGame getGame() {
    return game;
  }


  @JsonProperty(JSON_PROPERTY_GAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGame(GameGameDataGame game) {
    this.game = game;
  }


  public GameGameData datetime(GameGameDataDatetime datetime) {
    
    this.datetime = datetime;
    return this;
  }

   /**
   * Get datetime
   * @return datetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameGameDataDatetime getDatetime() {
    return datetime;
  }


  @JsonProperty(JSON_PROPERTY_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatetime(GameGameDataDatetime datetime) {
    this.datetime = datetime;
  }


  public GameGameData status(GameGameDataStatus status) {
    
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

  public GameGameDataStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(GameGameDataStatus status) {
    this.status = status;
  }


  public GameGameData teams(GameGameDataTeams teams) {
    
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

  public GameGameDataTeams getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeams(GameGameDataTeams teams) {
    this.teams = teams;
  }


  public GameGameData players(Player players) {
    
    this.players = players;
    return this;
  }

   /**
   * Get players
   * @return players
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Player getPlayers() {
    return players;
  }


  @JsonProperty(JSON_PROPERTY_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayers(Player players) {
    this.players = players;
  }


  public GameGameData venue(GameGameDataVenue venue) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameGameData gameGameData = (GameGameData) o;
    return Objects.equals(this.game, gameGameData.game) &&
        Objects.equals(this.datetime, gameGameData.datetime) &&
        Objects.equals(this.status, gameGameData.status) &&
        Objects.equals(this.teams, gameGameData.teams) &&
        Objects.equals(this.players, gameGameData.players) &&
        Objects.equals(this.venue, gameGameData.venue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(game, datetime, status, teams, players, venue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameGameData {\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
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

