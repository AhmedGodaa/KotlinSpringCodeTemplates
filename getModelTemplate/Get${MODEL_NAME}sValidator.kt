#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.get${MODEL_NAME}s #end

interface Get${MODEL_NAME}sValidator  {
    fun validate(getAll${MODEL_NAME}sRequest: Get${MODEL_NAME}sRequest?)
}

