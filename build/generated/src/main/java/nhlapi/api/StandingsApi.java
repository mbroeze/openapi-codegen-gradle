package nhlapi.api;

import nhlapi.invoker.ApiException;
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import nhlapi.model.Error;
import java.time.LocalDate;
import nhlapi.model.StandingTypesInner;
import nhlapi.model.Standings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class StandingsApi {
  private ApiClient apiClient;

  public StandingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StandingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all available NHL standing types.
   * 
   * @return a {@code List<StandingTypesInner>}
   * @throws ApiException if fails to make API call
   */
  public List<StandingTypesInner> getStandingTypes() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/standingsTypes".replaceAll("\\{format\\}","json");

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

    GenericType<List<StandingTypesInner>> localVarReturnType = new GenericType<List<StandingTypesInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get NHL division standings.
   * 
   * @param season Standings for a specified season. (optional)
   * @param date Standings on a specified date. (optional)
   * @return a {@code Standings}
   * @throws ApiException if fails to make API call
   */
  public Standings getStandings(LocalDate season, LocalDate date) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/standings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "season", season));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Standings> localVarReturnType = new GenericType<Standings>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get NHL standings for a specific standing type.
   * 
   * @param type Standing types:   * &#x60;byConference&#x60; - Standings by Conference   * &#x60;byDivision&#x60; - Standings by Division   * &#x60;byLeague&#x60; - Standings by League   * &#x60;divisionLeaders&#x60; - Division Leader standings   * &#x60;postseason&#x60; - Postseason Standings   * &#x60;preseason&#x60; - Preseason Standings   * &#x60;regularSeason&#x60; - Regular Season Standings   * &#x60;wildCard&#x60; - Wild card standings   * &#x60;wildCardWithLeaders&#x60; - Wild card standings with Division Leaders  (required)
   * @return a {@code Standings}
   * @throws ApiException if fails to make API call
   */
  public Standings getStandingsByType(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getStandingsByType");
    }
    
    // create path and map variables
    String localVarPath = "/standings/{type}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Standings> localVarReturnType = new GenericType<Standings>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
