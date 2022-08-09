# Spring Boot GraphQL Tutorial #
##  #1 - Creating your first Schema and Query
### Run example:
	{
  		bankAccount(id: "24104cba-e43d-4431-b24a-30748b42f7a8"){
    		id 
    		name 
    		currency
  		}
	}
### Result:
	{
		"data": {
			"bankAccount": {
				"id": "24104cba-e43d-4431-b24a-30748b42f7a8",
				"name": "thien.quach",
				"currency": "USD"
			}
		}
	}
