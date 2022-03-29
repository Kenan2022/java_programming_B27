package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int space =0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                space++;

            }
        }

        System.out.println("number of words: " + (space + 1 ));





    }
}
