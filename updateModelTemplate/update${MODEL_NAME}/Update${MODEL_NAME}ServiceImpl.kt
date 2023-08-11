#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.update${MODEL_NAME}; #end


@Service
class Update${MODEL_NAME}ServiceImpl(
    private val update${MODEL_NAME}Validator: Update${MODEL_NAME}Validator,
    private val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository: ${MODEL_NAME}Repository
) : Update${MODEL_NAME}Service {

    override fun update${MODEL_NAME}(update${MODEL_NAME}Request: Update${MODEL_NAME}Request?): Update${MODEL_NAME}Response {
        update${MODEL_NAME}Validator.validateUpdate${MODEL_NAME}Request(update${MODEL_NAME}Request)
        val current${MODEL_NAME} = find${MODEL_NAME}DB(update${MODEL_NAME}Request!!.${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}!!.id!!)
        val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)} = update${MODEL_NAME}Request.${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}!!
        val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}ToUpdate = current${MODEL_NAME}.copy(


        )
        return Update${MODEL_NAME}Response(
            message = "${MODEL_NAME} updated successfully",
        ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)} = update${MODEL_NAME}DB(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}ToUpdate)
        )
    }

    private fun find${MODEL_NAME}DB(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id: String): ${MODEL_NAME} {
        return ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository.findById(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Id).orElseThrow {
            IllegalArgumentException("${MODEL_NAME} can't be fetched")
        }

    }

    private fun update${MODEL_NAME}DB(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}: ${MODEL_NAME}): ${MODEL_NAME} {
        return try {
            ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository.save(${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)})
        } catch (e: Exception) {
            throw IllegalArgumentException("${MODEL_NAME} can't be updated")
        }

    }

}
