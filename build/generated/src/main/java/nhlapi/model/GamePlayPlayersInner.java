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
import nhlapi.model.GamePlayPlayersInnerPlayer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GamePlayPlayersInner
 */
@JsonPropertyOrder({
  GamePlayPlayersInner.JSON_PROPERTY_PLAYER,
  GamePlayPlayersInner.JSON_PROPERTY_PLAYER_TYPE
})
@JsonTypeName("GamePlay_players_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GamePlayPlayersInner {
  public static final String JSON_PROPERTY_PLAYER = "player";
  private GamePlayPlayersInnerPlayer player;

  public static final String JSON_PROPERTY_PLAYER_TYPE = "playerType";
  private String playerType;

  public GamePlayPlayersInner() {
  }

  public GamePlayPlayersInner player(GamePlayPlayersInnerPlayer player) {
    
    this.player = player;
    return this;
  }

   /**
   * Get player
   * @return player
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GamePlayPlayersInnerPlayer getPlayer() {
    return player;
  }


  @JsonProperty(JSON_PROPERTY_PLAYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayer(GamePlayPlayersInnerPlayer player) {
    this.player = player;
  }


  public GamePlayPlayersInner playerType(String playerType) {
    
    this.playerType = playerType;
    return this;
  }

   /**
   * Get playerType
   * @return playerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Winner", value = "")
  @JsonProperty(JSON_PROPERTY_PLAYER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlayerType() {
    return playerType;
  }


  @JsonProperty(JSON_PROPERTY_PLAYER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayerType(String playerType) {
    this.playerType = playerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamePlayPlayersInner gamePlayPlayersInner = (GamePlayPlayersInner) o;
    return Objects.equals(this.player, gamePlayPlayersInner.player) &&
        Objects.equals(this.playerType, gamePlayPlayersInner.playerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(player, playerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamePlayPlayersInner {\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    playerType: ").append(toIndentedString(playerType)).append("\n");
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

