# cmpe202
CRC Cards 
1)Class Name : Customer

Knows : Name 
Cellphone
Number of people in party

Does: Request for a table in restaurant
Confirm request
Leave the wait list

Collaborators: Restaurant

2)Class Name : Restaurant

Knows : Restaurant Name 
Customer wait list
Customer - Table allocation list

Does: Accept customer's request for a table
add customer to wait queue
send message to customer
remove customer from wait queue
Allocate table to customer
Deallocate table to customer

Collaborators: Availaibility

3)Class Name : Availaibility

Knows: List of allocated tables
List of free tables

Does: Add table to allocated list
Add table to free list
Remove table from allocated list
Remove table from free list
find matching table 

Collaborators: Restaurant,
Table

4)Class Name : Table

Knows: 
current state - occupied, free, in process
id 
capacity 

Does: Provides id 
Provides capacity details
Provides current state information

Collaborators: None


I choose the State pattern in my design as depending on the state whether tables are full or tables are empty , restaurant will behave in accordance with its internal state.

In ny design, following classes play the role of the context and the state
Context - Restaurant
State - Availaibility