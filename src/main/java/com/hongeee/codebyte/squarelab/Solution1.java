package com.hongeee.codebyte.squarelab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {

    public String solution(String sen) {
        String regex = "[a-zA-Z0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sen);
        String longest = null;

        while (matcher.find()) {
            String match = matcher.group();

            if (longest == null || longest.length() < match.length()) {
                longest = match;
            }
        }

        return longest;
    }
}
