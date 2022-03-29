package day18_String;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = " last example";
        System.out.println(str.isEmpty());

        str = "";
        System.out.println("s is empty: " + str.isEmpty());


        String s = " ";
        System.out.println(s.isEmpty());

//        if (s.length() == 0) {
//            System.out.println("empty");
//       }

        System.out.println("s is blank: " + s.isBlank());

        String s2 = "         ";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

    }
}
