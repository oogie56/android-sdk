/**
* API
* This is the public API for nstack.io  Setup an application and use Application-Id and Rest-Api-Key
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package dk.nodes.nstack.kotlin.codegen.model


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
/**
 * 
 * @param key 
 * @param value 
 * @param locale 
 * @param platform 
 * @param guid 
 * @param section 
 */
@Serializable
data class InlineObject8 (
    @SerialName(value = "key") @Required val key: kotlin.String,
    @SerialName(value = "value") @Required val value: kotlin.String,
    @SerialName(value = "locale") @Required val locale: kotlin.String,
    @SerialName(value = "platform") @Required val platform: kotlin.String,
    @SerialName(value = "guid") @Required val guid: kotlin.String,
    @SerialName(value = "section") @Required val section: kotlin.String
) 



