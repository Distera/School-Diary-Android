/**
* SchoolDiary
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * 
 * @param lastName 
 * @param firstName 
 * @param middleName 
 * @param phone 
 * @param subjectsIds 
 */

data class TeacherDto (
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "middleName")
    val middleName: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "subjectsIds")
    val subjectsIds: kotlin.Array<kotlin.Int>? = null
) 


