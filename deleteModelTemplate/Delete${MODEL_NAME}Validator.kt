#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.delete${MODEL_NAME} #end

interface Delete${MODEL_NAME}Validator {
    fun validate(delete${MODEL_NAME}Request: Delete${MODEL_NAME}Request?)

}