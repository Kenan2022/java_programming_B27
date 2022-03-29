package day25_recap;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Word");
        String str = input.nextLine().toLowerCase();
        String camelCase = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i - 1) == ' ') {
                camelCase += str.substring(i, i + 1).toUpperCase();

            } else {
                camelCase += str.charAt(i);
            }


        }
        System.out.println(camelCase.replace("", ""));


    }
}