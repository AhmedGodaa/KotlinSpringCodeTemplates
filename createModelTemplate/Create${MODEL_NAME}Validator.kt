#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.create${MODEL_NAME} #end


interface Create${MODEL_NAME}Validator {
    fun validateCreate${MODEL_NAME}Request(create${MODEL_NAME}Request: Create${MODEL_NAME}Request?)
}