package day10_scanner;

import java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {
          /*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)

     */

        Scanner input = new Scanner(System.in);
        System.out.println(" whats is your salary");
        double salary = input.nextDouble();
        System.out.println(" how many hours did yo in a weel");
        int hoursInWeek = input.nextInt();
        double hourlyRate =salary / (hoursInWeek * 52);
        System.out.println(" with the selary of " + salary + "and working for " + hoursInWeek + "hours your rate is " + hourlyRate);














    }



}
