# GameTypesApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameTypes**](GameTypesApi.md#getGameTypes) | **GET** /gameTypes | Returns list of game types with description and post-season status |



## getGameTypes

> List&lt;GameType&gt; getGameTypes()

Returns list of game types with description and post-season status

### Example

```java
// Import classes:
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.ApiException;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.models.*;
import nhlapi.api.GameTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        GameTypesApi apiInstance = new GameTypesApi(defaultClient);
        try {
            List<GameType> result = apiInstance.getGameTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameTypesApi#getGameTypes");
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

[**List&lt;GameType&gt;**](GameType.md)

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

