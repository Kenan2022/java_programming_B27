package day15_switch_statment;

public class Switchcase {
    private static int n;

    public static void main(String[] args) {
        switch (n) {
            case 1: //  in if statement: if(n == 1){
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number from switch");

        }




    }
}
