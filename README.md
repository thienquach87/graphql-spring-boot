# Spring Boot GraphQL Tutorial 

##  Initial
### Access to http://localhost:8081/playground to do these queries.

##  Apply Client object to GraphQl
### Run example:
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
--------------------------------------------------------------
##  Playground
### Run example:
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
--------------------------------------------------------------

## Voyager
### Access to http://localhost:8081/voyager to see how voyager work.

--------------------------------------------------------------
## Resolver
```
query GET_BANK_ACCOUNT($id: ID!){
    bankAccount(id: $id)  { # Bank account query resolver
        id
        currency
        client { # Client account query resolver
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
      "id": "24104cba-e43d-4431-b24a-30748b42f7a8",
      "currency": "USD",
      "client": {
        "id": "c404d5b0-ed38-4cd9-bcd2-6527d3a33c8f",
        "firstName": "Thien1",
        "lastName": "Quach"
      }
    }
  }
}
```

```
query GET_BANK_ACCOUNT($id: ID!){
    bankAccount(id: $id)  { # Bank account query resolver
        id
        currency
    }
}
```
#### Result:
```json
{
  "data": {
    "bankAccount": {
      "id": "24104cba-e43d-4431-b24a-30748b42f7a8",
      "currency": "USD"
    }
  }
}
```
------------------------------------------------------------
## Exception Handling
### Start server then run the query below based on each commit to see the exception message for each case.
```
query GET_BANK_ACCOUNT($id: ID!){
    bankAccount(id: $id)  { # Bank account query resolver
        id
        currency
        client { # Client account query resolver
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
  "errors": [
    {
      "message": "Internal Server Error",
      "locations": []
    }
  ],
  "data": {
    "bankAccount": {
      "id": "24104cba-e43d-4431-b24a-30748b42f7a8",
      "currency": "USD",
      "client": null
    }
  }
}
```
--------------------------------------------------------------------------
## Data Fetcher Result
### Query.
```
query GET_BANK_ACCOUNT($id: ID!){
    bankAccount(id: $id)  { # Bank account query resolver
        id
        currency
        client { # Client account query resolver
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
  "errors": [
    {
      "message": "Could not get sub-client id",
      "locations": []
    }
  ],
  "data": {
    "bankAccount": {
      "id": "24104cba-e43d-4431-b24a-30748b42f7a8",
      "currency": "USD",
      "client": {
        "id": "ba376a05-d389-42eb-ae79-80450506ae6e",
        "firstName": "Thien1",
        "lastName": "Quach"
      }
    }
  }
}
```