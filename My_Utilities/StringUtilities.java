package My_Utilities;

public class StringUtilities {
    public static String reverse(String str){
        String revesed = "";
        for (int i = str.length() - 1; i >= 0; i++){
            revesed += str.charAt(i);

        }
        return revesed;


    }
}
