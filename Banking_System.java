import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount + ", New Balance: Rs " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount + ", Remaining Balance: Rs " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void getDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs " + balance);
    }
}

class Customer {
    private String customerId;
    private String name;
    private List<Account> accounts;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account with Account Number " + account.getAccountNumber() + " added to customer " + name);
    }

    public void getDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Accounts: ");
        for (Account account : accounts) {
            account.getDetails();
        }
    }
}

class Bank {
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to the bank.");
    }

    public void transferFunds(String fromAccount, String toAccount, double amount) {
        Account sourceAccount = null;
        Account destinationAccount = null;

        for (Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(fromAccount)) {
                    sourceAccount = account;
                }
                if (account.getAccountNumber().equals(toAccount)) {
                    destinationAccount = account;
                }
            }
        }

        if (sourceAccount != null && destinationAccount != null) {
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transferred Rs " + amount + " from Account " + fromAccount + " to Account " + toAccount);
        } else {
            System.out.println("Invalid account details for transfer.");
        }
    }
}

interface LoanManagement {
    void applyForLoan(double amount);

    void calculateEMI(double loanAmount, double interestRate, int tenure);
}

class LoanAccount implements LoanManagement {
    private String loanId;
    private double loanAmount;
    private double EMI;

    public LoanAccount(String loanId, double loanAmount) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.EMI = 0;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount > 0) {
            this.loanAmount = amount;
            System.out.println("Loan of Rs " + amount + " has been approved.");
        } else {
            System.out.println("Invalid loan amount.");
        }
    }

    @Override
    public void calculateEMI(double loanAmount, double interestRate, int tenure) {
        try {
            if (loanAmount <= 0 || interestRate <= 0 || tenure <= 0) {
                throw new IllegalArgumentException("Invalid loan details provided.");
            }
            EMI = (loanAmount * interestRate * Math.pow(1 + interestRate, tenure)) / (Math.pow(1 + interestRate, tenure) - 1);
            System.out.println("EMI for the loan of Rs " + loanAmount + " at " + interestRate * 100 + "% interest for " + tenure + " months: Rs " + EMI);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Banking_System {
    public static void main(String[] args) {
        Account account1 = new Account("A001", "Savings", 10000);
        Account account2 = new Account("A002", "Checking", 5000);
        Customer customer1 = new Customer("C001", "Alice");
        customer1.addAccount(account1);
        customer1.addAccount(account2);

        Account account3 = new Account("A003", "Savings", 20000);
        Customer customer2 = new Customer("C002", "Bob");
        customer2.addAccount(account3);

        Bank bank = new Bank();
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        customer1.getDetails();
        customer2.getDetails();

        customer1.getAccounts().get(0).deposit(2000);
        customer1.getAccounts().get(1).withdraw(1000);
        bank.transferFunds("A001", "A003", 1500);

        LoanAccount loanAccount = new LoanAccount("L001", 0);
        loanAccount.applyForLoan(50000);
        loanAccount.calculateEMI(50000, 0.05, 12);
        
        System.out.println("\nBanking System - Developed by Irfan (UID: 23BCS80041)");
    }
}
