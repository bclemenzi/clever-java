# SchoolAdminsApi

All URIs are relative to *https://api.clever.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictForSchoolAdmin**](SchoolAdminsApi.md#getDistrictForSchoolAdmin) | **GET** /school_admins/{id}/district | 
[**getSchoolAdmin**](SchoolAdminsApi.md#getSchoolAdmin) | **GET** /school_admins/{id} | 
[**getSchoolAdmins**](SchoolAdminsApi.md#getSchoolAdmins) | **GET** /school_admins | 
[**getSchoolsForSchoolAdmin**](SchoolAdminsApi.md#getSchoolsForSchoolAdmin) | **GET** /school_admins/{id}/schools | 

<a name="getDistrictForSchoolAdmin"></a>
# **getDistrictForSchoolAdmin**
> DistrictResponse getDistrictForSchoolAdmin(id)



Returns the district for a school admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchoolAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

SchoolAdminsApi apiInstance = new SchoolAdminsApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForSchoolAdmin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolAdminsApi#getDistrictForSchoolAdmin");
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

<a name="getSchoolAdmin"></a>
# **getSchoolAdmin**
> SchoolAdminResponse getSchoolAdmin(id)



Returns a specific school admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchoolAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

SchoolAdminsApi apiInstance = new SchoolAdminsApi();
String id = "id_example"; // String | 
try {
    SchoolAdminResponse result = apiInstance.getSchoolAdmin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolAdminsApi#getSchoolAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SchoolAdminResponse**](SchoolAdminResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolAdmins"></a>
# **getSchoolAdmins**
> SchoolAdminsResponse getSchoolAdmins(limit, startingAfter, endingBefore, count)



Returns a list of school admins

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchoolAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

SchoolAdminsApi apiInstance = new SchoolAdminsApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    SchoolAdminsResponse result = apiInstance.getSchoolAdmins(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolAdminsApi#getSchoolAdmins");
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

[**SchoolAdminsResponse**](SchoolAdminsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolsForSchoolAdmin"></a>
# **getSchoolsForSchoolAdmin**
> SchoolsResponse getSchoolsForSchoolAdmin(id, limit, startingAfter, endingBefore)



Returns the schools for a school admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchoolAdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

SchoolAdminsApi apiInstance = new SchoolAdminsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchoolsForSchoolAdmin(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolAdminsApi#getSchoolsForSchoolAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SchoolsResponse**](SchoolsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

