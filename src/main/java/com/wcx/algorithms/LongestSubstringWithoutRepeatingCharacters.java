package com.wcx.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p/>
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * <p/>
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Long> counterMap = new HashMap<Character, Long>();

        char[] characters = s.toCharArray();

        for (char c : characters) {
            if (counterMap.containsKey(c)) {
                counterMap.put(c, counterMap.get(c) + 1);
            } else {
                counterMap.put(c, 0L);
            }

        }

        return counterMap.size();

    }

    public static void main(String[] args) {

        int len = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb");

        System.out.println("the len: " + len);
    }
}
