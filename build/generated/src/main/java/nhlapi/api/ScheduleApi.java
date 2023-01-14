package nhlapi.api;

import nhlapi.invoker.ApiException;
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import nhlapi.model.Error;
import java.time.LocalDate;
import nhlapi.model.Schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class ScheduleApi {
  private ApiClient apiClient;

  public ScheduleApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScheduleApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the NHL game schedule.
   * 
   * @param expand Expand explanations:   * &#x60;schedule.brodcasts&#x60; - Shows the broadcasts of the game.   * &#x60;schedule.linescore&#x60; - Linescore for completed games.   * &#x60;schedule.ticket&#x60; - Provides the different places to buy tickets for the upcoming games.   * &#x60;team.schedule.previous&#x60; - Same as above but for the last game played.  (optional)
   * @param teamId Limit results to a specific team. Team ids can be found through the teams endpoint (optional)
   * @param startDate Start date for the search. (optional)
   * @param endDate End date for the search. (optional)
   * @return a {@code Schedule}
   * @throws ApiException if fails to make API call
   */
  public Schedule getSchedule(String expand, String teamId, LocalDate startDate, LocalDate endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/schedule".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "teamId", teamId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Schedule> localVarReturnType = new GenericType<Schedule>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
