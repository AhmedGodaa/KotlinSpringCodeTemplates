#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.update${MODEL_NAME}; #end

interface Update${MODEL_NAME}Service {
    fun update${MODEL_NAME}(update${MODEL_NAME}Request: Update${MODEL_NAME}Request?): Update${MODEL_NAME}Response
}