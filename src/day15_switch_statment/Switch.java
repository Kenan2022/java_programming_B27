package day15_switch_statment;

import java.util.Scanner;

public class Switch {
    /*
        Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

            - The person must be a citizen or a resident
                -> If not print: You must be a citizen or a resident
            - Their age must be between 18 and 35
                -> If not print: Your age must be between 18 to 35 years old
            - They must have a high school diploma
                -> If not print: You must have a high school diploma

            > If all the criteria is met print: You are qualified for the Army
         */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen =input.nextBoolean();
        System.out.println(" Are you resident");
        boolean isResident = input.nextBoolean();
        System.out.println("do you have a high school diploma");
        boolean hasDiploma = input.nextBoolean();
        System.out.println("how old are you");
        int age = input.nextInt();

        if ((isCitizen || isResident) && hasDiploma && (age >=18 && age <= 35)){
            System.out.println("yoy are qualified for Army");
        }else {

            if (!isCitizen && !isResident) {
                System.out.println("you must be a citizen or a residents");
            }
            if (hasDiploma){
                System.out.println("you must have high school diploma");
            }

            if (age >=18 || age <= 35){
                System.out.println("you must betweem 18 to 35 year old");
            }




        }




    }
}
