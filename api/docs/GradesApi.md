# GradesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradesGet**](GradesApi.md#gradesGet) | **GET** /Grades | 
[**gradesIdDelete**](GradesApi.md#gradesIdDelete) | **DELETE** /Grades/{id} | 
[**gradesIdGet**](GradesApi.md#gradesIdGet) | **GET** /Grades/{id} | 
[**gradesIdPut**](GradesApi.md#gradesIdPut) | **PUT** /Grades/{id} | 
[**gradesPost**](GradesApi.md#gradesPost) | **POST** /Grades | 


<a name="gradesGet"></a>
# **gradesGet**
> kotlin.Array&lt;GradeMinDto&gt; gradesGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GradesApi()
try {
    val result : kotlin.Array<GradeMinDto> = apiInstance.gradesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradesApi#gradesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradesApi#gradesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;GradeMinDto&gt;**](GradeMinDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="gradesIdDelete"></a>
# **gradesIdDelete**
> gradesIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GradesApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.gradesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling GradesApi#gradesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradesApi#gradesIdDelete")
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

<a name="gradesIdGet"></a>
# **gradesIdGet**
> GradeDto gradesIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GradesApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GradeDto = apiInstance.gradesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradesApi#gradesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradesApi#gradesIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**GradeDto**](GradeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="gradesIdPut"></a>
# **gradesIdPut**
> gradesIdPut(id, gradeDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GradesApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val gradeDto : GradeDto =  // GradeDto | 
try {
    apiInstance.gradesIdPut(id, gradeDto)
} catch (e: ClientException) {
    println("4xx response calling GradesApi#gradesIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradesApi#gradesIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **gradeDto** | [**GradeDto**](GradeDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="gradesPost"></a>
# **gradesPost**
> gradesPost(gradeDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GradesApi()
val gradeDto : GradeDto =  // GradeDto | 
try {
    apiInstance.gradesPost(gradeDto)
} catch (e: ClientException) {
    println("4xx response calling GradesApi#gradesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradesApi#gradesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradeDto** | [**GradeDto**](GradeDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

