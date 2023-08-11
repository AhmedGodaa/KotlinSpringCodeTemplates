#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.update${MODEL_NAME}; #end


interface Update${MODEL_NAME}Validator {
    fun validateUpdate${MODEL_NAME}Request(update${MODEL_NAME}Request: Update${MODEL_NAME}Request?)
}