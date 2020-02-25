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
 * @param tattooArtistAt 
 * @param skills 
 * @param guest 
 * @param allWorkplaces 
 * @param add 
 * @param edit 
 * @param addWorkplace 
 * @param done 
 * @param areYouGuest 
 * @param startDate 
 * @param endDate 
 * @param chooseMaxSkills 
 * @param alreadyPickedTitle 
 * @param alreadyPickedDescription 
 * @param ok 
 * @param okay 
 * @param searchShops 
 * @param showYourExperience 
 * @param cantFindShop 
 * @param createShop 
 * @param noResultsFor 
 * @param theShopDoesNotExist 
 * @param cancel 
 * @param use 
 * @param name 
 * @param deleteThisPromptTitle 
 * @param deleteThisPromptDescription 
 * @param present 
 * @param createNew 
 * @param editWorkplace 
 * @param pleaseSelectStartDate 
 * @param pleaseSelectEndDateAfterStartDate 
 * @param workplaces 
 * @param now 
 * @param sharePortfolio 
 * @param noWorkplaces 
 * @param noWorkplacesSubtitle 
 * @param delete 
 * @param searchArtists 
 * @param work 
 * @param preferredStyles 
 * @param worksAt 
 * @param about 
 * @param whereDoYouWork 
 * @param previousWorkplaces 
 * @param guestArtist 
 * @param tabWork 
 * @param tabBoards 
 * @param tabAbout 
 * @param addBio 
 * @param noBio 
 * @param styles 
 * @param noStyles 
 * @param noStylesSubtitle 
 * @param addStyles 
 * @param tabMyCollection 
 */
@Serializable
data class Artist (
    @SerialName(value = "tattooArtistAt") @Required val tattooArtistAt: kotlin.String,
    @SerialName(value = "skills") @Required val skills: kotlin.String,
    @SerialName(value = "guest") @Required val guest: kotlin.String,
    @SerialName(value = "allWorkplaces") @Required val allWorkplaces: kotlin.String,
    @SerialName(value = "add") @Required val add: kotlin.String,
    @SerialName(value = "edit") @Required val edit: kotlin.String,
    @SerialName(value = "addWorkplace") @Required val addWorkplace: kotlin.String,
    @SerialName(value = "done") @Required val done: kotlin.String,
    @SerialName(value = "areYouGuest") @Required val areYouGuest: kotlin.String,
    @SerialName(value = "startDate") @Required val startDate: kotlin.String,
    @SerialName(value = "endDate") @Required val endDate: kotlin.String,
    @SerialName(value = "chooseMaxSkills") @Required val chooseMaxSkills: kotlin.String,
    @SerialName(value = "alreadyPickedTitle") @Required val alreadyPickedTitle: kotlin.String,
    @SerialName(value = "alreadyPickedDescription") @Required val alreadyPickedDescription: kotlin.String,
    @SerialName(value = "ok") @Required val ok: kotlin.String,
    @SerialName(value = "okay") @Required val okay: kotlin.String,
    @SerialName(value = "searchShops") @Required val searchShops: kotlin.String,
    @SerialName(value = "showYourExperience") @Required val showYourExperience: kotlin.String,
    @SerialName(value = "cantFindShop") @Required val cantFindShop: kotlin.String,
    @SerialName(value = "createShop") @Required val createShop: kotlin.String,
    @SerialName(value = "noResultsFor") @Required val noResultsFor: kotlin.String,
    @SerialName(value = "theShopDoesNotExist") @Required val theShopDoesNotExist: kotlin.String,
    @SerialName(value = "cancel") @Required val cancel: kotlin.String,
    @SerialName(value = "use") @Required val use: kotlin.String,
    @SerialName(value = "name") @Required val name: kotlin.String,
    @SerialName(value = "deleteThisPromptTitle") @Required val deleteThisPromptTitle: kotlin.String,
    @SerialName(value = "deleteThisPromptDescription") @Required val deleteThisPromptDescription: kotlin.String,
    @SerialName(value = "present") @Required val present: kotlin.String,
    @SerialName(value = "createNew") @Required val createNew: kotlin.String,
    @SerialName(value = "editWorkplace") @Required val editWorkplace: kotlin.String,
    @SerialName(value = "pleaseSelectStartDate") @Required val pleaseSelectStartDate: kotlin.String,
    @SerialName(value = "pleaseSelectEndDateAfterStartDate") @Required val pleaseSelectEndDateAfterStartDate: kotlin.String,
    @SerialName(value = "workplaces") @Required val workplaces: kotlin.String,
    @SerialName(value = "now") @Required val now: kotlin.String,
    @SerialName(value = "sharePortfolio") @Required val sharePortfolio: kotlin.String,
    @SerialName(value = "noWorkplaces") @Required val noWorkplaces: kotlin.String,
    @SerialName(value = "noWorkplacesSubtitle") @Required val noWorkplacesSubtitle: kotlin.String,
    @SerialName(value = "delete") @Required val delete: kotlin.String,
    @SerialName(value = "searchArtists") @Required val searchArtists: kotlin.String,
    @SerialName(value = "work") @Required val work: kotlin.String,
    @SerialName(value = "preferredStyles") @Required val preferredStyles: kotlin.String,
    @SerialName(value = "worksAt") @Required val worksAt: kotlin.String,
    @SerialName(value = "about") @Required val about: kotlin.String,
    @SerialName(value = "whereDoYouWork") @Required val whereDoYouWork: kotlin.String,
    @SerialName(value = "previousWorkplaces") @Required val previousWorkplaces: kotlin.String,
    @SerialName(value = "guestArtist") @Required val guestArtist: kotlin.String,
    @SerialName(value = "tabWork") @Required val tabWork: kotlin.String,
    @SerialName(value = "tabBoards") @Required val tabBoards: kotlin.String,
    @SerialName(value = "tabAbout") @Required val tabAbout: kotlin.String,
    @SerialName(value = "addBio") @Required val addBio: kotlin.String,
    @SerialName(value = "noBio") @Required val noBio: kotlin.String,
    @SerialName(value = "styles") @Required val styles: kotlin.String,
    @SerialName(value = "noStyles") @Required val noStyles: kotlin.String,
    @SerialName(value = "noStylesSubtitle") @Required val noStylesSubtitle: kotlin.String,
    @SerialName(value = "addStyles") @Required val addStyles: kotlin.String,
    @SerialName(value = "tabMyCollection") @Required val tabMyCollection: kotlin.String
) 



