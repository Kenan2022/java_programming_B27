package day18_String;

import java.util.Locale;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a username");
        String username = input.next();
        username = username.toLowerCase();
        System.out.println(username);

        System.out.println("please enter password");
        String password = input.next();
        if (password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with" + username);
        }else {
            System.out.println("Invalid password");
        }






    }


}
