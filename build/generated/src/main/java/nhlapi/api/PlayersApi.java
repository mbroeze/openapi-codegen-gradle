package nhlapi.api;

import nhlapi.invoker.ApiException;
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import nhlapi.model.Error;
import nhlapi.model.PlayerStats;
import nhlapi.model.Players;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class PlayersApi {
  private ApiClient apiClient;

  public PlayersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PlayersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get an NHL player.
   * 
   * @param id The ID of the player. (required)
   * @return a {@code Players}
   * @throws ApiException if fails to make API call
   */
  public Players getPlayer(BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPlayer");
    }
    
    // create path and map variables
    String localVarPath = "/people/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Players> localVarReturnType = new GenericType<Players>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get specific statistics for an NHL player.
   * 
   * @param id The ID of the player. (required)
   * @param stats Stats explanations:   * &#x60;homeAndAway&#x60; - Provides a split between home and away games.   * &#x60;byMonth&#x60; - Monthly split of stats.   * &#x60;byDayOfWeek&#x60; - Split done by day of the week.   * &#x60;goalsByGameSituation&#x60; - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * &#x60;onPaceRegularSeason&#x60; - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * &#x60;regularSeasonStatRankings&#x60; - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * &#x60;statsSingleSeason&#x60; - Obtains single season statistics for a player.   * &#x60;vsConference&#x60; - Conference stats split.   * &#x60;vsDivision&#x60; - Division stats split.   * &#x60;vsTeam&#x60; - Conference stats split.   * &#x60;winLoss&#x60; - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away.  (required)
   * @param season Return a team&#39;s specific season. (optional)
   * @return a {@code PlayerStats}
   * @throws ApiException if fails to make API call
   */
  public PlayerStats getPlayerStats(BigDecimal id, String stats, BigDecimal season) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPlayerStats");
    }
    
    // verify the required parameter 'stats' is set
    if (stats == null) {
      throw new ApiException(400, "Missing the required parameter 'stats' when calling getPlayerStats");
    }
    
    // create path and map variables
    String localVarPath = "/people/{id}/stats".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stats", stats));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "season", season));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PlayerStats> localVarReturnType = new GenericType<PlayerStats>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
