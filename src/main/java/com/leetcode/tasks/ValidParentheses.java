package com.leetcode.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("[])"));
    }

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketMap = getBracketMap();
        for (Character character : s.toCharArray()) {
            if (bracketMap.containsValue(character)) {
                if (brackets.isEmpty() || !Objects.equals(brackets.pop(), character)) {
                    return false;
                }
            } else {
                brackets.push(bracketMap.get(character));
            }
        }
        return brackets.isEmpty();
    }

    private Map<Character, Character> getBracketMap() {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        bracketMap.put('(', ')');
        return bracketMap;
    }

}
