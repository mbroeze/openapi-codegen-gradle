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
 * GameHighlightPlaybacksInner
 */
@JsonPropertyOrder({
  GameHighlightPlaybacksInner.JSON_PROPERTY_NAME,
  GameHighlightPlaybacksInner.JSON_PROPERTY_WIDTH,
  GameHighlightPlaybacksInner.JSON_PROPERTY_HEIGHT,
  GameHighlightPlaybacksInner.JSON_PROPERTY_URL
})
@JsonTypeName("GameHighlight_playbacks_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameHighlightPlaybacksInner {
  /**
   * Gets or Sets name
   */
  public enum NameEnum {
    FLASH_192K_320X180("FLASH_192K_320X180"),
    
    FLASH_450K_400X224("FLASH_450K_400X224"),
    
    FLASH_1200K_640X360("FLASH_1200K_640X360"),
    
    FLASH_1800K_960X540("FLASH_1800K_960X540"),
    
    HTTP_CLOUD_MOBILE("HTTP_CLOUD_MOBILE"),
    
    HTTP_CLOUD_TABLET("HTTP_CLOUD_TABLET"),
    
    HTTP_CLOUD_TABLET_60("HTTP_CLOUD_TABLET_60"),
    
    HTTP_CLOUD_WIRED("HTTP_CLOUD_WIRED"),
    
    HTTP_CLOUD_WIRED_60("HTTP_CLOUD_WIRED_60"),
    
    HTTP_CLOUD_WIRED_WEB("HTTP_CLOUD_WIRED_WEB");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NAME = "name";
  private NameEnum name;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private String width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private String height;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public GameHighlightPlaybacksInner() {
  }

  public GameHighlightPlaybacksInner name(NameEnum name) {
    
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

  public NameEnum getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(NameEnum name) {
    this.name = name;
  }


  public GameHighlightPlaybacksInner width(String width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "960", value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(String width) {
    this.width = width;
  }


  public GameHighlightPlaybacksInner height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "540", value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(String height) {
    this.height = height;
  }


  public GameHighlightPlaybacksInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://md-akc.med.nhl.com/mp4/nhl/2018/02/11/ddec1fcc-3772-4769-a547-314de76c6c11/1518322152840/asset_1800k.mp4", value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameHighlightPlaybacksInner gameHighlightPlaybacksInner = (GameHighlightPlaybacksInner) o;
    return Objects.equals(this.name, gameHighlightPlaybacksInner.name) &&
        Objects.equals(this.width, gameHighlightPlaybacksInner.width) &&
        Objects.equals(this.height, gameHighlightPlaybacksInner.height) &&
        Objects.equals(this.url, gameHighlightPlaybacksInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, width, height, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameHighlightPlaybacksInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

