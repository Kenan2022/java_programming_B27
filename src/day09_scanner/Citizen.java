package day09_scanner;

public class Citizen {
    /*
        create and assign these variables:

            name
            are they citizen
            do have criminal background
            age

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

     */
    public static void main(String[] args) {
        String name = " Kuzey Emin;";
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        int age = 49;

        boolean isEligibleTOVote = age >= 18 && isCitizen == true && !hasCriminalBackground;

        System.out.println(name + " is eligible to vote: " + isEligibleTOVote);
    }


}
