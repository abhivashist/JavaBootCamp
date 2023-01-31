package bankScenario;

import java.util.InputMismatchException;
import java.util.Scanner;

class Customer{
    private Long account_number;
    private String name;
    private float balance;
    private double interest;


    public Long getAccount_number() {
        return account_number;
    }
    public void setAccount_number(Long account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    public double getInterest() {
        return interest;
    }


    public synchronized void m2(String name) {
        for(int i = 0; i < 10; i++) {
            System.out.print("This is : ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);


        }
    }

}

// money withdraw
class WithdrawThread extends Thread{

    Customer customer;
    float withdrawMoney;

    public WithdrawThread(Customer customer,float withdrawMoney) {
        this.customer = customer;
        this.withdrawMoney = withdrawMoney;
    }

    public  void run(){
        customer.m2("withdraw");

    }

}

// money deposit
class DepositThread extends Thread{

    Customer customer;
    float depositMoney;

    public DepositThread(Customer customer, float depositMoney) {
        this.customer = customer;
        this.depositMoney = depositMoney;
    }


    public void run() {
        customer.m2("deposit");

    }

}

// account balance check
class BalanceCheckThread extends Thread{
    Customer customer;
    float bal;
    public BalanceCheckThread(Customer customer) {
        this.customer = customer;
    }

    public  void run() {
        customer.m2("check");
    }
}
 class BankDemo {

    public static void main(String[] args) {

        System.out.println("Enter Customer Details : ");
        Customer customer1 = new Customer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Account Number : ");
        try {
            customer1.setAccount_number(sc.nextLong());
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter valid account Number ");
            System.exit(1);
        }

        System.out.print("Enter Customer Name : ");
        try {
            customer1.setName(sc.next());
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter valid customer name ");
            System.exit(1);
        }


        System.out.print("Enter Customer Balance : ");
        try {
            customer1.setBalance(sc.nextFloat());
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter valid account Number ");
            System.exit(1);
        }

        System.out.print("Enter Interest  : ");
        customer1.setInterest(sc.nextDouble());
        System.out.println("");

        WithdrawThread thread1 = new WithdrawThread(customer1, 500);
        DepositThread thread2 = new DepositThread(customer1, 1000);
        BalanceCheckThread thread3 = new BalanceCheckThread(customer1);

        thread1.start();
        thread2.start();
        thread3.start();

    }



}