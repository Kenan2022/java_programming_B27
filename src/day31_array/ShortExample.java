package day31_array;

import java.util.Arrays;

public class ShortExample {
    public static void main(String[] args) {

        int [] nums = {3,6,2,68,32,-2,24};
        int [] notSorted = nums;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        // Q; max and mini from array
        System.out.println("min: " + nums[0]);
        System.out.println("mex: " + nums[nums.length - 1]);




    }



}
