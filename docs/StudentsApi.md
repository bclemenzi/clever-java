# StudentsApi

All URIs are relative to *https://api.clever.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContactsForStudent**](StudentsApi.md#getContactsForStudent) | **GET** /students/{id}/contacts | 
[**getDistrictForStudent**](StudentsApi.md#getDistrictForStudent) | **GET** /students/{id}/district | 
[**getSchoolForStudent**](StudentsApi.md#getSchoolForStudent) | **GET** /students/{id}/school | 
[**getSchoolsForStudent**](StudentsApi.md#getSchoolsForStudent) | **GET** /students/{id}/schools | 
[**getSectionsForStudent**](StudentsApi.md#getSectionsForStudent) | **GET** /students/{id}/sections | 
[**getStudent**](StudentsApi.md#getStudent) | **GET** /students/{id} | 
[**getStudents**](StudentsApi.md#getStudents) | **GET** /students | 
[**getTeachersForStudent**](StudentsApi.md#getTeachersForStudent) | **GET** /students/{id}/teachers | 

<a name="getContactsForStudent"></a>
# **getContactsForStudent**
> ContactsResponse getContactsForStudent(id, limit, startingAfter, endingBefore)



Returns the contacts for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    ContactsResponse result = apiInstance.getContactsForStudent(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getContactsForStudent");
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

[**ContactsResponse**](ContactsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForStudent"></a>
# **getDistrictForStudent**
> DistrictResponse getDistrictForStudent(id)



Returns the district for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForStudent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getDistrictForStudent");
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

<a name="getSchoolForStudent"></a>
# **getSchoolForStudent**
> SchoolResponse getSchoolForStudent(id)



Returns the primary school for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
try {
    SchoolResponse result = apiInstance.getSchoolForStudent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getSchoolForStudent");
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

<a name="getSchoolsForStudent"></a>
# **getSchoolsForStudent**
> SchoolsResponse getSchoolsForStudent(id, limit, startingAfter, endingBefore)



Returns the schools for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchoolsForStudent(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getSchoolsForStudent");
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

<a name="getSectionsForStudent"></a>
# **getSectionsForStudent**
> SectionsResponse getSectionsForStudent(id, limit, startingAfter, endingBefore)



Returns the sections for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForStudent(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getSectionsForStudent");
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

<a name="getStudent"></a>
# **getStudent**
> StudentResponse getStudent(id)



Returns a specific student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
try {
    StudentResponse result = apiInstance.getStudent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**StudentResponse**](StudentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStudents"></a>
# **getStudents**
> StudentsResponse getStudents(limit, startingAfter, endingBefore, count)



Returns a list of students

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    StudentsResponse result = apiInstance.getStudents(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getStudents");
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

[**StudentsResponse**](StudentsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeachersForStudent"></a>
# **getTeachersForStudent**
> TeachersResponse getTeachersForStudent(id, limit, startingAfter, endingBefore)



Returns the teachers for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StudentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

StudentsApi apiInstance = new StudentsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    TeachersResponse result = apiInstance.getTeachersForStudent(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentsApi#getTeachersForStudent");
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

[**TeachersResponse**](TeachersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

