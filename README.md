# Spring Boot GraphQL Tutorial #
##  #1 - Apply Client object to GraphQl
### Run example:
#### Write your query or mutation here
```
{
  bankAccount(id: "24104cba-e43d-4431-b24a-30748b42f7a8"){
      id
      currency
      client{
          id
          firstName
          client{
              firstName
              id
              client {
                  lastName
                  id
                  client{
                      lastName
                      id
                    }
                }
            }
        }
    }
}

```
#### Result:
```json
{
    "data": {
        "bankAccount": {
        "id": "24104cba-e43d-4431-b24a-30748b42f7a8",
        "currency": "USD",
        "client": {
            "id": "b47fd6c0-97e5-4084-aacf-7a9110dbf216",
            "firstName": "Thien",
            "client": {
                "firstName": "Thien1",
                "id": "bd10aab9-dc33-45be-a93d-a46d6e6d3ea1",
                "client": {
                    "lastName": "Quach",
                    "id": "b47fd6c0-97e5-4084-aacf-7a9110dbf216",
                    "client": {
                        "lastName": "Quach",
                        "id": "bd10aab9-dc33-45be-a93d-a46d6e6d3ea1"
                        }
                    }
                }
            }
        }
    }
}
```

