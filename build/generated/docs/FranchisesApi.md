# FranchisesApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFranchise**](FranchisesApi.md#getFranchise) | **GET** /franchises/{id} | Gets information on a specific franchise |
| [**getFranchises**](FranchisesApi.md#getFranchises) | **GET** /franchises | Returns a list of franchises |



## getFranchise

> Franchises getFranchise(id)

Gets information on a specific franchise

### Example

```java
// Import classes:
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.ApiException;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.models.*;
import nhlapi.api.FranchisesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        FranchisesApi apiInstance = new FranchisesApi(defaultClient);
        BigDecimal id = new BigDecimal("2"); // BigDecimal | The franchise ID
        try {
            Franchises result = apiInstance.getFranchise(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FranchisesApi#getFranchise");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**| The franchise ID | |

### Return type

[**Franchises**](Franchises.md)

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


## getFranchises

> Franchises getFranchises()

Returns a list of franchises

### Example

```java
// Import classes:
import nhlapi.invoker.ApiClient;
import nhlapi.invoker.ApiException;
import nhlapi.invoker.Configuration;
import nhlapi.invoker.models.*;
import nhlapi.api.FranchisesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        FranchisesApi apiInstance = new FranchisesApi(defaultClient);
        try {
            Franchises result = apiInstance.getFranchises();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FranchisesApi#getFranchises");
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

[**Franchises**](Franchises.md)

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

