package com.hongeee.codebyte.squarelab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    public void solution() {
        Solution1 solution = new Solution1();
        assertEquals("time", solution.solution("fun&!! time"));
        assertEquals("a12345", solution.solution("fun&!! time a12345"));
    }
}