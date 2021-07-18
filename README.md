
Duration: 1 hr 

Build a spring boot reactive application with the following requirement

## 1

Update the models with the missing items so it adheres to the below requirements

* `ProductOrder` should contain more than one `ProductOrderItem`
* Upon submission each customer's `ProductOrder` should be different from other customer `ProductOrder`
* Each `ProductOrderItem` must be uniquly identifiable for a given `ProductOrder`


```
class ProductOrder {
  String state;
  LocalDateTime orderDate;  
  String category;
  String description;      
}

class ProductOrderItem {
  String itemName;
  String itemType;
  double itemPrice;
}
````


## 2 

Use the Dao operations to save and get the `ProductOrder` data for GET and POST operation.

For POST operation, persist the data into the destination store

For GET by id operation retrieve all resource data for given id and sort the product order item 
data in order by item name. But in future the sorting algo could change.
How to incorporate the logic without changing much code. Also ensure that the algo picking is configurable externally to switch to different algo


## 3 

Ensure the end to end flow is reactive


## 4

Code needs to be committed to the repo into a new branch and PR is raised

 


