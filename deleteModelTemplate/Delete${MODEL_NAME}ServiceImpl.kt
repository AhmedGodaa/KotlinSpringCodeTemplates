#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.delete${MODEL_NAME} #end
import org.springframework.stereotype.Service
import java.util.*

@Service
class Delete${MODEL_NAME}ServiceImpl(
private val delete${MODEL_NAME}Validator: Delete${MODEL_NAME}Validator,
private val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository: ${MODEL_NAME}Repository,
private val deletionValidator: DeletionValidator<${MODEL_NAME}, String>
) : Delete${MODEL_NAME}Service {
    override fun delete${MODEL_NAME}(delete${MODEL_NAME}Request: Delete${MODEL_NAME}Request): Delete${MODEL_NAME}Response {
        delete${MODEL_NAME}Validator.validate(delete${MODEL_NAME}Request)
        val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id = delete${MODEL_NAME}Request.id!!
    deletionValidator.validateExistence(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id, ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository)
        delete${MODEL_NAME}DB(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id)
        deletionValidator.validateDeletion(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id, ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository)
        return Delete${MODEL_NAME}Response(
            message = "${MODEL_NAME} deleted successfully"
            )
    }


    private fun delete${MODEL_NAME}DB(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id: String) {
        try {
            ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository.deleteById(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id)
        } catch (e: Exception) {
            throw ${MODEL_NAME}DeletionException("Error while deleting ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)} from DB")
        }
    }


}
