package day30_palindrome;

import java.beans.beancontext.BeanContextChild;
import java.io.FilterOutputStream;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday,friday,saturday,sunday";
        String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        for (String day :days){
            System.out.println(day);
        }


        String [] withOutDay = s.split("day");

        for (String each: withOutDay){
            System.out.println(each);
        }

        System.out.println();
        String str = "jen-feb-mar-apr-may-jun-jul-aug-sep-oct-now-dec";
        String [] month = str.split("-");

        for (String each: month);
        System.out.println(month);

    }
}
