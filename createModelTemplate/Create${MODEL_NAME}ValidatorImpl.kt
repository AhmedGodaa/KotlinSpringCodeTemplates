#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.create${MODEL_NAME} #end

import org.springframework.stereotype.Component
@Component
class Create${MODEL_NAME}ValidatorImpl : Create${MODEL_NAME}Validator {
    override fun validateCreate${MODEL_NAME}Request(create${MODEL_NAME}Request: Create${MODEL_NAME}Request?) {
        if (create${MODEL_NAME}Request == null) {
        throw Exception("Create${MODEL_NAME}Request is null")
    }
    }
}