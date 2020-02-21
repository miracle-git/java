package com.miracle.ds.algorithm;

import com.miracle.ds.data.ArrayStack;

public class ArrayStackAlgorithm {

    // 判断字符串中是否包含有效的括号对(即{,[,(有对应的匹配),],})
    public static boolean isValidParentheses(String str) {
        ArrayStack<Character> stack = new ArrayStack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c == '}' && stack.pop() != '{') return false;
                if (c == ']' && stack.pop() != '[') return false;
                if (c == ')' && stack.pop() != '(') return false;
            }
        }

        return stack.isEmpty();
    }
}