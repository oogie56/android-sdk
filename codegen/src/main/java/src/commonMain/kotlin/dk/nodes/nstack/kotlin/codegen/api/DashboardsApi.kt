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

class DashboardsApi @UseExperimental(UnstableDefault::class) constructor(
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
    * Dashboard
    * Get Dashboard  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/dashboards/{key}&#x60;  #### URL Parameters &#x60;key&#x60; (string) **required**  &#x60;mode&#x60; (string) **Optional**   - standard (default), using cache data  - fresh, force using fresh data  - test, fake data  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found
    * @param xminusApplicationMinusId  
    * @param xminusRestMinusApiMinusKey  
    * @param contentMinusType  
    * @return void
    */
    suspend fun dashboard(xminusApplicationMinusId: kotlin.String, xminusRestMinusApiMinusKey: kotlin.String, contentMinusType: kotlin.String) : HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()
        xminusApplicationMinusId?.apply { localVariableHeaders["X-Application-Id"] = this.toString() }
        xminusRestMinusApiMinusKey?.apply { localVariableHeaders["X-Rest-Api-Key"] = this.toString() }
        contentMinusType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v2/content/dashboards/DAS-ad21e084-ae03-4486-a5ec-d837dfc56fd2",
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
    * Visualization
    * Get visualization  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/dashboards/visualizations/{key}&#x60;  #### URL Parameters &#x60;key&#x60; (string) **required**  ### Query parameters  &#x60;mode&#x60; (string) **Optional**   - standard (default), using cache data  - fresh, force using fresh data  - test, fake data  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found
    * @param xminusApplicationMinusId  
    * @param xminusRestMinusApiMinusKey  
    * @param contentMinusType  
    * @return void
    */
    suspend fun visualization(xminusApplicationMinusId: kotlin.String, xminusRestMinusApiMinusKey: kotlin.String, contentMinusType: kotlin.String) : HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()
        xminusApplicationMinusId?.apply { localVariableHeaders["X-Application-Id"] = this.toString() }
        xminusRestMinusApiMinusKey?.apply { localVariableHeaders["X-Rest-Api-Key"] = this.toString() }
        contentMinusType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v2/content/dashboards/visualizations/visualization-5d0dbc254bc83",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
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
