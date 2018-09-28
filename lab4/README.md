# cmpe202
CRC Cards 
1)Class Name : Customer

Knows : Name 
Cellphone
Number of people in party

Does: Request for a table in restaurant
Confirm request
Leave the restaurant
Receive message from restaurant

Collaborators: Restaurant

2)Class Name : Restaurant

Knows : Restaurant Name 
Customer wait list
Customer - Table allocation list

Does: Accept customer's request for a table
add customer to wait queue
send message to customer
remove customer from wait queue
Allocate table for a customer
Deallocate table to customer
Scan Wait List

Collaborators: Resource,
Customer

3)Class Name : Resource
Subclass: Full,
Empty

Knows: List of allocated resources (tables)
List of free resources (tables)

Does: IncrementResource
DecrementResource
find matching resource 

Collaborators: Restaurant,
Table

4)Class Name : Table

Knows: 
id 
capacity 

Does: Provides id 
Provides capacity details

Collaborators: None

I choose the State pattern in my design as depending on the state, whether all tables are full or some tables are unoccupied , restaurant will behave in accordance.

In my design, following classes play the role of the context and the state
Context - Restaurant
State - Resource
Concrete State - Full, Empty
