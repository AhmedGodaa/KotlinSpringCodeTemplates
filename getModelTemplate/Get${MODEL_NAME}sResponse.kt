#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.get${MODEL_NAME}s #end

data class Get${MODEL_NAME}sResponse(
var ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}s: MutableList<${MODEL_NAME}>
)


