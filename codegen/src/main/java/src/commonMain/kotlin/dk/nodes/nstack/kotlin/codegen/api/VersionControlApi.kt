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
package dk.nodes.nstack.kotlin.codegen.api

import dk.nodes.nstack.kotlin.codegen.model.VersionControl

import org.openapitools.client.infrastructure.*
import io.ktor.client.request.forms.formData
import kotlinx.serialization.UnstableDefault
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor

class VersionControlApi @UseExperimental(UnstableDefault::class) constructor(
        baseUrl: kotlin.String = "https://nstack-staging.vapor.cloud",
        httpClientEngine: HttpClientEngine? = null,
        serializer: KotlinxSerializer)
    : ApiClient(baseUrl, httpClientEngine, serializer) {

    @UseExperimental(UnstableDefault::class)
    constructor(
        baseUrl: kotlin.String = "https://nstack-staging.vapor.cloud",
        httpClientEngine: HttpClientEngine? = null,
        jsonConfiguration: JsonConfiguration = JsonConfiguration.Default)
    : this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    /**
    * Indexupdate
    * Get app updated  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/notify/updates&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters &#x60;platform&#x60; (string) **required** _[\&quot;ios\&quot;, \&quot;android\&quot;, \&quot;windows\&quot;]_  &#x60;current_version&#x60; (string) **required** _Current version of app making the request_  &#x60;last_version&#x60; (string) _[?]_  &#x60;test&#x60; (bool) _Enable test mode, false equals production_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed
    * @param platform  
    * @param currentVersion  
    * @param lastVersion  
    * @param xminusApplicationMinusId  
    * @param xminusRestMinusApiMinusKey  
    * @return VersionControl
    */
    @Suppress("UNCHECKED_CAST")
    suspend fun indexupdate(platform: kotlin.String, currentVersion: kotlin.Double, lastVersion: kotlin.Double, xminusApplicationMinusId: kotlin.String, xminusRestMinusApiMinusKey: kotlin.String) : HttpResponse<VersionControl> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        platform?.apply { localVariableQuery["platform"] = listOf("$platform") }
        currentVersion?.apply { localVariableQuery["current_version"] = listOf("$currentVersion") }
        lastVersion?.apply { localVariableQuery["last_version"] = listOf("$lastVersion") }

        val localVariableHeaders = mutableMapOf<String, String>()
        xminusApplicationMinusId?.apply { localVariableHeaders["X-Application-Id"] = this.toString() }
        xminusRestMinusApiMinusKey?.apply { localVariableHeaders["X-Rest-Api-Key"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v2/notify/updates",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
    * Indexupdate1
    * Get app updated  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/notify/updates&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters &#x60;platform&#x60; (string) **required** _[\&quot;ios\&quot;, \&quot;android\&quot;, \&quot;windows\&quot;]_  &#x60;current_version&#x60; (string) **required** _Current version of app making the request_  &#x60;last_version&#x60; (string) _[?]_  &#x60;test&#x60; (bool) _Enable test mode, false equals production_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed
    * @param platform  
    * @param currentVersion  
    * @param lastVersion  
    * @param xminusApplicationMinusId  
    * @param xminusRestMinusApiMinusKey  
    * @return void
    */
    suspend fun indexupdate1(platform: kotlin.String, currentVersion: kotlin.Double, lastVersion: kotlin.Double, xminusApplicationMinusId: kotlin.String, xminusRestMinusApiMinusKey: kotlin.String) : HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        platform?.apply { localVariableQuery["platform"] = listOf("$platform") }
        currentVersion?.apply { localVariableQuery["current_version"] = listOf("$currentVersion") }
        lastVersion?.apply { localVariableQuery["last_version"] = listOf("$lastVersion") }

        val localVariableHeaders = mutableMapOf<String, String>()
        xminusApplicationMinusId?.apply { localVariableHeaders["X-Application-Id"] = this.toString() }
        xminusRestMinusApiMinusKey?.apply { localVariableHeaders["X-Rest-Api-Key"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/notify/updates",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
    * Markupdateasseen
    * Register a view update  #### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v2/notify/updates/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters &#x60;guid&#x60; (int) **required** _[?]_  &#x60;update_id&#x60; (int) **required** _Id of update where view was updated_  &#x60;answer&#x60; (string) **required** _[\&quot;no\&quot;, \&quot;yes\&quot;]_  &#x60;type&#x60; (string) **required** _[\&quot;newer_version\&quot;, \&quot;new_in_version\&quot;]_   #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed
    * @param xminusApplicationMinusId  
    * @param xminusRestMinusApiMinusKey  
    * @param guid  
    * @param updateId  
    * @param answer  
    * @param type  
    * @return void
    */
    suspend fun markupdateasseen(xminusApplicationMinusId: kotlin.String, xminusRestMinusApiMinusKey: kotlin.String, guid: kotlin.Int, updateId: kotlin.Int, answer: kotlin.String, type: kotlin.String) : HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            ParametersBuilder().also {
                guid?.apply { it.append("guid", guid.toString()) }
                updateId?.apply { it.append("update_id", updateId.toString()) }
                answer?.apply { it.append("answer", answer.toString()) }
                type?.apply { it.append("type", type.toString()) }
            }.build()

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()
        xminusApplicationMinusId?.apply { localVariableHeaders["X-Application-Id"] = this.toString() }
        xminusRestMinusApiMinusKey?.apply { localVariableHeaders["X-Rest-Api-Key"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v2/notify/updates/views",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return urlEncodedFormRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
    * Markupdateasseen1
    * Register a view update  #### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v1/notify/updates/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters &#x60;guid&#x60; (int) **required** _[?]_  &#x60;update_id&#x60; (int) **required** _Id of update where view was updated_  &#x60;answer&#x60; (string) **required** _[\&quot;no\&quot;, \&quot;yes\&quot;]_  &#x60;type&#x60; (string) **required** _[\&quot;newer_version\&quot;, \&quot;new_in_version\&quot;]_   #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed
    * @param xminusApplicationMinusId  
    * @param xminusRestMinusApiMinusKey  
    * @param guid  
    * @param updateId  
    * @param answer  
    * @param type  
    * @return void
    */
    suspend fun markupdateasseen1(xminusApplicationMinusId: kotlin.String, xminusRestMinusApiMinusKey: kotlin.String, guid: kotlin.Int, updateId: kotlin.Int, answer: kotlin.String, type: kotlin.String) : HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            ParametersBuilder().also {
                guid?.apply { it.append("guid", guid.toString()) }
                updateId?.apply { it.append("update_id", updateId.toString()) }
                answer?.apply { it.append("answer", answer.toString()) }
                type?.apply { it.append("type", type.toString()) }
            }.build()

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()
        xminusApplicationMinusId?.apply { localVariableHeaders["X-Application-Id"] = this.toString() }
        xminusRestMinusApiMinusKey?.apply { localVariableHeaders["X-Rest-Api-Key"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/notify/updates/views",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return urlEncodedFormRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    companion object {
        internal fun setMappers(serializer: KotlinxSerializer) {
        }
    }
}
