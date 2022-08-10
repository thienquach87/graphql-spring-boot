# Spring Boot GraphQL Tutorial #
##  #1 - Apply Client object to GraphQl
### Run example:
#### Write your query or mutation here
#### Access to http://localhost:8081/playground to do these queries.
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
#### Access to http://localhost:8081/voyager to see how voyager work.
