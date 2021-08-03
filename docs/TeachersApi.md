# TeachersApi

All URIs are relative to *https://api.clever.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictForTeacher**](TeachersApi.md#getDistrictForTeacher) | **GET** /teachers/{id}/district | 
[**getSchoolForTeacher**](TeachersApi.md#getSchoolForTeacher) | **GET** /teachers/{id}/school | 
[**getSchoolsForTeacher**](TeachersApi.md#getSchoolsForTeacher) | **GET** /teachers/{id}/schools | 
[**getSectionsForTeacher**](TeachersApi.md#getSectionsForTeacher) | **GET** /teachers/{id}/sections | 
[**getStudentsForTeacher**](TeachersApi.md#getStudentsForTeacher) | **GET** /teachers/{id}/students | 
[**getTeacher**](TeachersApi.md#getTeacher) | **GET** /teachers/{id} | 
[**getTeachers**](TeachersApi.md#getTeachers) | **GET** /teachers | 

<a name="getDistrictForTeacher"></a>
# **getDistrictForTeacher**
> DistrictResponse getDistrictForTeacher(id)



Returns the district for a teacher

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForTeacher(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getDistrictForTeacher");
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

<a name="getSchoolForTeacher"></a>
# **getSchoolForTeacher**
> SchoolResponse getSchoolForTeacher(id)



Retrieves school info for a teacher.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
String id = "id_example"; // String | 
try {
    SchoolResponse result = apiInstance.getSchoolForTeacher(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getSchoolForTeacher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SchoolResponse**](SchoolResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolsForTeacher"></a>
# **getSchoolsForTeacher**
> SchoolsResponse getSchoolsForTeacher(id, limit, startingAfter, endingBefore)



Returns the schools for a teacher

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchoolsForTeacher(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getSchoolsForTeacher");
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

<a name="getSectionsForTeacher"></a>
# **getSectionsForTeacher**
> SectionsResponse getSectionsForTeacher(id, limit, startingAfter, endingBefore)



Returns the sections for a teacher

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForTeacher(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getSectionsForTeacher");
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

<a name="getStudentsForTeacher"></a>
# **getStudentsForTeacher**
> StudentsResponse getStudentsForTeacher(id, limit, startingAfter, endingBefore)



Returns the students for a teacher

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    StudentsResponse result = apiInstance.getStudentsForTeacher(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getStudentsForTeacher");
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

[**StudentsResponse**](StudentsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeacher"></a>
# **getTeacher**
> TeacherResponse getTeacher(id)



Returns a specific teacher

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
String id = "id_example"; // String | 
try {
    TeacherResponse result = apiInstance.getTeacher(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getTeacher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TeacherResponse**](TeacherResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeachers"></a>
# **getTeachers**
> TeachersResponse getTeachers(limit, startingAfter, endingBefore, count)



Returns a list of teachers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeachersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TeachersApi apiInstance = new TeachersApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    TeachersResponse result = apiInstance.getTeachers(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeachersApi#getTeachers");
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

[**TeachersResponse**](TeachersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

