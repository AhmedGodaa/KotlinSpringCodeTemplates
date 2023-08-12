#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.delete${MODEL_NAME} #end
import com.fasterxml.jackson.annotation.JsonProperty

data class Delete${MODEL_NAME}Response(@JsonProperty("message") val message: String? = null)
