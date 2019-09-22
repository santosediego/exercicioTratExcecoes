package application;

import com.sun.javafx.binding.StringFormatter;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

/**
 *
 * @author Diego Santos
 */
public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();        
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        double initialLimit = sc.nextDouble();
        
        Account account = new Account(number, holder, initialBalance, initialLimit);
        
        System.out.println();
        System.out.print("Enter amout for withdraw: ");
        double amount = sc.nextDouble();
        
        try{
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }catch(DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
        System.out.println("Tudo posso Naquele que me Fortalece!!!");
        
    }
    
}
