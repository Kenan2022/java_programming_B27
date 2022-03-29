package day19_Method.Website;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the url");
        String url = input.next();


        String website = url.substring(4, url.length() - 4);
        System.out.println(website);

    }

}
