package day13_if_statement;

import java.util.concurrent.atomic.AtomicInteger;

public class Drive {

    public static void main(String[] args) {

        AtomicInteger oxygenLevel = new AtomicInteger(90);

        if(oxygenLevel.get() > 90){
            System.out.println("Your tank is full");
        } else if (oxygenLevel.get() > 80){
            System.out.println("Still okay");
        } else if(oxygenLevel.get() > 70){
            System.out.println("Don't go too far");
        } else if(oxygenLevel.get() > 60){
            System.out.println("Start to head back");
        } else if(oxygenLevel.get() > 50){
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("Dangerous");
        }




    }




}














