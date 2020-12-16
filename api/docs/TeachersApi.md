# TeachersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teachersGet**](TeachersApi.md#teachersGet) | **GET** /Teachers | 
[**teachersIdDelete**](TeachersApi.md#teachersIdDelete) | **DELETE** /Teachers/{id} | 
[**teachersIdGet**](TeachersApi.md#teachersIdGet) | **GET** /Teachers/{id} | 
[**teachersIdPut**](TeachersApi.md#teachersIdPut) | **PUT** /Teachers/{id} | 
[**teachersPost**](TeachersApi.md#teachersPost) | **POST** /Teachers | 


<a name="teachersGet"></a>
# **teachersGet**
> kotlin.Array&lt;TeacherMinDto&gt; teachersGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeachersApi()
try {
    val result : kotlin.Array<TeacherMinDto> = apiInstance.teachersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeachersApi#teachersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeachersApi#teachersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TeacherMinDto&gt;**](TeacherMinDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="teachersIdDelete"></a>
# **teachersIdDelete**
> teachersIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeachersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.teachersIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TeachersApi#teachersIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeachersApi#teachersIdDelete")
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

<a name="teachersIdGet"></a>
# **teachersIdGet**
> TeacherDto teachersIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeachersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TeacherDto = apiInstance.teachersIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeachersApi#teachersIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeachersApi#teachersIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**TeacherDto**](TeacherDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="teachersIdPut"></a>
# **teachersIdPut**
> teachersIdPut(id, teacherDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeachersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val teacherDto : TeacherDto =  // TeacherDto | 
try {
    apiInstance.teachersIdPut(id, teacherDto)
} catch (e: ClientException) {
    println("4xx response calling TeachersApi#teachersIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeachersApi#teachersIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **teacherDto** | [**TeacherDto**](TeacherDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="teachersPost"></a>
# **teachersPost**
> teachersPost(teacherDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeachersApi()
val teacherDto : TeacherDto =  // TeacherDto | 
try {
    apiInstance.teachersPost(teacherDto)
} catch (e: ClientException) {
    println("4xx response calling TeachersApi#teachersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeachersApi#teachersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teacherDto** | [**TeacherDto**](TeacherDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

