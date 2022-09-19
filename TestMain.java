package tamrin2;

public class TestMain {

    public static void main(String[] args) {
        // Test Customer class
        System.out.println("Test Customer class");
        Customer c1 = new Customer(40, "ali", 20);
        System.out.println(c1);  

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount() + " %");

        // Test Invoice class
        System.out.println("Test Invoice class");
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer()); 
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerID());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount() + " %");
        System.out.println("amount after discount is: "+  inv1.getAmountAfterDiscount() + " %");
        
        
        //Test Account class
        System.out.println("Test Account class");
        Account ac = new Account(85, c1, 20.3);
        System.out.println(ac);
        System.out.println("id is: " + ac.getId());
        System.out.println("deposit is: " + ac.deposit(60.8));  
        System.out.println("withdraw is: " + ac.withdraw(30));
        System.out.println("balance is: " + ac.getBalance());
        System.out.println("customer is: " + ac.getCustomer());

    }

}
