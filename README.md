
                Flow-Chart:
1.	Start Program: The program starts.
2.	Create Customer Objects: Customer objects are created with unique customer details.
3.	Create Account Objects: Accounts (such as savings, checking) are created for each customer.
4.	Add Accounts to Customers: The created accounts are linked to respective customers.
5.	Perform Deposits: Customers can deposit money into their accounts.
6.	Perform Withdrawals: Customers can withdraw money from their accounts (if balance allows).
7.	Perform Fund Transfers: Customers can transfer funds between their accounts or to another customer’s account.
8.	Apply for Loan: Customers can apply for a loan, if required.
9.	Calculate EMI for Loan: If the loan is applied, the EMI is calculated based on the loan amount, interest rate, and tenure.
10.	Display Final Output: The details of transactions, transfers, and loan status are displayed.
11.	End: The program terminates. 
 
                           Execution Process with Steps:
1.	Create Customer and Account Objects:
o	Instantiate customer objects with details (ID, name) and account objects (account number, balance).
2.	Add Accounts to Customers:
o	Associate accounts with customers using the addAccount method.
3.	Perform Banking Operations:
o	Deposit: Add funds to customer accounts.
o	Withdraw: Deduct funds from customer accounts (if sufficient balance exists).
o	Transfer Funds: Move funds between different customer accounts.
4.	Loan Application and EMI Calculation:
o	Customers can apply for loans, and the program calculates their monthly EMI.
5.	Display Customer and Account Details:
o	After completing banking operations, the details of customers, accounts, and loan applications are displayed.
6.	End the Program:
o	The program ends after performing all operations.
                                  Learning Outcomes:
•	OOP Fundamentals: Understanding and applying concepts like classes, objects, encapsulation, and polymorphism.
•	Collections Framework: Managing groups of objects with Java collections (e.g., List).
•	Polymorphism & Inheritance: Overriding methods to demonstrate polymorphism and using inheritance for code reusability.
•	Exception Handling: Implementing exception handling to manage invalid inputs (e.g., negative deposit amounts).
•	Interfaces: Designing interfaces (LoanManagement) to define common behaviors and ensure flexibility.
•	Banking Operations: Simulating real-world banking activities such as deposits, withdrawals, transfers, and loan management.
•	Problem Solving: Using algorithmic thinking to handle financial transactions, EMI calculations, and loan applications.
                               List Concept Implements:
The following Java concepts are implemented in this system:
1.	Classes and Objects:
o	Customer, Account, LoanAccount, Bank are defined as classes representing real-world entities.
2.	Encapsulation:
o	Using private fields in classes and public getter and setter methods to manage data securely.
3.	Polymorphism:
o	Overriding the getDetails() method in Account and Customer classes to display specific information.
4.	Inheritance:
o	The LoanAccount class inherits from Account and implements the LoanManagement interface.
5.	Interfaces:
o	LoanManagement interface is used to define methods like applyForLoan and calculateEMI for loan handling.
6.	Exception Handling:
o	Using try-catch blocks to handle errors like invalid loan amounts or insufficient balance during withdrawals.
7.	Collections Framework:
o	The program uses List<Customer> and List<Account> to store customers and their accounts, respectively.

ENJOY 
