My design includes two states and two observers.
Table is subject which checks table capacity and update status of table. Send this report to TableManager for scheduling next customer.
TableManager is observer which keeps tract of customers in waitlist and finds appropriate customers for next table.  
It gets information about next available table from Table. 
It also sends response to customers bout their position update.
Depending upon customers response to send message further action is taken. 
If response if confirm the table is assigned. 
If response is leave then next appropriate is searched and notified.
There are two states:
1) TableAvailable
2) TableOccupied

1) TableAvailable:
When there are no customers seated it is available or customers leaves table after giving check.

2)TableOccupied:
When customers are seated on table it occupied or when new customer is assigned the table.
