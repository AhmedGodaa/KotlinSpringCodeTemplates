#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.create${MODEL_NAME} #end

interface Create${MODEL_NAME}Service {
    fun create${MODEL_NAME}(create${MODEL_NAME}Request: Create${MODEL_NAME}Request?): Create${MODEL_NAME}Response
}

