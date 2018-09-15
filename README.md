# retailRepo - Introdution 
This project consists of java project to calculate the net payable amount at bill counter .

The BillTest.java class is the JNUIT class which has the test coverages . It consists of following methods :
				- testGroceryEmployee
				- testNonGroceryEmployee
				- testGroceryAffiliated
				- testNonGroceryAffiliated
				- testJoiningDateNonGrocery
				- testJoiningDateGrocery
				- testMultipleItemsEmployee
				
Bill is the main class to calculate the net payable amount . Logic as below :
 - If the User is of type "Employee", then a discount of 30% applicable for non grocery items 
 - else if the User is of type "Affliated", then a discount of 10% applicable for non grocery items
 - else if the User is a member for more than 2 years, then a discount of 10% applicable for non grocery items
 
 With the above logic , discount percentage is calculated . 
 
 Then items in the ItemCart is been iterated and item price for each product is calculated by product price * item quantity . 
 Discounted amount is calculated by applying discoung percentage on item price if the producttype is non grocery .
 If the product type is non grocery , then deduct discounted amount from item price and net item price is received .
 
 Total gross amount is calculated from the sum of the net Item price .
 
 If the gross amount is greater than 100, then gross amount/100 value is calculated and the result*5 is dedcuted from the gross amount and from that , net amount is calculated.
 
 
Bill.java has 2 input parameters User and ItemCart . ItemCart.java has a Map of products(collections of Product) and item quantity .
Product.java has Product name , product type which can be grocery or Non Grocery and price . 
User.java has userName, user Type which can be EMPLOYEE, AFFLIATED , NORMAL
				
