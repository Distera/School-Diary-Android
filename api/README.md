# org.openapitools.client - Kotlin client library for SchoolDiary

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GradesApi* | [**gradesGet**](docs/GradesApi.md#gradesget) | **GET** /Grades | 
*GradesApi* | [**gradesIdDelete**](docs/GradesApi.md#gradesiddelete) | **DELETE** /Grades/{id} | 
*GradesApi* | [**gradesIdGet**](docs/GradesApi.md#gradesidget) | **GET** /Grades/{id} | 
*GradesApi* | [**gradesIdPut**](docs/GradesApi.md#gradesidput) | **PUT** /Grades/{id} | 
*GradesApi* | [**gradesPost**](docs/GradesApi.md#gradespost) | **POST** /Grades | 
*StudentsApi* | [**studentsGet**](docs/StudentsApi.md#studentsget) | **GET** /Students | 
*StudentsApi* | [**studentsIdDelete**](docs/StudentsApi.md#studentsiddelete) | **DELETE** /Students/{id} | 
*StudentsApi* | [**studentsIdGet**](docs/StudentsApi.md#studentsidget) | **GET** /Students/{id} | 
*StudentsApi* | [**studentsIdPut**](docs/StudentsApi.md#studentsidput) | **PUT** /Students/{id} | 
*StudentsApi* | [**studentsPost**](docs/StudentsApi.md#studentspost) | **POST** /Students | 
*SubjectsApi* | [**subjectsGet**](docs/SubjectsApi.md#subjectsget) | **GET** /Subjects | 
*SubjectsApi* | [**subjectsIdDelete**](docs/SubjectsApi.md#subjectsiddelete) | **DELETE** /Subjects/{id} | 
*SubjectsApi* | [**subjectsIdGet**](docs/SubjectsApi.md#subjectsidget) | **GET** /Subjects/{id} | 
*SubjectsApi* | [**subjectsIdPut**](docs/SubjectsApi.md#subjectsidput) | **PUT** /Subjects/{id} | 
*SubjectsApi* | [**subjectsPost**](docs/SubjectsApi.md#subjectspost) | **POST** /Subjects | 
*TeachersApi* | [**teachersGet**](docs/TeachersApi.md#teachersget) | **GET** /Teachers | 
*TeachersApi* | [**teachersIdDelete**](docs/TeachersApi.md#teachersiddelete) | **DELETE** /Teachers/{id} | 
*TeachersApi* | [**teachersIdGet**](docs/TeachersApi.md#teachersidget) | **GET** /Teachers/{id} | 
*TeachersApi* | [**teachersIdPut**](docs/TeachersApi.md#teachersidput) | **PUT** /Teachers/{id} | 
*TeachersApi* | [**teachersPost**](docs/TeachersApi.md#teacherspost) | **POST** /Teachers | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.GradeDto](docs/GradeDto.md)
 - [org.openapitools.client.models.GradeMinDto](docs/GradeMinDto.md)
 - [org.openapitools.client.models.StudentDto](docs/StudentDto.md)
 - [org.openapitools.client.models.StudentMinDto](docs/StudentMinDto.md)
 - [org.openapitools.client.models.SubjectDto](docs/SubjectDto.md)
 - [org.openapitools.client.models.SubjectMinDto](docs/SubjectMinDto.md)
 - [org.openapitools.client.models.TeacherDto](docs/TeacherDto.md)
 - [org.openapitools.client.models.TeacherMinDto](docs/TeacherMinDto.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
