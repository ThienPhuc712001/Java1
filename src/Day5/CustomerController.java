package Day5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    ArrayList<Customer> customers = new ArrayList<>();
    private Scanner scanner;

    public void create(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap thong tin khach hang. ");
        System.out.println("Nhap id:");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhap ten");
        String firstName = scanner.nextLine();
        System.out.println("Nhap ho");
        String lastName = scanner.nextLine();
        System.out.println("Nhap email");
        String email = scanner.nextLine();
        System.out.println("Nhap phone");
        String phone = scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = scanner.nextInt();
        scanner.nextLine();



        Customer customer = new Customer();
        customer.setId(id);
        customer.setAddress(address);
        customer.setAge(age);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhone(phone);


        customers.add(customer);

    }

    public void showListCustomer(){
        System.out.println("Hien thi danh sach khach hang");
        System.out.println("__________________________________");
        System.out.printf("%s-10s || %-30s || %-30s\n", "Id", "Last Name" , "First Name");
        System.out.println("==============================================================");
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            System.out.printf("%s-10s || %-30s || %-30s\n", c.getId(), c.getLastName(), c.getFirstName());

        }
        System.out.println("Enter de tiep tuc");
        scanner.nextLine();
    }
}
