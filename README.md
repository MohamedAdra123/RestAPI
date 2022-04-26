##for the user:
| HTTP method | URL path                     | HTTP status code | description                            |   |
|-------------|------------------------------|------------------|----------------------------------------|---|
| GET         | localhost:8080/api/user      | 200              | returns all the users                  |   |
| GET         | localhost:8080/api/user/{id} | 200              | return the user that has a specific id |   |
| POST        | localhost:8080/api/user/save | 200              | save a user                            |   |

##for the cart:
| HTTP method | URL path                     | HTTP status code | description                            |   |
|-------------|------------------------------|------------------|----------------------------------------|---|
| GET         | localhost:8080/api/cart      | 200              | returns all the carts                  |   |
| GET         | localhost:8080/api/cart/{id} | 200              | return the cart that has a specific id |   |
| POST        | localhost:8080/api/cart/save | 200              | save a cart                            |   |


##for the item:
| HTTP method | URL path                      | HTTP status code | description                            |   |
|-------------|-------------------------------|------------------|----------------------------------------|---|
| GET         | localhost:8080/api/items      | 200              | returns all the items                  |   |
| GET         | localhost:8080/api/items/{id} | 200              | return the item that has a specific id |   |
| POST        | localhost:8080/api/items/save | 200              | save an item                           |   |
