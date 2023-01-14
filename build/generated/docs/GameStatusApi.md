# GameStatusApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameStatus**](GameStatusApi.md#getGameStatus) | **GET** /gameStatus | Returns a list of game status values |



## getGameStatus

> List&lt;GameStatus&gt; getGameStatus()

Returns a list of game status values

### Example

```java
// Import classes:
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.ApiException;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.models.*;
import nhlapi.api.GameStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        GameStatusApi apiInstance = new GameStatusApi(defaultClient);
        try {
            List<GameStatus> result = apiInstance.getGameStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameStatusApi#getGameStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GameStatus&gt;**](GameStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Error |  -  |

