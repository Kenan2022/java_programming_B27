package day18_String;

public class RemoveSpace {
    public static void main(String[] args) {

        String s = "    Saturday      ";
        System.out.println(s);
        System.out.println(s.length());

        s.trim();

        System.out.println(s);
        System.out.println(s.length());

        String str = "   java is fun   ";
        System.out.println(str.startsWith("java"));
        str = str.trim();
        System.out.println(str.startsWith("java"));




    }
}
