package day23_forloop;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaaahiahhihhibbbcch";
        int count = 0;

        for (int index = 0; index < str.length(); index++){
            if (str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++;

            }
        }

        System.out.println(count);

    }
}
