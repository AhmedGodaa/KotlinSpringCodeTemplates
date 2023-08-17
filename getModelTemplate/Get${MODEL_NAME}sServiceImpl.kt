#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.get${MODEL_NAME}s #end

import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class Get${MODEL_NAME}sServiceImpl(
private val getAll${MODEL_NAME}sValidator: Get${MODEL_NAME}sValidator,
private val authenticatorService: AuthenticatorService,
private val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository: ${MODEL_NAME}Repository
) : Get${MODEL_NAME}sService {
    override fun get${MODEL_NAME}s(get${MODEL_NAME}sRequest: Get${MODEL_NAME}sRequest?): Get${MODEL_NAME}sResponse? {
        getAll${MODEL_NAME}sValidator.validate(get${MODEL_NAME}sRequest)
        authenticatorService.authenticate()
        val ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}s = get${MODEL_NAME}sFromDB(
            PageRequest.of(
                get${MODEL_NAME}sRequest!!.pagination!!.page,
        get${MODEL_NAME}sRequest.pagination!!.size
        )
        )
        return Get${MODEL_NAME}sResponse(
        ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}s = ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}s
        )
    }
    fun get${MODEL_NAME}sFromDB(pageable: Pageable): MutableList<${MODEL_NAME}> {
        return try {
            ${MODEL_NAME.substring(0,1).toLowerCase()}${MODEL_NAME.substring(1)}Repository.findAll(pageable).content
        } catch (e: Exception) {
            throw RuntimeException("")
        }

    }
}



