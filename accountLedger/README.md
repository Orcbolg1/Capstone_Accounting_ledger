# Capstone 1 Account Ledger

## 1. Introduction
I have developed a Java CLI application designed for tracking financial transactions, whether they're for business or personal use. 
The program reads these transactions from a file named "transactions.csv" and saves each transaction entry to this file. 
Subsequently, it records the transaction in the ledger menu. Users can filter transactions within the ledger menu. 
This menu displays all transactions, with the most recent entry appearing at the top. 
The filtering options include showing all transactions, deposits, or payments.

The ledger menu serves as a central hub for transaction management. Within the program, users have access to a reporting 
function that allows them to filter transactions based on specific criteria. These criteria include filtering by the 
current month, the previous month, year-to-date, the previous year, or by vendor.


# 2. ScreenShots
## Main Menu

![HomeMenu.PNG](img%2FHomeMenu.PNG)

# Report
![AllTransaction.PNG](img%2FAllTransaction.PNG)

# Filter Reports
Errors are Highlighted RED!
![Filter by vendor.PNG](img%2FFilter%20by%20vendor.PNG)

# Deposit Function!
This is what im proud of. If a user input the wrong time or date in the addDeposit or addPayment function, It will return with a error message then grab the real time and real date for the user to pass into the method. 
![PaymentFunction.PNG](img%2FPaymentFunction.PNG)



# Future Works
1. I would add catches for exceptions, better error handling. ore detail for error messages.  
2. I would add cosmetics for the user to be visually appealing. It would be easier to read the reports. 
3. i would add better filter functions including certain dates, months, year, and by description
4. More detail for error messages.


# Thanks
1. I would like to thank Raymond for being a great instructor.
2. I would like to thank peers Hamza, Christian and Daniel for helping me stay focused and helping me fix my code. 
3. https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println to add colors to my code.
4. https://stackoverflow.com/questions/2839137/how-to-use-comparator-in-java-to-sort Source for my Collections.sort(transactions, new Comparator<Transaction>().
