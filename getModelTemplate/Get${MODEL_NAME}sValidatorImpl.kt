#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.get${MODEL_NAME}s #end


import org.springframework.stereotype.Component

@Component
class Get${MODEL_NAME}sValidatorImpl : Get${MODEL_NAME}sValidator {
    override fun validate(getAll${MODEL_NAME}sRequest: Get${MODEL_NAME}sRequest?) {
        if (getAll${MODEL_NAME}sRequest == null) {
        throw IllegalArgumentException("GetAll${MODEL_NAME}sRequest is null")
    }
        if (getAll${MODEL_NAME}sRequest.pagination == null) {
        throw IllegalArgumentException("GetAll${MODEL_NAME}sRequest.pagination is null")
    }
        if (getAll${MODEL_NAME}sRequest.pagination!!.page < 0) {
        throw IllegalArgumentException("GetAll${MODEL_NAME}sRequest.pagination.page is less than 0")
    }
        if (getAll${MODEL_NAME}sRequest.pagination!!.size < 0) {
        throw IllegalArgumentException("GetAll${MODEL_NAME}sRequest.pagination.size is less than 0")
    }
    }
}
