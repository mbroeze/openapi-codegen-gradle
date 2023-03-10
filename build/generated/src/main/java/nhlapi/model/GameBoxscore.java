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
import nhlapi.model.GameBoxscoreTeams;
import nhlapi.model.GameOfficial;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameBoxscore
 */
@JsonPropertyOrder({
  GameBoxscore.JSON_PROPERTY_TEAMS,
  GameBoxscore.JSON_PROPERTY_OFFICIALS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameBoxscore {
  public static final String JSON_PROPERTY_TEAMS = "teams";
  private GameBoxscoreTeams teams;

  public static final String JSON_PROPERTY_OFFICIALS = "officials";
  private List<GameOfficial> officials = null;

  public GameBoxscore() {
  }

  public GameBoxscore teams(GameBoxscoreTeams teams) {
    
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

  public GameBoxscoreTeams getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeams(GameBoxscoreTeams teams) {
    this.teams = teams;
  }


  public GameBoxscore officials(List<GameOfficial> officials) {
    
    this.officials = officials;
    return this;
  }

  public GameBoxscore addOfficialsItem(GameOfficial officialsItem) {
    if (this.officials == null) {
      this.officials = new ArrayList<>();
    }
    this.officials.add(officialsItem);
    return this;
  }

   /**
   * Get officials
   * @return officials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFICIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GameOfficial> getOfficials() {
    return officials;
  }


  @JsonProperty(JSON_PROPERTY_OFFICIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfficials(List<GameOfficial> officials) {
    this.officials = officials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameBoxscore gameBoxscore = (GameBoxscore) o;
    return Objects.equals(this.teams, gameBoxscore.teams) &&
        Objects.equals(this.officials, gameBoxscore.officials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teams, officials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameBoxscore {\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    officials: ").append(toIndentedString(officials)).append("\n");
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

