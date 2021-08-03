# DistrictsApi

All URIs are relative to *https://api.clever.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrict**](DistrictsApi.md#getDistrict) | **GET** /districts/{id} | 
[**getDistricts**](DistrictsApi.md#getDistricts) | **GET** /districts | 

<a name="getDistrict"></a>
# **getDistrict**
> DistrictResponse getDistrict(id)



Returns a specific district

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DistrictsApi apiInstance = new DistrictsApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrict(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#getDistrict");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistricts"></a>
# **getDistricts**
> DistrictsResponse getDistricts(count)



Returns a list of districts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DistrictsApi apiInstance = new DistrictsApi();
String count = "count_example"; // String | 
try {
    DistrictsResponse result = apiInstance.getDistricts(count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#getDistricts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**DistrictsResponse**](DistrictsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

