package com.leetcode.tasks;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void shouldReturnTrueWhenDoubleBrackets() {
        ValidParentheses validParentheses = new ValidParentheses();

        Assert.assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void shouldReturnFalseWhenDifferentBrackets() {
        ValidParentheses validParentheses = new ValidParentheses();

        Assert.assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void shouldReturnTrueWhenALotOfBrackets() {
        ValidParentheses validParentheses = new ValidParentheses();

        Assert.assertTrue(validParentheses.isValid("()[]{}"));
    }

}