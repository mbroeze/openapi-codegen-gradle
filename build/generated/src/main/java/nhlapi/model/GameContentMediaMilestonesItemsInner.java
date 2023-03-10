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
import java.time.OffsetDateTime;
import nhlapi.model.GameHighlight;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameContentMediaMilestonesItemsInner
 */
@JsonPropertyOrder({
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_TITLE,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_DESCRIPTION,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_TYPE,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_TIME_ABSOLUTE,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_TIME_OFFSET,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_PERIOD,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_STATS_EVENT_ID,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_TEAM_ID,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_PLAYER_ID,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_PERIOD_TIME,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_ORDINAL_NUM,
  GameContentMediaMilestonesItemsInner.JSON_PROPERTY_HIGHLIGHT
})
@JsonTypeName("GameContent_media_milestones_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameContentMediaMilestonesItemsInner {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BROADCAST_START("BROADCAST_START"),
    
    BROADCAST_END("BROADCAST_END"),
    
    GOAL("GOAL"),
    
    PERIOD_END("PERIOD_END"),
    
    PERIOD_START("PERIOD_START"),
    
    SHOT("SHOT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TIME_ABSOLUTE = "timeAbsolute";
  private OffsetDateTime timeAbsolute;

  public static final String JSON_PROPERTY_TIME_OFFSET = "timeOffset";
  private String timeOffset;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private String period;

  public static final String JSON_PROPERTY_STATS_EVENT_ID = "statsEventId";
  private String statsEventId;

  public static final String JSON_PROPERTY_TEAM_ID = "teamId";
  private String teamId;

  public static final String JSON_PROPERTY_PLAYER_ID = "playerId";
  private String playerId;

  public static final String JSON_PROPERTY_PERIOD_TIME = "periodTime";
  private String periodTime;

  public static final String JSON_PROPERTY_ORDINAL_NUM = "ordinalNum";
  private String ordinalNum;

  public static final String JSON_PROPERTY_HIGHLIGHT = "highlight";
  private GameHighlight highlight;

  public GameContentMediaMilestonesItemsInner() {
  }

  public GameContentMediaMilestonesItemsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Broadcast Start", value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public GameContentMediaMilestonesItemsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Broadcast Start", value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GameContentMediaMilestonesItemsInner type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GameContentMediaMilestonesItemsInner timeAbsolute(OffsetDateTime timeAbsolute) {
    
    this.timeAbsolute = timeAbsolute;
    return this;
  }

   /**
   * Get timeAbsolute
   * @return timeAbsolute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeAbsolute() {
    return timeAbsolute;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeAbsolute(OffsetDateTime timeAbsolute) {
    this.timeAbsolute = timeAbsolute;
  }


  public GameContentMediaMilestonesItemsInner timeOffset(String timeOffset) {
    
    this.timeOffset = timeOffset;
    return this;
  }

   /**
   * Get timeOffset
   * @return timeOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")
  @JsonProperty(JSON_PROPERTY_TIME_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeOffset() {
    return timeOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIME_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeOffset(String timeOffset) {
    this.timeOffset = timeOffset;
  }


  public GameContentMediaMilestonesItemsInner period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(String period) {
    this.period = period;
  }


  public GameContentMediaMilestonesItemsInner statsEventId(String statsEventId) {
    
    this.statsEventId = statsEventId;
    return this;
  }

   /**
   * Get statsEventId
   * @return statsEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")
  @JsonProperty(JSON_PROPERTY_STATS_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatsEventId() {
    return statsEventId;
  }


  @JsonProperty(JSON_PROPERTY_STATS_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatsEventId(String statsEventId) {
    this.statsEventId = statsEventId;
  }


  public GameContentMediaMilestonesItemsInner teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28", value = "")
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamId() {
    return teamId;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public GameContentMediaMilestonesItemsInner playerId(String playerId) {
    
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8477046", value = "")
  @JsonProperty(JSON_PROPERTY_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlayerId() {
    return playerId;
  }


  @JsonProperty(JSON_PROPERTY_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  public GameContentMediaMilestonesItemsInner periodTime(String periodTime) {
    
    this.periodTime = periodTime;
    return this;
  }

   /**
   * Get periodTime
   * @return periodTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01:15", value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodTime() {
    return periodTime;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodTime(String periodTime) {
    this.periodTime = periodTime;
  }


  public GameContentMediaMilestonesItemsInner ordinalNum(String ordinalNum) {
    
    this.ordinalNum = ordinalNum;
    return this;
  }

   /**
   * Get ordinalNum
   * @return ordinalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1st", value = "")
  @JsonProperty(JSON_PROPERTY_ORDINAL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrdinalNum() {
    return ordinalNum;
  }


  @JsonProperty(JSON_PROPERTY_ORDINAL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrdinalNum(String ordinalNum) {
    this.ordinalNum = ordinalNum;
  }


  public GameContentMediaMilestonesItemsInner highlight(GameHighlight highlight) {
    
    this.highlight = highlight;
    return this;
  }

   /**
   * Get highlight
   * @return highlight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameHighlight getHighlight() {
    return highlight;
  }


  @JsonProperty(JSON_PROPERTY_HIGHLIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighlight(GameHighlight highlight) {
    this.highlight = highlight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameContentMediaMilestonesItemsInner gameContentMediaMilestonesItemsInner = (GameContentMediaMilestonesItemsInner) o;
    return Objects.equals(this.title, gameContentMediaMilestonesItemsInner.title) &&
        Objects.equals(this.description, gameContentMediaMilestonesItemsInner.description) &&
        Objects.equals(this.type, gameContentMediaMilestonesItemsInner.type) &&
        Objects.equals(this.timeAbsolute, gameContentMediaMilestonesItemsInner.timeAbsolute) &&
        Objects.equals(this.timeOffset, gameContentMediaMilestonesItemsInner.timeOffset) &&
        Objects.equals(this.period, gameContentMediaMilestonesItemsInner.period) &&
        Objects.equals(this.statsEventId, gameContentMediaMilestonesItemsInner.statsEventId) &&
        Objects.equals(this.teamId, gameContentMediaMilestonesItemsInner.teamId) &&
        Objects.equals(this.playerId, gameContentMediaMilestonesItemsInner.playerId) &&
        Objects.equals(this.periodTime, gameContentMediaMilestonesItemsInner.periodTime) &&
        Objects.equals(this.ordinalNum, gameContentMediaMilestonesItemsInner.ordinalNum) &&
        Objects.equals(this.highlight, gameContentMediaMilestonesItemsInner.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type, timeAbsolute, timeOffset, period, statsEventId, teamId, playerId, periodTime, ordinalNum, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameContentMediaMilestonesItemsInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeAbsolute: ").append(toIndentedString(timeAbsolute)).append("\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    statsEventId: ").append(toIndentedString(statsEventId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    periodTime: ").append(toIndentedString(periodTime)).append("\n");
    sb.append("    ordinalNum: ").append(toIndentedString(ordinalNum)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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

