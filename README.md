# Spring Boot GraphQL Tutorial #
##  #1 - Apply Client object to GraphQl
### Run example:
#### Write your query or mutation here
```
query GET_BANK_ACCOUNT($id: ID){
    bankAccount(id: $id) {
        client{
            id
            firstName
            lastName
        }
    }
}

```
#### Result:
```json
{
  "data": {
    "bankAccount": {
      "client": {
        "id": "67254ef9-131c-4eb7-8999-79ca1d60cae6",
        "firstName": "Thien",
        "lastName": "Quach"
      }
    }
  }
}
```

