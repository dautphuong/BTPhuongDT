import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Stack;

public class Manager {
    static Scanner scanner=new Scanner(System.in);
    static Stack<Customer> customers = new Stack<>();


    public static void main(String[] args) {
        displayMainMenu();
    }
    
    private static void displayMainMenu() {

        System.out.println("Choose Function :");
        System.out.println("1. Add a new Customer\n"+
                "2. Show all Customers\n"+
                "3. Search Customer\n"+
                "4. Remove Customer\n"+
                "5.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                createCustomer();
                displayMainMenu();
            case "2":
                findAll();
                displayMainMenu();
            case "3":
                searchCustomer();
                displayMainMenu();
            case "4":
                removeCustomer();
                displayMainMenu();
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }

    private static void removeCustomer() {
        System.out.print("Remove customer by phone number :");
        String phoneNumber=scanner.nextLine();
        customers.removeIf(customer -> customer.getPhoneNumber().equals(phoneNumber));
    }

    private static void searchCustomer() {
        System.out.print("Enter name customer :");
        String enterName = scanner.nextLine();
        Stack<Customer> stack = (Stack<Customer>) customers.clone();
        System.out.println("--------Search Customer--------:");
        try {
            while (true) {
                boolean flag = stack.peek().getName().equals(enterName);
                if (!flag) {
                    stack.pop();
                } else {
                    System.out.println(stack.pop().toString());
                    scanner.nextLine();
                    break;
                }
            }
        } catch (Exception e) {
            displayMainMenu();
        }
    }

    static void findAll() {
        try {
            System.out.println("----List of customer");
            for(Customer customer : customers) {
                System.out.println(customer);
            }
            scanner.nextLine();
        }catch (Exception e){
            System.out.println("List customer is null");
        }
    }

    static void createCustomer() {
        String c;
        do {
            Customer customer=new Customer();
            System.out.println("----Enter customer information----");
            System.out.print("Enter name :");
            customer.setName(scanner.nextLine());
            System.out.print("Enter phone :");
            customer.setPhoneNumber(scanner.nextLine());
            System.out.print("Enter address :");
            customer.setAddress(scanner.nextLine());
            Order order=new Order();
            System.out.println("Enter order info :");
            System.out.print("+ Number :");
            order.setNumber(scanner.nextLine());
            System.out.print("+ date :");
            try {
                order.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(scanner.nextLine()));
            } catch (ParseException e) {
                e.printStackTrace();
            };
            Order[]arr={order};
            customer.setListOrder(arr);
            //stack push value
            customers.push(customer);
            System.out.print("Continue (Y/N):");
            c = scanner.nextLine();
        } while (!c.equals("n") && !c.equals("N"));
    }

     static String save(Stack<Customer> customers) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("D:/data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Customer customer : customers) {
                oos.writeObject(customers);
            }
            fos.close();
            oos.close();
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
        return "Save success";
    }

}
