## Documentation For UpdateModel Template

### File Naming 
- Create Model
```vtl
create${MODEL_NAME}/Create${MODEL_NAME}Validator
create${MODEL_NAME}/Create${MODEL_NAME}ValidatorImpl
create${MODEL_NAME}/Create${MODEL_NAME}Service
create${MODEL_NAME}/Create${MODEL_NAME}ServiceImpl
create${MODEL_NAME}/Create${MODEL_NAME}Response
create${MODEL_NAME}/Create${MODEL_NAME}Request.kt
```

- Update Model
```vtl
update${MODEL_NAME}/Update${MODEL_NAME}Docs.md
update${MODEL_NAME}/Update${MODEL_NAME}Request
update${MODEL_NAME}/Update${MODEL_NAME}Response
update${MODEL_NAME}/Update${MODEL_NAME}Service
update${MODEL_NAME}/Update${MODEL_NAME}ServiceImpl
update${MODEL_NAME}/Update${MODEL_NAME}Validator
update${MODEL_NAME}/Update${MODEL_NAME}ValidatorImpl
```

- Delete Model
```vtl
delete${MODEL_NAME}/${MODEL_NAME}DeletionException
delete${MODEL_NAME}/Delete${MODEL_NAME}ValidatorImpl
delete${MODEL_NAME}/Delete${MODEL_NAME}Validator
delete${MODEL_NAME}/Delete${MODEL_NAME}ServiceImpl
delete${MODEL_NAME}/Delete${MODEL_NAME}Service
delete${MODEL_NAME}/Delete${MODEL_NAME}Request
delete${MODEL_NAME}/Delete${MODEL_NAME}Response
```
## Example Generation for Model: **User**
### Service
- Update${MODEL_NAME}Service

```kotlin
package com.irrigationsystem.service.test.updateUser

interface UpdateUserService {
    fun updateUser(updateUserRequest: UpdateUserRequest?): UpdateUserResponse
}
```


- Update${MODEL_NAME}ServiceImpl

```kotlin
package com.irrigationsystem.service.test.updateUser

@Service
class UpdateUserServiceImpl(
    private val updateUserValidator: UpdateUserValidator,
    private val userRepository: UserRepository
) : UpdateUserService {

    override fun updateUser(updateUserRequest: UpdateUserRequest?): UpdateUserResponse {
        updateUserValidator.validateUpdateUserRequest(updateUserRequest)
        val currentUser = findUserDB(updateUserRequest!!.user!!.id!!)
        val user = updateUserRequest.user!!
        val userToUpdate = currentUser.copy(


        )
        return UpdateUserResponse(
            message = "User updated successfully",
            user = updateUserDB(userToUpdate)
        )
    }

    private fun findUserDB(userId: String): User {
        return userRepository.findById(userId).orElseThrow {
            IllegalArgumentException("User can't be fetched")
        }

    }

    private fun updateUserDB(user: User): User {
        return try {
            userRepository.save(user)
        } catch (e: Exception) {
            throw IllegalArgumentException("User can't be updated")
        }

    }

}
```
### Validator
- Update${MODEL_NAME}Validator
```kotlin
package com.irrigationsystem.service.test.updateUser

interface UpdateUserValidator {
    fun validateUpdateUserRequest(updateUserRequest: UpdateUserRequest?)
}
```

- Update${MODEL_NAME}ValidatorImpl
```kotlin
package com.irrigationsystem.service.test.updateUser

@Component
class UpdateUserValidatorImpl : UpdateUserValidator {
    override fun validateUpdateUserRequest(updateUserRequest: UpdateUserRequest?) {
        if (updateUserRequest == null) {
            throw IllegalArgumentException("UpdateUserRequest is null")
        }
    }
}
```
### DTO
- Update${MODEL_NAME}Request
```kotlin
package com.irrigationsystem.service.test.updateUser

data class UpdateUserRequest(
    var user: User? = null
)

```

- Update${MODEL_NAME}Response
```kotlin
package com.irrigationsystem.service.test.updateUser

data class UpdateUserResponse(
    var message: String? = null,
    var user: User? = null

)
```

