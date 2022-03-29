package day22_Loops;

public class Letters {
    public static void main(String[] args) {


        char lowerCaseUp = 'a';

        while (lowerCaseUp <= 'z') {

            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }

        char uppercaseBack = 'z';

        while (uppercaseBack >= 'A'){
            System.out.print(uppercaseBack + " ");

            uppercaseBack--;

        }
    }
}
