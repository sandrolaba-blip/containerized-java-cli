import java.util.ArrayList;
import java.util.Scanner;

/**
 * Customer class: a simple "blueprint" for what a customer object looks like.
 * Each object created from this class lives at its own spot in memory.
 */
class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Name:  " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone;
    }
}

public class CustomerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The ArrayList doesn't hold Customer data directly.
        // It holds references (like addresses) that point to where
        // each Customer object actually lives on the heap.
        ArrayList<Customer> customers = new ArrayList<>();

        int numberOfCustomers = 2;

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("\n--- Enter details for customer " + i + " ---");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            // "new Customer(...)" creates an actual object in memory.
            // customers.add(...) stores a REFERENCE to that object in the list,
            // not a copy of its data.
            Customer newCustomer = new Customer(name, email, phone);
            customers.add(newCustomer);
        }

        System.out.println("\n===== Stored Customer Information =====");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("\nCustomer " + (i + 1) + ":");
            // customers.get(i) follows the stored reference back to the
            // real object in memory, so we can read its data.
            System.out.println(customers.get(i));
        }

        scanner.close();
    }
}