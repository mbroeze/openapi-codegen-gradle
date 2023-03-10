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
import nhlapi.model.GameEditorials;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameContentEditorial
 */
@JsonPropertyOrder({
  GameContentEditorial.JSON_PROPERTY_PREVIEW,
  GameContentEditorial.JSON_PROPERTY_ARTICLES,
  GameContentEditorial.JSON_PROPERTY_RECAP
})
@JsonTypeName("GameContent_editorial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameContentEditorial {
  public static final String JSON_PROPERTY_PREVIEW = "preview";
  private GameEditorials preview;

  public static final String JSON_PROPERTY_ARTICLES = "articles";
  private GameEditorials articles;

  public static final String JSON_PROPERTY_RECAP = "recap";
  private GameEditorials recap;

  public GameContentEditorial() {
  }

  public GameContentEditorial preview(GameEditorials preview) {
    
    this.preview = preview;
    return this;
  }

   /**
   * Get preview
   * @return preview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameEditorials getPreview() {
    return preview;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreview(GameEditorials preview) {
    this.preview = preview;
  }


  public GameContentEditorial articles(GameEditorials articles) {
    
    this.articles = articles;
    return this;
  }

   /**
   * Get articles
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARTICLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameEditorials getArticles() {
    return articles;
  }


  @JsonProperty(JSON_PROPERTY_ARTICLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArticles(GameEditorials articles) {
    this.articles = articles;
  }


  public GameContentEditorial recap(GameEditorials recap) {
    
    this.recap = recap;
    return this;
  }

   /**
   * Get recap
   * @return recap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameEditorials getRecap() {
    return recap;
  }


  @JsonProperty(JSON_PROPERTY_RECAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecap(GameEditorials recap) {
    this.recap = recap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameContentEditorial gameContentEditorial = (GameContentEditorial) o;
    return Objects.equals(this.preview, gameContentEditorial.preview) &&
        Objects.equals(this.articles, gameContentEditorial.articles) &&
        Objects.equals(this.recap, gameContentEditorial.recap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preview, articles, recap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameContentEditorial {\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    recap: ").append(toIndentedString(recap)).append("\n");
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

