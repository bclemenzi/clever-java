# TermsApi

All URIs are relative to *https://api.clever.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictForTerm**](TermsApi.md#getDistrictForTerm) | **GET** /terms/{id}/district | 
[**getSectionsForTerm**](TermsApi.md#getSectionsForTerm) | **GET** /terms/{id}/sections | 
[**getTerm**](TermsApi.md#getTerm) | **GET** /terms/{id} | 
[**getTerms**](TermsApi.md#getTerms) | **GET** /terms | 

<a name="getDistrictForTerm"></a>
# **getDistrictForTerm**
> DistrictResponse getDistrictForTerm(id)



Returns the district for a term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TermsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TermsApi apiInstance = new TermsApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForTerm(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsApi#getDistrictForTerm");
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

<a name="getSectionsForTerm"></a>
# **getSectionsForTerm**
> SectionsResponse getSectionsForTerm(id, limit, startingAfter, endingBefore)



Returns the sections for a term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TermsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TermsApi apiInstance = new TermsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForTerm(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsApi#getSectionsForTerm");
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

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTerm"></a>
# **getTerm**
> TermResponse getTerm(id)



Returns a specific term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TermsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TermsApi apiInstance = new TermsApi();
String id = "id_example"; // String | 
try {
    TermResponse result = apiInstance.getTerm(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsApi#getTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TermResponse**](TermResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTerms"></a>
# **getTerms**
> TermsResponse getTerms(limit, startingAfter, endingBefore, count)



Returns a list of terms

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TermsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TermsApi apiInstance = new TermsApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    TermsResponse result = apiInstance.getTerms(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsApi#getTerms");
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

[**TermsResponse**](TermsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

