# DistrictAdminsApi

All URIs are relative to *https://api.clever.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictAdmin**](DistrictAdminsApi.md#getDistrictAdmin) | **GET** /district_admins/{id} | 
[**getDistrictAdmins**](DistrictAdminsApi.md#getDistrictAdmins) | **GET** /district_admins | 
[**getDistrictForDistrictAdmin**](DistrictAdminsApi.md#getDistrictForDistrictAdmin) | **GET** /district_admins/{id}/district | 

<a name="getDistrictAdmin"></a>
# **getDistrictAdmin**
> DistrictAdminResponse getDistrictAdmin(id)



Returns a specific district admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DistrictAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DistrictAdminsApi apiInstance = new DistrictAdminsApi();
String id = "id_example"; // String | 
try {
    DistrictAdminResponse result = apiInstance.getDistrictAdmin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictAdminsApi#getDistrictAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictAdminResponse**](DistrictAdminResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictAdmins"></a>
# **getDistrictAdmins**
> DistrictAdminsResponse getDistrictAdmins(limit, startingAfter, endingBefore, count)



Returns a list of district admins

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DistrictAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DistrictAdminsApi apiInstance = new DistrictAdminsApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    DistrictAdminsResponse result = apiInstance.getDistrictAdmins(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictAdminsApi#getDistrictAdmins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**DistrictAdminsResponse**](DistrictAdminsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForDistrictAdmin"></a>
# **getDistrictForDistrictAdmin**
> DistrictResponse getDistrictForDistrictAdmin(id)



Returns the district for a district admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DistrictAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DistrictAdminsApi apiInstance = new DistrictAdminsApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForDistrictAdmin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictAdminsApi#getDistrictForDistrictAdmin");
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

