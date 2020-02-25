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
 * @param title 
 * @param english 
 * @param defaultLanguage 
 * @param enGB 
 * @param daDK 
 * @param frFR 
 * @param ruRU 
 * @param ptBR 
 * @param zhCN 
 */
@Serializable
data class Language1 (
    @SerialName(value = "title") @Required val title: kotlin.String,
    @SerialName(value = "english") @Required val english: kotlin.String,
    @SerialName(value = "defaultLanguage") @Required val defaultLanguage: kotlin.String,
    @SerialName(value = "enGB") @Required val enGB: kotlin.String,
    @SerialName(value = "daDK") @Required val daDK: kotlin.String,
    @SerialName(value = "frFR") @Required val frFR: kotlin.String,
    @SerialName(value = "ruRU") @Required val ruRU: kotlin.String,
    @SerialName(value = "ptBR") @Required val ptBR: kotlin.String,
    @SerialName(value = "zhCN") @Required val zhCN: kotlin.String
) 



