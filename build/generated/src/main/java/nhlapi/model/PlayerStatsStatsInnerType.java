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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlayerStatsStatsInnerType
 */
@JsonPropertyOrder({
  PlayerStatsStatsInnerType.JSON_PROPERTY_DISPLAY_NAME
})
@JsonTypeName("PlayerStats_stats_inner_type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class PlayerStatsStatsInnerType {
  /**
   * Gets or Sets displayName
   */
  public enum DisplayNameEnum {
    BYDAYOFWEEK("byDayOfWeek"),
    
    BYMONTH("byMonth"),
    
    GOALSBYGAMESITUATION("goalsByGameSituation"),
    
    HOMEANDAWAY("homeAndAway"),
    
    ONPACEREGULARSEASON("onPaceRegularSeason"),
    
    REGULARSEASONSTATRANKINGS("regularSeasonStatRankings"),
    
    STATSSINGLESEASON("statsSingleSeason"),
    
    VSCONFERENCE("vsConference"),
    
    VSDIVISION("vsDivision"),
    
    VSTEAM("vsTeam"),
    
    WINLOSS("winLoss");

    private String value;

    DisplayNameEnum(String value) {
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
    public static DisplayNameEnum fromValue(String value) {
      for (DisplayNameEnum b : DisplayNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private DisplayNameEnum displayName;

  public PlayerStatsStatsInnerType() {
  }

  public PlayerStatsStatsInnerType displayName(DisplayNameEnum displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayNameEnum getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(DisplayNameEnum displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerStatsStatsInnerType playerStatsStatsInnerType = (PlayerStatsStatsInnerType) o;
    return Objects.equals(this.displayName, playerStatsStatsInnerType.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerStatsStatsInnerType {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

