package day23_forloop;

public class CountLetter {
    public static void main(String[] args) {
        String word = "aabbcaa";

        int count = 0;

        for(int i = 0; i < word.length(); i++){

            if (word.charAt(i) == 'b'){
                count++;
            }
        }

        System.out.println(count);





    }
}
