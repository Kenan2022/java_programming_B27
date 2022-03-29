package day11_if_statments;

import java.util.Scanner;

public class BankAccount{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "What is your balance");
        double Balance = input.nextDouble();
        System.out.println("How much are you withdrawing");
        double withdraw = input.nextDouble();
        //

       // double Balance = 100;
        //10double withdraw = 50;

        // withdraw some ampunt of money from balance
        Balance -= withdraw; // Balance - withdraw

        if (Balance< 0){
            System.out.println("Took out much money , $100 overdraft applied");
            Balance -= 100; // balance = balance - 100
        }

        System.out.println("Balance $" + Balance);




    }




}




