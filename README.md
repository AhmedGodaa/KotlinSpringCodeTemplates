## Documentation For UpdateModel Template

### File Naming

- Create Model

```vtl
create${MODEL_NAME}/Create${MODEL_NAME}Docs.md
create${MODEL_NAME}/Create${MODEL_NAME}Validator
create${MODEL_NAME}/Create${MODEL_NAME}ValidatorImpl
create${MODEL_NAME}/Create${MODEL_NAME}Service
create${MODEL_NAME}/Create${MODEL_NAME}ServiceImpl
create${MODEL_NAME}/Create${MODEL_NAME}Response
create${MODEL_NAME}/Create${MODEL_NAME}Request
```

- Get Model

```vtl
get${MODEL_NAME}s/Get${MODEL_NAME}sDocs.md
get${MODEL_NAME}s/Get${MODEL_NAME}sValidator
get${MODEL_NAME}s/Get${MODEL_NAME}sValidatorImpl
get${MODEL_NAME}s/Get${MODEL_NAME}sService
get${MODEL_NAME}s/Get${MODEL_NAME}sServiceImpl
get${MODEL_NAME}s/Get${MODEL_NAME}sResponse
get${MODEL_NAME}s/Get${MODEL_NAME}sRequest
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
delete${MODEL_NAME}/Delete${MODEL_NAME}Docs.md
delete${MODEL_NAME}/${MODEL_NAME}DeletionException
delete${MODEL_NAME}/Delete${MODEL_NAME}ValidatorImpl
delete${MODEL_NAME}/Delete${MODEL_NAME}Validator
delete${MODEL_NAME}/Delete${MODEL_NAME}ServiceImpl
delete${MODEL_NAME}/Delete${MODEL_NAME}Service
delete${MODEL_NAME}/Delete${MODEL_NAME}Request
delete${MODEL_NAME}/Delete${MODEL_NAME}Response
```

## Example Generated UseCases - Land

| Create Model                                                     | Get Model                                                 | Update Model                                                     | Delete Model                                                     |
|------------------------------------------------------------------|-----------------------------------------------------------|------------------------------------------------------------------|------------------------------------------------------------------|
| [CreateLandExample.md](createModelTemplate/CreateLandExample.md) | [GetLandsExample.md](getModelTemplate/GetLandsExample.md) | [UpdateLandExample.md](updateModelTemplate/UpdateLandExample.md) | [DeleteLandExample.md](deleteModelTemplate/DeleteLandExample.md) |

