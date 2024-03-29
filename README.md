# Clever Java Library

## What is Clever?

[Clever](https://clever.com/) provides an API that keeps educational applications rostered and up-to-date.

Features
--------

  * Supports Clever API - [Clever Developers](https://dev.clever.com)
  * Fully implemented authentication system.  Just enter your Clever credentials and go!
  * Includes a number of help methods for working with Clever's Secure Sync.
  * Published on Maven Central Repository.

Getting started
---------------
Including the Java library in your project

The easiest way to incorporate the library into your Java project is to use Maven. Simply add a new dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.nfbsoftware</groupId>
	<artifactId>clever-java</artifactId>
	<version>2.0.0</version>
</dependency>
```

Get some credentials
-----

First you need some credentials.  Either get some by paying Clever some money, or by [signing up for a sandbox account](https://clever.com/app-signup).


## Getting Started

Please follow the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ContactsApi;

import java.io.File;
import java.util.*;

public class ContactsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi();
        String id = "id_example"; // String | 
        try {
            ContactResponse result = apiInstance.getContact(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContact");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ContactsApi;

import java.io.File;
import java.util.*;

public class ContactsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi();
        Integer limit = 56; // Integer | 
        String startingAfter = "startingAfter_example"; // String | 
        String endingBefore = "endingBefore_example"; // String | 
        String count = "count_example"; // String | 
        try {
            ContactsResponse result = apiInstance.getContacts(limit, startingAfter, endingBefore, count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContacts");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ContactsApi;

import java.io.File;
import java.util.*;

public class ContactsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi();
        String id = "id_example"; // String | 
        try {
            DistrictResponse result = apiInstance.getDistrictForContact(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getDistrictForContact");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ContactsApi;

import java.io.File;
import java.util.*;

public class ContactsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi();
        String id = "id_example"; // String | 
        Integer limit = 56; // Integer | 
        String startingAfter = "startingAfter_example"; // String | 
        String endingBefore = "endingBefore_example"; // String | 
        try {
            StudentsResponse result = apiInstance.getStudentsForContact(id, limit, startingAfter, endingBefore);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getStudentsForContact");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.clever.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContactsApi* | [**getContact**](docs/ContactsApi.md#getContact) | **GET** /contacts/{id} | 
*ContactsApi* | [**getContacts**](docs/ContactsApi.md#getContacts) | **GET** /contacts | 
*ContactsApi* | [**getDistrictForContact**](docs/ContactsApi.md#getDistrictForContact) | **GET** /contacts/{id}/district | 
*ContactsApi* | [**getStudentsForContact**](docs/ContactsApi.md#getStudentsForContact) | **GET** /contacts/{id}/students | 
*CoursesApi* | [**getCourse**](docs/CoursesApi.md#getCourse) | **GET** /courses/{id} | 
*CoursesApi* | [**getCourses**](docs/CoursesApi.md#getCourses) | **GET** /courses | 
*CoursesApi* | [**getDistrictForCourse**](docs/CoursesApi.md#getDistrictForCourse) | **GET** /courses/{id}/district | 
*CoursesApi* | [**getSectionsForCourse**](docs/CoursesApi.md#getSectionsForCourse) | **GET** /courses/{id}/sections | 
*DistrictAdminsApi* | [**getDistrictAdmin**](docs/DistrictAdminsApi.md#getDistrictAdmin) | **GET** /district_admins/{id} | 
*DistrictAdminsApi* | [**getDistrictAdmins**](docs/DistrictAdminsApi.md#getDistrictAdmins) | **GET** /district_admins | 
*DistrictAdminsApi* | [**getDistrictForDistrictAdmin**](docs/DistrictAdminsApi.md#getDistrictForDistrictAdmin) | **GET** /district_admins/{id}/district | 
*DistrictsApi* | [**getDistrict**](docs/DistrictsApi.md#getDistrict) | **GET** /districts/{id} | 
*DistrictsApi* | [**getDistricts**](docs/DistrictsApi.md#getDistricts) | **GET** /districts | 
*EventsApi* | [**getEvent**](docs/EventsApi.md#getEvent) | **GET** /events/{id} | 
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /events | 
*SchoolAdminsApi* | [**getDistrictForSchoolAdmin**](docs/SchoolAdminsApi.md#getDistrictForSchoolAdmin) | **GET** /school_admins/{id}/district | 
*SchoolAdminsApi* | [**getSchoolAdmin**](docs/SchoolAdminsApi.md#getSchoolAdmin) | **GET** /school_admins/{id} | 
*SchoolAdminsApi* | [**getSchoolAdmins**](docs/SchoolAdminsApi.md#getSchoolAdmins) | **GET** /school_admins | 
*SchoolAdminsApi* | [**getSchoolsForSchoolAdmin**](docs/SchoolAdminsApi.md#getSchoolsForSchoolAdmin) | **GET** /school_admins/{id}/schools | 
*SchoolsApi* | [**getDistrictForSchool**](docs/SchoolsApi.md#getDistrictForSchool) | **GET** /schools/{id}/district | 
*SchoolsApi* | [**getSchool**](docs/SchoolsApi.md#getSchool) | **GET** /schools/{id} | 
*SchoolsApi* | [**getSchools**](docs/SchoolsApi.md#getSchools) | **GET** /schools | 
*SchoolsApi* | [**getSectionsForSchool**](docs/SchoolsApi.md#getSectionsForSchool) | **GET** /schools/{id}/sections | 
*SchoolsApi* | [**getStudentsForSchool**](docs/SchoolsApi.md#getStudentsForSchool) | **GET** /schools/{id}/students | 
*SchoolsApi* | [**getTeachersForSchool**](docs/SchoolsApi.md#getTeachersForSchool) | **GET** /schools/{id}/teachers | 
*SectionsApi* | [**getCourseForSection**](docs/SectionsApi.md#getCourseForSection) | **GET** /sections/{id}/course | 
*SectionsApi* | [**getDistrictForSection**](docs/SectionsApi.md#getDistrictForSection) | **GET** /sections/{id}/district | 
*SectionsApi* | [**getSchoolForSection**](docs/SectionsApi.md#getSchoolForSection) | **GET** /sections/{id}/school | 
*SectionsApi* | [**getSection**](docs/SectionsApi.md#getSection) | **GET** /sections/{id} | 
*SectionsApi* | [**getSections**](docs/SectionsApi.md#getSections) | **GET** /sections | 
*SectionsApi* | [**getStudentsForSection**](docs/SectionsApi.md#getStudentsForSection) | **GET** /sections/{id}/students | 
*SectionsApi* | [**getTeacherForSection**](docs/SectionsApi.md#getTeacherForSection) | **GET** /sections/{id}/teacher | 
*SectionsApi* | [**getTeachersForSection**](docs/SectionsApi.md#getTeachersForSection) | **GET** /sections/{id}/teachers | 
*SectionsApi* | [**getTermForSection**](docs/SectionsApi.md#getTermForSection) | **GET** /sections/{id}/term | 
*StudentsApi* | [**getContactsForStudent**](docs/StudentsApi.md#getContactsForStudent) | **GET** /students/{id}/contacts | 
*StudentsApi* | [**getDistrictForStudent**](docs/StudentsApi.md#getDistrictForStudent) | **GET** /students/{id}/district | 
*StudentsApi* | [**getSchoolForStudent**](docs/StudentsApi.md#getSchoolForStudent) | **GET** /students/{id}/school | 
*StudentsApi* | [**getSchoolsForStudent**](docs/StudentsApi.md#getSchoolsForStudent) | **GET** /students/{id}/schools | 
*StudentsApi* | [**getSectionsForStudent**](docs/StudentsApi.md#getSectionsForStudent) | **GET** /students/{id}/sections | 
*StudentsApi* | [**getStudent**](docs/StudentsApi.md#getStudent) | **GET** /students/{id} | 
*StudentsApi* | [**getStudents**](docs/StudentsApi.md#getStudents) | **GET** /students | 
*StudentsApi* | [**getTeachersForStudent**](docs/StudentsApi.md#getTeachersForStudent) | **GET** /students/{id}/teachers | 
*TeachersApi* | [**getDistrictForTeacher**](docs/TeachersApi.md#getDistrictForTeacher) | **GET** /teachers/{id}/district | 
*TeachersApi* | [**getSchoolForTeacher**](docs/TeachersApi.md#getSchoolForTeacher) | **GET** /teachers/{id}/school | 
*TeachersApi* | [**getSchoolsForTeacher**](docs/TeachersApi.md#getSchoolsForTeacher) | **GET** /teachers/{id}/schools | 
*TeachersApi* | [**getSectionsForTeacher**](docs/TeachersApi.md#getSectionsForTeacher) | **GET** /teachers/{id}/sections | 
*TeachersApi* | [**getStudentsForTeacher**](docs/TeachersApi.md#getStudentsForTeacher) | **GET** /teachers/{id}/students | 
*TeachersApi* | [**getTeacher**](docs/TeachersApi.md#getTeacher) | **GET** /teachers/{id} | 
*TeachersApi* | [**getTeachers**](docs/TeachersApi.md#getTeachers) | **GET** /teachers | 
*TermsApi* | [**getDistrictForTerm**](docs/TermsApi.md#getDistrictForTerm) | **GET** /terms/{id}/district | 
*TermsApi* | [**getSectionsForTerm**](docs/TermsApi.md#getSectionsForTerm) | **GET** /terms/{id}/sections | 
*TermsApi* | [**getTerm**](docs/TermsApi.md#getTerm) | **GET** /terms/{id} | 
*TermsApi* | [**getTerms**](docs/TermsApi.md#getTerms) | **GET** /terms | 

## Documentation for Models

 - [AdminName](docs/AdminName.md)
 - [BadRequest](docs/BadRequest.md)
 - [Contact](docs/Contact.md)
 - [ContactObject](docs/ContactObject.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [ContactsCreated](docs/ContactsCreated.md)
 - [ContactsDeleted](docs/ContactsDeleted.md)
 - [ContactsResponse](docs/ContactsResponse.md)
 - [ContactsUpdated](docs/ContactsUpdated.md)
 - [Course](docs/Course.md)
 - [CourseObject](docs/CourseObject.md)
 - [CourseResponse](docs/CourseResponse.md)
 - [CoursesCreated](docs/CoursesCreated.md)
 - [CoursesDeleted](docs/CoursesDeleted.md)
 - [CoursesResponse](docs/CoursesResponse.md)
 - [CoursesUpdated](docs/CoursesUpdated.md)
 - [Credentials](docs/Credentials.md)
 - [District](docs/District.md)
 - [DistrictAdmin](docs/DistrictAdmin.md)
 - [DistrictAdminObject](docs/DistrictAdminObject.md)
 - [DistrictAdminResponse](docs/DistrictAdminResponse.md)
 - [DistrictAdminsResponse](docs/DistrictAdminsResponse.md)
 - [DistrictObject](docs/DistrictObject.md)
 - [DistrictResponse](docs/DistrictResponse.md)
 - [DistrictadminsCreated](docs/DistrictadminsCreated.md)
 - [DistrictadminsDeleted](docs/DistrictadminsDeleted.md)
 - [DistrictadminsUpdated](docs/DistrictadminsUpdated.md)
 - [DistrictsCreated](docs/DistrictsCreated.md)
 - [DistrictsDeleted](docs/DistrictsDeleted.md)
 - [DistrictsResponse](docs/DistrictsResponse.md)
 - [DistrictsUpdated](docs/DistrictsUpdated.md)
 - [Event](docs/Event.md)
 - [EventResponse](docs/EventResponse.md)
 - [EventsResponse](docs/EventsResponse.md)
 - [InternalError](docs/InternalError.md)
 - [Link](docs/Link.md)
 - [Location](docs/Location.md)
 - [Name](docs/Name.md)
 - [NotFound](docs/NotFound.md)
 - [Principal](docs/Principal.md)
 - [School](docs/School.md)
 - [SchoolAdmin](docs/SchoolAdmin.md)
 - [SchoolAdminObject](docs/SchoolAdminObject.md)
 - [SchoolAdminResponse](docs/SchoolAdminResponse.md)
 - [SchoolAdminsResponse](docs/SchoolAdminsResponse.md)
 - [SchoolEnrollment](docs/SchoolEnrollment.md)
 - [SchoolObject](docs/SchoolObject.md)
 - [SchoolResponse](docs/SchoolResponse.md)
 - [SchooladminsCreated](docs/SchooladminsCreated.md)
 - [SchooladminsDeleted](docs/SchooladminsDeleted.md)
 - [SchooladminsUpdated](docs/SchooladminsUpdated.md)
 - [SchoolsCreated](docs/SchoolsCreated.md)
 - [SchoolsDeleted](docs/SchoolsDeleted.md)
 - [SchoolsResponse](docs/SchoolsResponse.md)
 - [SchoolsUpdated](docs/SchoolsUpdated.md)
 - [Section](docs/Section.md)
 - [SectionObject](docs/SectionObject.md)
 - [SectionResponse](docs/SectionResponse.md)
 - [SectionsCreated](docs/SectionsCreated.md)
 - [SectionsDeleted](docs/SectionsDeleted.md)
 - [SectionsResponse](docs/SectionsResponse.md)
 - [SectionsUpdated](docs/SectionsUpdated.md)
 - [Student](docs/Student.md)
 - [StudentObject](docs/StudentObject.md)
 - [StudentResponse](docs/StudentResponse.md)
 - [StudentsCreated](docs/StudentsCreated.md)
 - [StudentsDeleted](docs/StudentsDeleted.md)
 - [StudentsResponse](docs/StudentsResponse.md)
 - [StudentsUpdated](docs/StudentsUpdated.md)
 - [Teacher](docs/Teacher.md)
 - [TeacherObject](docs/TeacherObject.md)
 - [TeacherResponse](docs/TeacherResponse.md)
 - [TeachersCreated](docs/TeachersCreated.md)
 - [TeachersDeleted](docs/TeachersDeleted.md)
 - [TeachersResponse](docs/TeachersResponse.md)
 - [TeachersUpdated](docs/TeachersUpdated.md)
 - [Term](docs/Term.md)
 - [TermObject](docs/TermObject.md)
 - [TermResponse](docs/TermResponse.md)
 - [TermsCreated](docs/TermsCreated.md)
 - [TermsDeleted](docs/TermsDeleted.md)
 - [TermsResponse](docs/TermsResponse.md)
 - [TermsUpdated](docs/TermsUpdated.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://clever.com/oauth/authorize
- **Scopes**: 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


