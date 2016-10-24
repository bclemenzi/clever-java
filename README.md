# Clever Java Library

## What is Clever?

[Clever](https://clever.com/) provides an API that keeps educational applications rostered and up-to-date.

Features
--------

  * Supports Clever API - [Clever Developers](https://dev.clever.com)
  * Fully implemented authentication system.  Just enter your Clever credentials and go!
  * Published on Maven Central Repository.

Getting started
---------------
Including the Java library in your project

The easiest way to incorporate the library into your Java project is to use Maven. Simply add a new dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.nfbsoftware</groupId>
	<artifactId>clever-java</artifactId>
	<version>1.0.4</version>
</dependency>
```

Get some credentials
-----

First you need some credentials.  Either get some by paying Clever some money, or by [signing up for a sandbox account](https://clever.com/app-signup).

Usage
-----
The clever-java wrapper is broken up into a few different client classes.  This is to follow the pattern defined by the Clever API found at: [Clever API Exloper](https://clever.com/developers/docs/explorer#api_data)  This project currently has clients for the following:

 * CleverDistrictsClient - Covering the API endpoints for the "Districts" endpoints: [Districts API](https://clever.com/developers/docs/explorer#resource_districts)
 * CleverTeachersClient - Covering the API endpoints for the "Teachers" endpoints: [Teachers API](https://clever.com/developers/docs/explorer#resource_teachers)
 * CleverStudentsClient - Covering the API endpoints for the "Students" endpoints: [Students API](https://clever.com/developers/docs/explorer#resource_students)

```java	
String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN";  //set your district oAuth token id here.

CleverDistrictsClient cleverDistrictsClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);
CleverTeachersClient cleverTeachersClient = new CleverTeachersClient(DISTRICT_OAUTH_TOKEN);
CleverStudentsClient cleverStudentsClient = new CleverStudentsClient(DISTRICT_OAUTH_TOKEN);
```

Get the district information using the CleverDistrictsClient

```java	 
District districtValue = cleverDistrictsClient.getDistrict();
System.out.println("District ID: " + districtValue.getId());
```

Get a count of the number of schools within the district using the CleverDistrictsClient.  This can be useful when setting up your paging of the total number of records.

```java	 
String districtId = "4fd43cc56d11340000000005";
BigInteger schoolTotal = cleverDistrictsClient.countDistrictSchools(districtId);
System.out.println("School Count: " + schoolTotal.toString());
```

Get the first 10 schools within the district using the CleverDistrictsClient

```java	
String districtId = "4fd43cc56d11340000000005";
List<School> schoolList = cleverDistrictsClient.getDistrictSchools(districtId, 10, null, null);
        
for(School schoolValue : schoolList)
{
	System.out.println("School Name: " + schoolValue.getName());
}
```

Get the first 10 teachers within the district using the CleverDistrictsClient

```java	
String districtId = "4fd43cc56d11340000000005";
List<Teacher> teacherList = cleverDistrictsClient.getDistrictTeachers(districtId, 10, null, null);
        
for(Teacher teacherValue : teacherList)
{
	System.out.println("Teacher Name: " + teacherValue.getName());
}
```

Get the first 10 students within the district using the CleverDistrictsClient

```java	
String districtId = "4fd43cc56d11340000000005";
List<Student> studentList = cleverDistrictsClient.getDistrictStudents(districtId, 10, null, null);
        
for(Student studentValue : studentList)
{
	System.out.println("Student Name: " + studentValue.getName());
}
```

Get the teacher by their Clever ID using the CleverTeachersClient

```java	
String teacherId = "509fbd7ec474fab64a8e9d53";
Teacher teacherValue = cleverTeachersClient.getTeacher(teacherId);

System.out.println("Teacher Name: " + teacherValue.getName());
```

Get a teacher's first 10 sections (classrooms) using the CleverTeachersClient

```java	
String teacherId = "509fbd7ec474fab64a8e9d53";
List<Section> sectionList = cleverTeachersClient.getTeacherSections(teacherId, 10, null, null);
        
for(Section sectionValue : sectionList)
{
    System.out.println("Section Name: " + sectionValue.getName());
}
```

Get the student by their Clever ID using the CleverStudentsClient

```java	
String studentId = "530e5960049e75a9262cff1d";
Student studentValue = cleverStudentsClient.getStudent(studentId);

System.out.println("Student Name: " + studentValue.getName());
```

Get a student's first 10 sections (classrooms) using the CleverStudentsClient

```java	
String studentId = "530e5960049e75a9262cff1d";
List<Section> sectionList = cleverStudentsClient.getStudentSections(studentId, 10, null, null);
        
for(Section sectionValue : sectionList)
{
    System.out.println("Section Name: " + sectionValue.getName());
}
```
