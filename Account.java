package tamrin2;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account() {
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.getName() + "(" + id + ")" + "balance = "+ balance+"$" ; 
    }

    public Account deposit(double amount) {
       balance = balance + amount;
       return this;
      
    }

    public Account withdraw(double amount) {
        if (balance >= amount) 
            balance = balance - amount;
        else
            System.out.println("amount withdrawn exceed the current balance! ");
            return this;
        }

    }

