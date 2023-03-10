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
import nhlapi.model.GameHighlights;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameContentHighlights
 */
@JsonPropertyOrder({
  GameContentHighlights.JSON_PROPERTY_SCOREBOARD,
  GameContentHighlights.JSON_PROPERTY_GAME_CENTER
})
@JsonTypeName("GameContent_highlights")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameContentHighlights {
  public static final String JSON_PROPERTY_SCOREBOARD = "scoreboard";
  private GameHighlights scoreboard;

  public static final String JSON_PROPERTY_GAME_CENTER = "gameCenter";
  private GameHighlights gameCenter;

  public GameContentHighlights() {
  }

  public GameContentHighlights scoreboard(GameHighlights scoreboard) {
    
    this.scoreboard = scoreboard;
    return this;
  }

   /**
   * Get scoreboard
   * @return scoreboard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCOREBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameHighlights getScoreboard() {
    return scoreboard;
  }


  @JsonProperty(JSON_PROPERTY_SCOREBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreboard(GameHighlights scoreboard) {
    this.scoreboard = scoreboard;
  }


  public GameContentHighlights gameCenter(GameHighlights gameCenter) {
    
    this.gameCenter = gameCenter;
    return this;
  }

   /**
   * Get gameCenter
   * @return gameCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAME_CENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameHighlights getGameCenter() {
    return gameCenter;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGameCenter(GameHighlights gameCenter) {
    this.gameCenter = gameCenter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameContentHighlights gameContentHighlights = (GameContentHighlights) o;
    return Objects.equals(this.scoreboard, gameContentHighlights.scoreboard) &&
        Objects.equals(this.gameCenter, gameContentHighlights.gameCenter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scoreboard, gameCenter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameContentHighlights {\n");
    sb.append("    scoreboard: ").append(toIndentedString(scoreboard)).append("\n");
    sb.append("    gameCenter: ").append(toIndentedString(gameCenter)).append("\n");
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

