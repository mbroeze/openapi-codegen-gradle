# SeasonsApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSeasons**](SeasonsApi.md#getSeasons) | **GET** /seasons | Get all the NHL seasons. |



## getSeasons

> Seasons getSeasons()

Get all the NHL seasons.

Describes each season.

### Example

```java
// Import classes:
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.ApiException;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.models.*;
import nhlapi.api.SeasonsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        SeasonsApi apiInstance = new SeasonsApi(defaultClient);
        try {
            Seasons result = apiInstance.getSeasons();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeasonsApi#getSeasons");
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

[**Seasons**](Seasons.md)

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

