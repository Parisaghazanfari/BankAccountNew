package Boundry;

import Controller.AccountOperation;
import Controller.CustomerOperation;
import Controller.GetInformation;
import Entity.Account;
import Entity.Customer;
import Entity.Menu;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Account account=new Account();
        CustomerOperation customerOperation = new CustomerOperation();
        AccountOperation accountOperation=new AccountOperation();
        GetInformation getInformation =new GetInformation();
        Scanner sc = new Scanner(System.in);
        Menu menu=new Menu();
        menu.menuBar();
        String operation = sc.next();
        while (!operation.equals("escape")) {
            switch (operation) {
                case "1":
                    customer = getInformation.getCustomInfo();
                    customerOperation.addCustomer(customer);
                    menu.menuBar();
                    operation = sc.next();
                    break;
                case "2":
                    System.out.println(" Customer National Code For Delete:");
                    String nationalCodeDelete = sc.next();
                    customerOperation.deleteCustomer(nationalCodeDelete);
                    customerOperation.printCustomers();
                    menu.menuBar();
                    operation = sc.next();
                    break;
                case "3":
                    System.out.println(" Customer National Code For Edit:");
                    String nationalCodeEdit = sc.next();
                    customer = customerOperation.editCustomer(nationalCodeEdit);
                    customerOperation.printCustomers();

                    if(customer!=null) {
                        menu.menuBarEdit();
                        operation = sc.next();
//                    while (!operation.equals(0)) {
                        switch (operation) {
                            case "1":
                                System.out.println("Enter new Name");
                                customer.setName(sc.next());
                                System.out.println(customer);
                                break;
                            case "2":
                                System.out.println("Enter new Last Name:");
                                customer.setLastName(sc.next());
                                System.out.println(customer);
                                break;
                            case "3":
                                System.out.println("Enter new Address:");
                                customer.setAddress(sc.next());
                                System.out.println(customer);
                                break;
                            case "4":
                                System.out.println("Enter new Phone Number:");
                                customer.setPhoneNo(sc.next());
                                System.out.println(customer);
                                break;
                            case "5":
                                System.out.println("Enter new Post Code:");
                                customer.setPostCode(sc.next());
                                System.out.println(customer);
                                break;
                            case "0":
                                System.out.println("Exiting.... ");
                                break;
                        }
                    }
                    menu.menuBar();
                    operation = sc.next();
//            }
                    break;
                case "4":
                    customerOperation.printCustomers();
                    menu.menuBar();
                    operation = sc.next();
                    break;
                case "5":
                    System.out.println(" Customer National Code For Search:");
                    String nationalCodeSearch = sc.next();
                    customer=customerOperation.searchCustomer(nationalCodeSearch);
                    customerOperation.printCustomers(customer);
                    menu.menuBar();
                    operation = sc.next();
                    break;
                case "6":
                    account=getInformation.getAccountInfo();
                    accountOperation.addAccount(account);
                    menu.menuBar();
                    operation= sc.next();
                    break;
                case "7":
                    System.out.println(" Account Cart Number For Delete:");
                    String cartNumberDelete=sc.next();
                    accountOperation.deleteAccount(cartNumberDelete);
                    accountOperation.printAccounts();
                    menu.menuBar();
                    operation= sc.next();
                    break;
                case "8":
                    accountOperation.printAccounts();
                    menu.menuBar();
                    operation= sc.next();
                    break;
                case "9":
                    String cartNumber;
                    System.out.println("Enter Cart Number for search:");
                    cartNumber=sc.next();
                    account=accountOperation.searchAccount(cartNumber);
                    accountOperation.printAccounts(account);
                    menu.menuBar();
                    operation= sc.next();
                    break;
                case "escape":
                    System.out.println("Exiting.... ");
            }
        }
            System.out.println("Bye");
    }
}
