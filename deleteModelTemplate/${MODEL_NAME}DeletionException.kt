#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.delete${MODEL_NAME} #end

class ${MODEL_NAME}DeletionException(message: String) : RuntimeException(message)
