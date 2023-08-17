#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.get${MODEL_NAME}s #end

interface Get${MODEL_NAME}sService {
    fun get${MODEL_NAME}s(get${MODEL_NAME}sRequest: Get${MODEL_NAME}sRequest?): Get${MODEL_NAME}sResponse?
}


