#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.delete${MODEL_NAME} #end

import org.springframework.stereotype.Component

@Component
class Delete${MODEL_NAME}ValidatorImpl : Delete${MODEL_NAME}Validator {
    override fun validate(delete${MODEL_NAME}Request: Delete${MODEL_NAME}Request?) {
        if (delete${MODEL_NAME}Request == null) {
        throw ${MODEL_NAME}DeletionException("Delete${MODEL_NAME}Request is null")
    }

    }

}