# Banking-Java-Project
The task is to create a program to manage accounts for a bank.
The banking portal will limit the number of accounts managed. The portal must track information about all accounts so that it can report the total balance of all accounts and how many new accounts can be added. The banking portal should also provide publicly available methods to allow accounts to be added and removed from it (this should also update the list of accounts inside the banking portal), a method to display the maximum number of accounts that can be added, and lastly a method to search for an account by its account number.
	
	
Attempting to add an account to a banking portal that has already reached its limit of accounts should generate an exception with a message detailing the error. Trying to remove an account that is not managed by the portal should also throw an exception with an appropriate message.


The accounts themselves have 2 types: Debit and Savings. Every account, no matter the type, has an account number, balance, and the ability to withdraw and deposit. The debit account has a fee whenever the user withdraws from it (the fee should be passed into the debit account object when it is created). The savings account cannot be withdrawn from until 2 years have passed since the account’s creation (this date should also be passed into the savings account object like the fee for the debit account)


Create JUnit tests for all the non-trivial methods (methods that do more than simply returning or setting variables). Do not just test positive cases (where they are supposed to succeed), also test negative cases (where u want them to fail).

Challenges (Attempt after completing initial project)
Challenge #1: A proper savings account should accrue interest over time. Create an unchanging variable for the savings account for an annual interest rate of 2%. When returning the balance of the account, the interest should be applied. Do not worry about calculating compound interest, just multiply the balance by 2%).

Challenge #2: Create your own custom exception for your code to throw.

Challenge #3: Your negative tests shouldn’t simply just test for if a value is not equal to another value. They should also make sure that the correct exceptions are being thrown along with the appropriate messages. Try adding the assertThrows method to your negative tests to ensure the correct exceptions are being thrown by your code.
