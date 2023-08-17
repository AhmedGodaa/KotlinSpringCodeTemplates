#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.get${MODEL_NAME}s #end

data class Get${MODEL_NAME}sRequest(
var pagination: Pagination? = null
)


