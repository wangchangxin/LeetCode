package com.wcx.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2015-03-03
 *
 * https://oj.leetcode.com/problems/two-sum/
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 *
 * Output: index1=1, index2=2
 */

public class TwoSum {


    public int[] solution(int[] numbers, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            
            int current = numbers[i];

            if (null == map.get(current)) {
                
                map.put(target - current, i);
                
            } else {
                
                result[0] = Math.min(i, map.get(current)) + 1;
                result[1] = Math.max(i, map.get(current)) + 1;
            }

        }


        return result;
    }

    public static void main(String[] args) {
        
        int[] numbers = {2, 4, 7, 11, 15};
        int[] result = new TwoSum().solution(numbers, 9);

        System.out.println(Arrays.toString(result));
    }


}
