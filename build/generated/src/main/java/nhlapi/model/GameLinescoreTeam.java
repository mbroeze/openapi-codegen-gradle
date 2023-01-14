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
import nhlapi.model.GameBoxscoreTeamTeam;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameLinescoreTeam
 */
@JsonPropertyOrder({
  GameLinescoreTeam.JSON_PROPERTY_TEAM,
  GameLinescoreTeam.JSON_PROPERTY_GOALS,
  GameLinescoreTeam.JSON_PROPERTY_SHOTS_ON_GOAL,
  GameLinescoreTeam.JSON_PROPERTY_GOALIE_PULLED,
  GameLinescoreTeam.JSON_PROPERTY_NUM_SKATERS,
  GameLinescoreTeam.JSON_PROPERTY_POWER_PLAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameLinescoreTeam {
  public static final String JSON_PROPERTY_TEAM = "team";
  private GameBoxscoreTeamTeam team;

  public static final String JSON_PROPERTY_GOALS = "goals";
  private BigDecimal goals;

  public static final String JSON_PROPERTY_SHOTS_ON_GOAL = "shotsOnGoal";
  private BigDecimal shotsOnGoal;

  public static final String JSON_PROPERTY_GOALIE_PULLED = "goaliePulled";
  private Boolean goaliePulled;

  public static final String JSON_PROPERTY_NUM_SKATERS = "numSkaters";
  private BigDecimal numSkaters;

  public static final String JSON_PROPERTY_POWER_PLAY = "powerPlay";
  private Boolean powerPlay;

  public GameLinescoreTeam() {
  }

  public GameLinescoreTeam team(GameBoxscoreTeamTeam team) {
    
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

  public GameBoxscoreTeamTeam getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeam(GameBoxscoreTeamTeam team) {
    this.team = team;
  }


  public GameLinescoreTeam goals(BigDecimal goals) {
    
    this.goals = goals;
    return this;
  }

   /**
   * Get goals
   * @return goals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")
  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGoals() {
    return goals;
  }


  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoals(BigDecimal goals) {
    this.goals = goals;
  }


  public GameLinescoreTeam shotsOnGoal(BigDecimal shotsOnGoal) {
    
    this.shotsOnGoal = shotsOnGoal;
    return this;
  }

   /**
   * Get shotsOnGoal
   * @return shotsOnGoal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")
  @JsonProperty(JSON_PROPERTY_SHOTS_ON_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getShotsOnGoal() {
    return shotsOnGoal;
  }


  @JsonProperty(JSON_PROPERTY_SHOTS_ON_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShotsOnGoal(BigDecimal shotsOnGoal) {
    this.shotsOnGoal = shotsOnGoal;
  }


  public GameLinescoreTeam goaliePulled(Boolean goaliePulled) {
    
    this.goaliePulled = goaliePulled;
    return this;
  }

   /**
   * Get goaliePulled
   * @return goaliePulled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOALIE_PULLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGoaliePulled() {
    return goaliePulled;
  }


  @JsonProperty(JSON_PROPERTY_GOALIE_PULLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoaliePulled(Boolean goaliePulled) {
    this.goaliePulled = goaliePulled;
  }


  public GameLinescoreTeam numSkaters(BigDecimal numSkaters) {
    
    this.numSkaters = numSkaters;
    return this;
  }

   /**
   * Get numSkaters
   * @return numSkaters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")
  @JsonProperty(JSON_PROPERTY_NUM_SKATERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumSkaters() {
    return numSkaters;
  }


  @JsonProperty(JSON_PROPERTY_NUM_SKATERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumSkaters(BigDecimal numSkaters) {
    this.numSkaters = numSkaters;
  }


  public GameLinescoreTeam powerPlay(Boolean powerPlay) {
    
    this.powerPlay = powerPlay;
    return this;
  }

   /**
   * Get powerPlay
   * @return powerPlay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POWER_PLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPowerPlay() {
    return powerPlay;
  }


  @JsonProperty(JSON_PROPERTY_POWER_PLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerPlay(Boolean powerPlay) {
    this.powerPlay = powerPlay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameLinescoreTeam gameLinescoreTeam = (GameLinescoreTeam) o;
    return Objects.equals(this.team, gameLinescoreTeam.team) &&
        Objects.equals(this.goals, gameLinescoreTeam.goals) &&
        Objects.equals(this.shotsOnGoal, gameLinescoreTeam.shotsOnGoal) &&
        Objects.equals(this.goaliePulled, gameLinescoreTeam.goaliePulled) &&
        Objects.equals(this.numSkaters, gameLinescoreTeam.numSkaters) &&
        Objects.equals(this.powerPlay, gameLinescoreTeam.powerPlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, goals, shotsOnGoal, goaliePulled, numSkaters, powerPlay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLinescoreTeam {\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    shotsOnGoal: ").append(toIndentedString(shotsOnGoal)).append("\n");
    sb.append("    goaliePulled: ").append(toIndentedString(goaliePulled)).append("\n");
    sb.append("    numSkaters: ").append(toIndentedString(numSkaters)).append("\n");
    sb.append("    powerPlay: ").append(toIndentedString(powerPlay)).append("\n");
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

