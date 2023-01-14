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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import nhlapi.model.ScheduleGame;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ScheduleDay
 */
@JsonPropertyOrder({
  ScheduleDay.JSON_PROPERTY_DATE,
  ScheduleDay.JSON_PROPERTY_TOTAL_ITEMS,
  ScheduleDay.JSON_PROPERTY_TOTAL_EVENTS,
  ScheduleDay.JSON_PROPERTY_TOTAL_GAMES,
  ScheduleDay.JSON_PROPERTY_TOTAL_MATCHES,
  ScheduleDay.JSON_PROPERTY_GAMES,
  ScheduleDay.JSON_PROPERTY_EVENTS,
  ScheduleDay.JSON_PROPERTY_MATCHES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class ScheduleDay {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "totalItems";
  private BigDecimal totalItems;

  public static final String JSON_PROPERTY_TOTAL_EVENTS = "totalEvents";
  private BigDecimal totalEvents;

  public static final String JSON_PROPERTY_TOTAL_GAMES = "totalGames";
  private BigDecimal totalGames;

  public static final String JSON_PROPERTY_TOTAL_MATCHES = "totalMatches";
  private BigDecimal totalMatches;

  public static final String JSON_PROPERTY_GAMES = "games";
  private List<ScheduleGame> games = null;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<Object> events = null;

  public static final String JSON_PROPERTY_MATCHES = "matches";
  private List<Object> matches = null;

  public ScheduleDay() {
  }

  public ScheduleDay date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Feb 09 19:00:00 EST 2018", value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public ScheduleDay totalItems(BigDecimal totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalItems() {
    return totalItems;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalItems(BigDecimal totalItems) {
    this.totalItems = totalItems;
  }


  public ScheduleDay totalEvents(BigDecimal totalEvents) {
    
    this.totalEvents = totalEvents;
    return this;
  }

   /**
   * Get totalEvents
   * @return totalEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalEvents() {
    return totalEvents;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalEvents(BigDecimal totalEvents) {
    this.totalEvents = totalEvents;
  }


  public ScheduleDay totalGames(BigDecimal totalGames) {
    
    this.totalGames = totalGames;
    return this;
  }

   /**
   * Get totalGames
   * @return totalGames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_GAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalGames() {
    return totalGames;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_GAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalGames(BigDecimal totalGames) {
    this.totalGames = totalGames;
  }


  public ScheduleDay totalMatches(BigDecimal totalMatches) {
    
    this.totalMatches = totalMatches;
    return this;
  }

   /**
   * Get totalMatches
   * @return totalMatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalMatches() {
    return totalMatches;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalMatches(BigDecimal totalMatches) {
    this.totalMatches = totalMatches;
  }


  public ScheduleDay games(List<ScheduleGame> games) {
    
    this.games = games;
    return this;
  }

  public ScheduleDay addGamesItem(ScheduleGame gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

   /**
   * Get games
   * @return games
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ScheduleGame> getGames() {
    return games;
  }


  @JsonProperty(JSON_PROPERTY_GAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGames(List<ScheduleGame> games) {
    this.games = games;
  }


  public ScheduleDay events(List<Object> events) {
    
    this.events = events;
    return this;
  }

  public ScheduleDay addEventsItem(Object eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<Object> events) {
    this.events = events;
  }


  public ScheduleDay matches(List<Object> matches) {
    
    this.matches = matches;
    return this;
  }

  public ScheduleDay addMatchesItem(Object matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getMatches() {
    return matches;
  }


  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatches(List<Object> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDay scheduleDay = (ScheduleDay) o;
    return Objects.equals(this.date, scheduleDay.date) &&
        Objects.equals(this.totalItems, scheduleDay.totalItems) &&
        Objects.equals(this.totalEvents, scheduleDay.totalEvents) &&
        Objects.equals(this.totalGames, scheduleDay.totalGames) &&
        Objects.equals(this.totalMatches, scheduleDay.totalMatches) &&
        Objects.equals(this.games, scheduleDay.games) &&
        Objects.equals(this.events, scheduleDay.events) &&
        Objects.equals(this.matches, scheduleDay.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, totalItems, totalEvents, totalGames, totalMatches, games, events, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDay {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
    sb.append("    totalGames: ").append(toIndentedString(totalGames)).append("\n");
    sb.append("    totalMatches: ").append(toIndentedString(totalMatches)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
