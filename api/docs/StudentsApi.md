# StudentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**studentsGet**](StudentsApi.md#studentsGet) | **GET** /Students | 
[**studentsIdDelete**](StudentsApi.md#studentsIdDelete) | **DELETE** /Students/{id} | 
[**studentsIdGet**](StudentsApi.md#studentsIdGet) | **GET** /Students/{id} | 
[**studentsIdPut**](StudentsApi.md#studentsIdPut) | **PUT** /Students/{id} | 
[**studentsPost**](StudentsApi.md#studentsPost) | **POST** /Students | 


<a name="studentsGet"></a>
# **studentsGet**
> kotlin.Array&lt;StudentMinDto&gt; studentsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentsApi()
try {
    val result : kotlin.Array<StudentMinDto> = apiInstance.studentsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentsApi#studentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentsApi#studentsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;StudentMinDto&gt;**](StudentMinDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="studentsIdDelete"></a>
# **studentsIdDelete**
> studentsIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.studentsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling StudentsApi#studentsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentsApi#studentsIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="studentsIdGet"></a>
# **studentsIdGet**
> StudentDto studentsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : StudentDto = apiInstance.studentsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentsApi#studentsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentsApi#studentsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**StudentDto**](StudentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="studentsIdPut"></a>
# **studentsIdPut**
> studentsIdPut(id, studentDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val studentDto : StudentDto =  // StudentDto | 
try {
    apiInstance.studentsIdPut(id, studentDto)
} catch (e: ClientException) {
    println("4xx response calling StudentsApi#studentsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentsApi#studentsIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **studentDto** | [**StudentDto**](StudentDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="studentsPost"></a>
# **studentsPost**
> studentsPost(studentDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentsApi()
val studentDto : StudentDto =  // StudentDto | 
try {
    apiInstance.studentsPost(studentDto)
} catch (e: ClientException) {
    println("4xx response calling StudentsApi#studentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentsApi#studentsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentDto** | [**StudentDto**](StudentDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

