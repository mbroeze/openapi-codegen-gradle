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
import nhlapi.model.PlayTypesPlayerTypesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlayTypes
 */
@JsonPropertyOrder({
  PlayTypes.JSON_PROPERTY_NAME,
  PlayTypes.JSON_PROPERTY_ID,
  PlayTypes.JSON_PROPERTY_CMS_KEY,
  PlayTypes.JSON_PROPERTY_PLAYER_TYPES,
  PlayTypes.JSON_PROPERTY_CODE,
  PlayTypes.JSON_PROPERTY_SECONDARY_EVENT_CODES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class PlayTypes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CMS_KEY = "cmsKey";
  private String cmsKey;

  public static final String JSON_PROPERTY_PLAYER_TYPES = "playerTypes";
  private List<PlayTypesPlayerTypesInner> playerTypes = null;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_SECONDARY_EVENT_CODES = "secondaryEventCodes";
  private List<String> secondaryEventCodes = null;

  public PlayTypes() {
  }

  public PlayTypes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PlayTypes id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PlayTypes cmsKey(String cmsKey) {
    
    this.cmsKey = cmsKey;
    return this;
  }

   /**
   * Get cmsKey
   * @return cmsKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CMS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCmsKey() {
    return cmsKey;
  }


  @JsonProperty(JSON_PROPERTY_CMS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmsKey(String cmsKey) {
    this.cmsKey = cmsKey;
  }


  public PlayTypes playerTypes(List<PlayTypesPlayerTypesInner> playerTypes) {
    
    this.playerTypes = playerTypes;
    return this;
  }

  public PlayTypes addPlayerTypesItem(PlayTypesPlayerTypesInner playerTypesItem) {
    if (this.playerTypes == null) {
      this.playerTypes = new ArrayList<>();
    }
    this.playerTypes.add(playerTypesItem);
    return this;
  }

   /**
   * Get playerTypes
   * @return playerTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAYER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlayTypesPlayerTypesInner> getPlayerTypes() {
    return playerTypes;
  }


  @JsonProperty(JSON_PROPERTY_PLAYER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayerTypes(List<PlayTypesPlayerTypesInner> playerTypes) {
    this.playerTypes = playerTypes;
  }


  public PlayTypes code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public PlayTypes secondaryEventCodes(List<String> secondaryEventCodes) {
    
    this.secondaryEventCodes = secondaryEventCodes;
    return this;
  }

  public PlayTypes addSecondaryEventCodesItem(String secondaryEventCodesItem) {
    if (this.secondaryEventCodes == null) {
      this.secondaryEventCodes = new ArrayList<>();
    }
    this.secondaryEventCodes.add(secondaryEventCodesItem);
    return this;
  }

   /**
   * Get secondaryEventCodes
   * @return secondaryEventCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDARY_EVENT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSecondaryEventCodes() {
    return secondaryEventCodes;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_EVENT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryEventCodes(List<String> secondaryEventCodes) {
    this.secondaryEventCodes = secondaryEventCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayTypes playTypes = (PlayTypes) o;
    return Objects.equals(this.name, playTypes.name) &&
        Objects.equals(this.id, playTypes.id) &&
        Objects.equals(this.cmsKey, playTypes.cmsKey) &&
        Objects.equals(this.playerTypes, playTypes.playerTypes) &&
        Objects.equals(this.code, playTypes.code) &&
        Objects.equals(this.secondaryEventCodes, playTypes.secondaryEventCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, cmsKey, playerTypes, code, secondaryEventCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayTypes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cmsKey: ").append(toIndentedString(cmsKey)).append("\n");
    sb.append("    playerTypes: ").append(toIndentedString(playerTypes)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    secondaryEventCodes: ").append(toIndentedString(secondaryEventCodes)).append("\n");
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

