package com.example;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,3,3,4,5};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums){
        Set<Integer> numsSet = new TreeSet<>();
        for(int i = 0; i < nums.length; ++i){
            numsSet.add(nums[i]);
        }
        Object[] numsNoDuplicates = numsSet.toArray();
        for(int i = 0; i < numsNoDuplicates.length; ++i){
            nums[i] = (int)numsNoDuplicates[i];
        }
        return numsSet.size();
    }
}
