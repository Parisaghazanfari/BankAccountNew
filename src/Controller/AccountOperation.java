package Controller;

import Entity.Account;
import Entity.Customer;

import java.util.ArrayList;

public class AccountOperation {
    CustomerOperation customerOperation=new CustomerOperation();
    ArrayList<Account> accounts = new ArrayList<>();


    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account add successfully:)");
    }

    public void deleteAccount(String cartNumberDelete) {
        Account account1 = searchAccount(cartNumberDelete);
        accounts.remove(account1);
    }
    public void printAccounts(){
        for (Account account:accounts
        ) {
            System.out.println(account);
        }
    }
    public void printAccounts(Account account) {
        System.out.println(account);
    }
    public boolean checkInitialAmount(double amount) {
        if (amount >= 100) {
            return true;
        }
        else
            return false;
    }
    public Account searchAccount(String cartNumber) {
        for (Account account1 : accounts
        ) {
            if (cartNumber.equals(account1.getCartNumber())) {
                System.out.println("Account Find");
                return account1;
            }
        }
        System.out.println("Account Not Found");
        return null;
    }
    }
