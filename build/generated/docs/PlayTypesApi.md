# PlayTypesApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayTypes**](PlayTypesApi.md#getPlayTypes) | **GET** /playTypes | This shows all the possible play types found within the liveData/plays portion of the game feed |



## getPlayTypes

> PlayTypes getPlayTypes()

This shows all the possible play types found within the liveData/plays portion of the game feed

### Example

```java
// Import classes:
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.ApiException;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.models.*;
import nhlapi.api.PlayTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        PlayTypesApi apiInstance = new PlayTypesApi(defaultClient);
        try {
            PlayTypes result = apiInstance.getPlayTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayTypesApi#getPlayTypes");
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

[**PlayTypes**](PlayTypes.md)

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

