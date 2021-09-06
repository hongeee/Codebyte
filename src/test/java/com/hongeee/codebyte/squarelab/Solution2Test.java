package com.hongeee.codebyte.squarelab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    public void solution() {
        Solution2 solution = new Solution2();
        assertEquals("Hello", solution.solution("Hello apple pie"));
        assertEquals("-1", solution.solution("No words"));
    }
}