#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.update${MODEL_NAME}; #end

data class Update${MODEL_NAME}Request(
var ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)} : ${MODEL_NAME}? = null
)
