package entities;

import java.util.Calendar;
import java.util.Date;

public class Account {


    protected int number;
    protected String name;
    protected String email;
    protected Date birth;
    protected double balance;

    //CONSTRUTOR
    public Account() {
    }

    public Account(int number, String name, String email, Date birth, double initialBalance) {
        this.number = number;
        this.name = name;
        this.email = email;
        this.birth = birth;
        deposit(initialBalance);
    }

    //Getter SETTER
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public double getBalance() {
        return balance;
    }

    //METODOS
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
        } else {
            balance -= amount;
        }
    }
}
