package JavaDay38;
import java.util.Random;
import java.time.*;
public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate = 0.045;
    private LocalDate dateCreated;


    public Account() {

    }

    public Account(double balance){
        this.balance=balance;
        id=generateAccountID();
        dateCreated= LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(double monthlyInterestRate) {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterest();
    }

    public void withdraw(double amount) {
       balance -= amount;
    }
    public void deposit(double amount) {
     balance +=amount;
    }
    private static int generateAccountID() {

        return 1000 + (int)(Math.random() * 9000);
    }
}