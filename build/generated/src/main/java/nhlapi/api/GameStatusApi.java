package nhlapi.api;

import nhlapi.invoker.ApiException;
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import nhlapi.model.Error;
import nhlapi.model.GameStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-14T14:36:24.881091-05:00[America/Toronto]")
public class GameStatusApi {
  private ApiClient apiClient;

  public GameStatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameStatusApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Returns a list of game status values
   * 
   * @return a {@code List<GameStatus>}
   * @throws ApiException if fails to make API call
   */
  public List<GameStatus> getGameStatus() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/gameStatus".replaceAll("\\{format\\}","json");

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

    GenericType<List<GameStatus>> localVarReturnType = new GenericType<List<GameStatus>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
