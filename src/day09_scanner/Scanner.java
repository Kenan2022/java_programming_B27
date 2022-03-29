package day09_scanner;

import java.io.InputStream;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {
        int e = 1; // e = 1 -> 0 -> 1
        int f = -e-- + e++ -e-- * --e;
        // -1 + 0 / -1 * - 1 * -1
        // -1 + 0
        // -1
        System.out.println(e);
        System.out.println(f);




    }



}
