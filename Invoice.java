package tamrin2;
import tamrin2.Customer;


public class Invoice {

    private int id;
    private Customer customer ; 
    private double amount ; 

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName() {
		return customer.getName();
	}
    public int getCustomerID() {
		return customer.getId();
	}
    public int getCustomerDiscount() {
		return customer.getDiscount();
	}
    public double getAmountAfterDiscount() {
		return amount - amount * customer.getDiscount() / 100;
	}

    @Override
    public String toString() {
        return "Invoice[id"+getId()+"customer"+getCustomerName()+"("+customer.getId()+")("+customer.getDiscount()+"%) , amount = "+getAmount()+"]";
    }
    
}
