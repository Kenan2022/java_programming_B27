package day18_String;
public class Contains {
    public static void main(String[] args) {

        String day ="Today it is above 70 ";
        System.out.println(day.contains("it is")); // true


        System.out.println(day.contains("itis")); // false

        System.out.println(day.contains("ay is")); // true

        System.out.println(day.contains("7")); // true

        System.out.println(day.contains("today")); // false because we had Today with uppercase T

        System.out.println(day.contains("Ti7"));




    }
}
