# SubjectsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subjectsGet**](SubjectsApi.md#subjectsGet) | **GET** /Subjects | 
[**subjectsIdDelete**](SubjectsApi.md#subjectsIdDelete) | **DELETE** /Subjects/{id} | 
[**subjectsIdGet**](SubjectsApi.md#subjectsIdGet) | **GET** /Subjects/{id} | 
[**subjectsIdPut**](SubjectsApi.md#subjectsIdPut) | **PUT** /Subjects/{id} | 
[**subjectsPost**](SubjectsApi.md#subjectsPost) | **POST** /Subjects | 


<a name="subjectsGet"></a>
# **subjectsGet**
> kotlin.Array&lt;SubjectMinDto&gt; subjectsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubjectsApi()
try {
    val result : kotlin.Array<SubjectMinDto> = apiInstance.subjectsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#subjectsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#subjectsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;SubjectMinDto&gt;**](SubjectMinDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="subjectsIdDelete"></a>
# **subjectsIdDelete**
> subjectsIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubjectsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.subjectsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#subjectsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#subjectsIdDelete")
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

<a name="subjectsIdGet"></a>
# **subjectsIdGet**
> SubjectDto subjectsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubjectsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SubjectDto = apiInstance.subjectsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#subjectsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#subjectsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**SubjectDto**](SubjectDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="subjectsIdPut"></a>
# **subjectsIdPut**
> subjectsIdPut(id, subjectDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubjectsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val subjectDto : SubjectDto =  // SubjectDto | 
try {
    apiInstance.subjectsIdPut(id, subjectDto)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#subjectsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#subjectsIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **subjectDto** | [**SubjectDto**](SubjectDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="subjectsPost"></a>
# **subjectsPost**
> subjectsPost(subjectDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubjectsApi()
val subjectDto : SubjectDto =  // SubjectDto | 
try {
    apiInstance.subjectsPost(subjectDto)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#subjectsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#subjectsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectDto** | [**SubjectDto**](SubjectDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

