package com.hongeee.codebyte.squarelab;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public String solution(String str) {
        String[] words = str.split(" ");
        int maxRepeated = -1;
        String greatestStr = null;

        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            char[] charArr = word.toCharArray();
            int max = -1;

            for (char current : charArr) {
                if (!map.containsKey(current)) {
                    map.put(current, 0);
                } else {
                    map.put(current, map.get(current) + 1);
                }

                if (max < map.get(current)) {
                    max = map.get(current);
                }
            }

            if (maxRepeated < max) {
                maxRepeated = max;
                greatestStr = word;
            }
        }

        return maxRepeated == 0 ? "-1" : greatestStr;
    }
}
