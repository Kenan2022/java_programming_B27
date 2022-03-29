package day14_Login_App;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome ti ATM ***\nplease Enter your card and then type your pincode");

        int pincode = input.nextInt();

        int expectedPin = 2342;

        if (pincode == expectedPin){
            System.out.println(" Logged in");
            System.out.println(" Select on option");
            System.out.println("\t1)Check Balance");
            System.out.println("\t2)Withdrow");
            System.out.println("\t3)Deposite");
            int option = input.nextInt();

            if (option == 1){
                System.out.println("your balence is: $" +10_000_000);
            }else if (option == 2){
                System.out.println( "how much you want to withdraw");
                double money = input.nextDouble();
                System.out.println("Withdraw" + money);

            }else if (option == 3){
                System.out.println(" please deposit a money");
            }else {
                System.out.println("wrong pin . exiting account");
            }


        }else {
            System.out.println("Invalid pin. please tyr again");
        }







    }




}
