package day34_Methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
        // string msg = say Hello(); this is not work bc the method is void
        sayBye();

        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);

    }

    public static void sayHello(){
        System.out.println("Hello");

    }

    public static String sayBye(){
        return "Bye";


    }







}
