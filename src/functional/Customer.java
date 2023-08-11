package functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Customer {
    String customerName;
    String location;
    float planAmount;

    public Customer(String customerName, String location, float planAmount) {
        this.customerName = customerName;
        this.location = location;
        this.planAmount = planAmount;
        
    }
    
    public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(float planAmount) {
		this.planAmount = planAmount;
	}

	public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", "City A", 150.0f));
        customers.add(new Customer("Bob", "City B", 250.0f));
        customers.add(new Customer("Carol", "City C", 100.0f));

        customers.sort(Comparator.comparingDouble(Customer::getPlanAmount));
        
        Predicate<Customer> filter = customer -> customer.getPlanAmount() >= 200.0f;
        customers.removeIf(filter.negate());

        for (Customer customer : customers) {
            System.out.println(customer.customerName + " - " + customer.planAmount);
        }
    }
}