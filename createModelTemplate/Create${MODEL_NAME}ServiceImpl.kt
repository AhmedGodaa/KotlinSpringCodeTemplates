#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.create${MODEL_NAME} #end


import org.springframework.stereotype.Service
import java.util.*

@Service
class Create${MODEL_NAME}ServiceImpl(
private val create${MODEL_NAME}Validator: Create${MODEL_NAME}Validator,
private val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository: ${MODEL_NAME}Repository
) : Create${MODEL_NAME}Service {
    override fun create${MODEL_NAME}(create${MODEL_NAME}Request: Create${MODEL_NAME}Request?): Create${MODEL_NAME}Response {
        create${MODEL_NAME}Validator.validateCreate${MODEL_NAME}Request(create${MODEL_NAME}Request)
        val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}ToCreate = create${MODEL_NAME}Request?.${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}
        val new${MODEL_NAME} = ${MODEL_NAME}(
        id = UUID.randomUUID().toString(),

        )
        return Create${MODEL_NAME}Response(
            message = "${MODEL_NAME} created successfully",
        ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)} = save${MODEL_NAME}DB(new${MODEL_NAME})
        )
    }


    fun save${MODEL_NAME}DB(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}: ${MODEL_NAME}): ${MODEL_NAME} {
        return try {
            ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository.save(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)})
        } catch (e: Exception) {
            throw Exception("Error while saving ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)} to DB")
        }
    }
}