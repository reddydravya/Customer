import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private int id;
    private String firstName;
    private String lastName;
    private double balance;

    public Customer() {}

    public Customer(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + id +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Customer other) {
        int result = this.firstName.compareTo(other.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(other.lastName);
        }
        if (result == 0) {
            result = Integer.compare(this.id, other.id);
        }
        if (result == 0) {
            result = Double.compare(this.balance, other.balance);
        }
        return result;
    }
}

class CustomerApplication {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(3, "John", "Doe", 5000.75));
        customers.add(new Customer(1, "Alice", "Smith", 3000.50));
        customers.add(new Customer(2, "John", "Smith", 4000.00));
        customers.add(new Customer(4, "Alice", "Brown", 2000.25));
        customers.add(new Customer(5, "John", "Doe", 4500.00));

        System.out.println("Unsorted Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Collections.sort(customers);

        System.out.println("\nSorted Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
