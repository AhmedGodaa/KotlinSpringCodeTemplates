#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.delete${MODEL_NAME} #end

interface Delete${MODEL_NAME}Service {
    fun delete${MODEL_NAME}(delete${MODEL_NAME}Request: Delete${MODEL_NAME}Request): Delete${MODEL_NAME}Response
}