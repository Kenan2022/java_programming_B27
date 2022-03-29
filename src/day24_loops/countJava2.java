package day24_loops;

public class countJava2 {
    public static void main(String[] args) {
        String str = "Java is a java language. java";
        int count = 0;

        while (str.contains("java")){
            System.out.println(str);
            str = str.replaceFirst("java", "*");
            System.out.println(str);
            count++;
        }

        System.out.println(count);
        System.out.println(str);

    }
}
