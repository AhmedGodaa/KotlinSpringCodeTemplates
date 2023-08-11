#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.update${MODEL_NAME}; #end

@Component
class Update${MODEL_NAME}ValidatorImpl : Update${MODEL_NAME}Validator {
    override fun validateUpdate${MODEL_NAME}Request(update${MODEL_NAME}Request: Update${MODEL_NAME}Request?) {
        if (update${MODEL_NAME}Request == null) { throw IllegalArgumentException("Update${MODEL_NAME}Request is null") }
    }
}