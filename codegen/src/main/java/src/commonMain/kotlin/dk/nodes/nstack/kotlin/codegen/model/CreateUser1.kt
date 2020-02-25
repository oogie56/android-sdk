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
 * @param username 
 * @param email 
 * @param usernamePlaceholder 
 * @param emailPlaceholder 
 * @param signupButton 
 * @param usernameNotAvailableAlertTitle 
 * @param usernameNotAvailableAlertMessage 
 * @param emailNotAvailableAlertMessage 
 * @param emailNotAvailableAlertTitle 
 * @param usernameAndEmailNotAvailableAlertMessage 
 * @param usernameAndEmailNotAvailableAlertTitle 
 * @param invalidOrMissingInputAlertTitle 
 * @param invalidOrMissingInputAlertMessage 
 * @param expiredToken 
 * @param alreadyHaveAccount 
 * @param required 
 * @param invalidUsername 
 * @param invalidEmail 
 * @param valid 
 * @param alreadyInUse 
 * @param checking 
 * @param subtitle 
 * @param inUse 
 * @param invalid 
 */
@Serializable
data class CreateUser1 (
    @SerialName(value = "title") @Required val title: kotlin.String,
    @SerialName(value = "username") @Required val username: kotlin.String,
    @SerialName(value = "email") @Required val email: kotlin.String,
    @SerialName(value = "usernamePlaceholder") @Required val usernamePlaceholder: kotlin.String,
    @SerialName(value = "emailPlaceholder") @Required val emailPlaceholder: kotlin.String,
    @SerialName(value = "signupButton") @Required val signupButton: kotlin.String,
    @SerialName(value = "usernameNotAvailableAlertTitle") @Required val usernameNotAvailableAlertTitle: kotlin.String,
    @SerialName(value = "usernameNotAvailableAlertMessage") @Required val usernameNotAvailableAlertMessage: kotlin.String,
    @SerialName(value = "emailNotAvailableAlertMessage") @Required val emailNotAvailableAlertMessage: kotlin.String,
    @SerialName(value = "emailNotAvailableAlertTitle") @Required val emailNotAvailableAlertTitle: kotlin.String,
    @SerialName(value = "usernameAndEmailNotAvailableAlertMessage") @Required val usernameAndEmailNotAvailableAlertMessage: kotlin.String,
    @SerialName(value = "usernameAndEmailNotAvailableAlertTitle") @Required val usernameAndEmailNotAvailableAlertTitle: kotlin.String,
    @SerialName(value = "invalidOrMissingInputAlertTitle") @Required val invalidOrMissingInputAlertTitle: kotlin.String,
    @SerialName(value = "invalidOrMissingInputAlertMessage") @Required val invalidOrMissingInputAlertMessage: kotlin.String,
    @SerialName(value = "expiredToken") @Required val expiredToken: kotlin.String,
    @SerialName(value = "alreadyHaveAccount") @Required val alreadyHaveAccount: kotlin.String,
    @SerialName(value = "required") @Required val required: kotlin.String,
    @SerialName(value = "invalidUsername") @Required val invalidUsername: kotlin.String,
    @SerialName(value = "invalidEmail") @Required val invalidEmail: kotlin.String,
    @SerialName(value = "valid") @Required val valid: kotlin.String,
    @SerialName(value = "alreadyInUse") @Required val alreadyInUse: kotlin.String,
    @SerialName(value = "checking") @Required val checking: kotlin.String,
    @SerialName(value = "subtitle") @Required val subtitle: kotlin.String,
    @SerialName(value = "inUse") @Required val inUse: kotlin.String,
    @SerialName(value = "invalid") @Required val invalid: kotlin.String
) 



