## **VTL**

```vtl
create${MODEL_NAME}/Create${MODEL_NAME}Request
```

## **Kotlin**

```kotlin
package com.example.example.createLand

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateLandRequest(
    @JsonProperty("land") var land: Land? = null,
)

```

## **VTL**

```vtl
create${MODEL_NAME}/Create${MODEL_NAME}Response
```
## **Kotlin**

```kotlin
package com.example.example.createLand

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateLandResponse(
    @JsonProperty("message") var message: String? = null,
    @JsonProperty("land") var land: Land? = null
)

```
## **VTL**

```vtl
create${MODEL_NAME}/Create${MODEL_NAME}Service
```

## **Kotlin**

```kotlin
package com.example.example.createLand

interface CreateLandService {
    fun createLand(createLandRequest: CreateLandRequest?): CreateLandResponse
}

```
## **VTL**

```vtl
create${MODEL_NAME}/Create${MODEL_NAME}ServiceImpl
```
## **Kotlin**

```kotlin
package com.example.example.createLand

import org.springframework.stereotype.Service
import java.util.*

@Service
class CreateLandServiceImpl(
    private val createLandValidator: CreateLandValidator,
    private val landRepository: LandRepository
) : CreateLandService {
    override fun createLand(createLandRequest: CreateLandRequest?): CreateLandResponse {
        createLandValidator.validateCreateLandRequest(createLandRequest)
        val landToCreate = createLandRequest?.land
        val newLand = Land(
            id = UUID.randomUUID().toString(),

            )
        return CreateLandResponse(
            message = "Land created successfully",
            land = saveLandDB(newLand)
        )
    }


    fun saveLandDB(land: Land): Land {
        return try {
            landRepository.save(land)
        } catch (e: Exception) {
            throw Exception("Error while saving land to DB")
        }
    }
}
```
## **VTL**
```vtl
create${MODEL_NAME}/Create${MODEL_NAME}Validator
```
## **Kotlin**

```kotlin
package com.example.example.createLand

interface CreateLandValidator {
    fun validateCreateLandRequest(createLandRequest: CreateLandRequest?)
}
```
## **VTL**
```vtl
create${MODEL_NAME}/Create${MODEL_NAME}ValidatorImpl
```

## **Kotlin**

```kotlin
package com.example.example.createLand

import org.springframework.stereotype.Component

@Component
class CreateLandValidatorImpl : CreateLandValidator {
    override fun validateCreateLandRequest(createLandRequest: CreateLandRequest?) {
        if (createLandRequest == null) {
            throw Exception("CreateLandRequest is null")
        }
    }
}
```