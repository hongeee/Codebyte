package com.hongeee.codebyte.squarelab;

public class Solution3 {

    public String solution(int[] arr) {
        int sum = arr[0];
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }

                    sb.append(arr[i]).append(",").append(arr[j]);
                }
            }
        }

        return sb.toString();
    }
}
