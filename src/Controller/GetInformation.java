package Controller;

import Entity.Account;
import Entity.Customer;

import java.util.Scanner;

public class GetInformation {
    CustomerOperation customerOperation = new CustomerOperation();
    Scanner sc = new Scanner(System.in);
    public Customer getCustomInfo(){
        Customer customer = new Customer();
        System.out.println("Please enter your information");
        System.out.println(" Customer Name:");
        customer.setName(sc.next());
        System.out.println(" Customer Last Name:");
        customer.setLastName(sc.next());
        System.out.println(" Customer National Code:");
        customer.setNationalCode(sc.next());
        System.out.println(" Customer Address:");
        customer.setAddress(sc.next());
        System.out.println(" Customer Phone Number:");
        customer.setPhoneNo(sc.next());
        System.out.println(" Customer Post Number:");
        customer.setPostCode(sc.next());
        return customer;
    }
    public Account getAccountInfo() {
        Account account = new Account();
        System.out.println("Please enter your information");
        System.out.println(" Cart Number:");
        account.setCartNumber(sc.next());
        System.out.println(" Account Number");
        account.setAccountNumber(sc.next());
        System.out.println(" Account Sheba Number:");
        System.out.print("IR-");
        account.setShebaNumber(sc.next());
        System.out.println(" Account CVV2:");
        account.setCvv2(sc.nextInt());
        System.out.println(" Account Expire Month:");
        account.setExpireMonth(sc.nextInt());
        System.out.println(" Account Expire Year:");
        account.setExpireYear(sc.next());
        System.out.println("Account Initial Amount:");
        AccountOperation accountOperation = new AccountOperation();
        double amount;
       account.setInitialAmount(sc.nextDouble());
       amount=account.getInitialAmount();
        while (!accountOperation.checkInitialAmount(amount)){
            System.out.println("Increase....");
            System.out.println("Account Initial Amount:");
            account.setInitialAmount(sc.nextDouble());
            amount= account.getInitialAmount();
        }
            System.out.println("Branch Name is:");
            System.out.println("\n" + account.getBranchName());
            System.out.println("Branch Code is:");
            System.out.println("\n" + account.getBranchCode());
            return account;
        }
    }
