package com.hongeee.codebyte.squarelab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    @Test
    public void solution() {
        Solution3 solution = new Solution3();
        assertEquals("5,2 -4,11", solution.solution(new int[] { 7, 3, 5, 2, -4, 8, 11 }));
        assertEquals("6,11 10,7 15,2", solution.solution(new int[]{17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}));
    }
}