#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.create${MODEL_NAME} #end

import com.fasterxml.jackson.annotation.JsonProperty

data class Create${MODEL_NAME}Response(
@JsonProperty("message") var message: String? = null,
@JsonProperty("${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}") var ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}: ${MODEL_NAME}? = null
)
