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
import java.util.ArrayList;
import java.util.List;
import nhlapi.model.DraftDraftsInnerRoundsInnerPicksInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DraftDraftsInnerRoundsInner
 */
@JsonPropertyOrder({
  DraftDraftsInnerRoundsInner.JSON_PROPERTY_ROUND_NUMBER,
  DraftDraftsInnerRoundsInner.JSON_PROPERTY_ROUND,
  DraftDraftsInnerRoundsInner.JSON_PROPERTY_PICKS
})
@JsonTypeName("Draft_drafts_inner_rounds_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class DraftDraftsInnerRoundsInner {
  public static final String JSON_PROPERTY_ROUND_NUMBER = "roundNumber";
  private BigDecimal roundNumber;

  public static final String JSON_PROPERTY_ROUND = "round";
  private BigDecimal round;

  public static final String JSON_PROPERTY_PICKS = "picks";
  private List<DraftDraftsInnerRoundsInnerPicksInner> picks = null;

  public DraftDraftsInnerRoundsInner() {
  }

  public DraftDraftsInnerRoundsInner roundNumber(BigDecimal roundNumber) {
    
    this.roundNumber = roundNumber;
    return this;
  }

   /**
   * Get roundNumber
   * @return roundNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_ROUND_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRoundNumber() {
    return roundNumber;
  }


  @JsonProperty(JSON_PROPERTY_ROUND_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoundNumber(BigDecimal roundNumber) {
    this.roundNumber = roundNumber;
  }


  public DraftDraftsInnerRoundsInner round(BigDecimal round) {
    
    this.round = round;
    return this;
  }

   /**
   * Get round
   * @return round
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRound() {
    return round;
  }


  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRound(BigDecimal round) {
    this.round = round;
  }


  public DraftDraftsInnerRoundsInner picks(List<DraftDraftsInnerRoundsInnerPicksInner> picks) {
    
    this.picks = picks;
    return this;
  }

  public DraftDraftsInnerRoundsInner addPicksItem(DraftDraftsInnerRoundsInnerPicksInner picksItem) {
    if (this.picks == null) {
      this.picks = new ArrayList<>();
    }
    this.picks.add(picksItem);
    return this;
  }

   /**
   * Get picks
   * @return picks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DraftDraftsInnerRoundsInnerPicksInner> getPicks() {
    return picks;
  }


  @JsonProperty(JSON_PROPERTY_PICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPicks(List<DraftDraftsInnerRoundsInnerPicksInner> picks) {
    this.picks = picks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftDraftsInnerRoundsInner draftDraftsInnerRoundsInner = (DraftDraftsInnerRoundsInner) o;
    return Objects.equals(this.roundNumber, draftDraftsInnerRoundsInner.roundNumber) &&
        Objects.equals(this.round, draftDraftsInnerRoundsInner.round) &&
        Objects.equals(this.picks, draftDraftsInnerRoundsInner.picks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roundNumber, round, picks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftDraftsInnerRoundsInner {\n");
    sb.append("    roundNumber: ").append(toIndentedString(roundNumber)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    picks: ").append(toIndentedString(picks)).append("\n");
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

