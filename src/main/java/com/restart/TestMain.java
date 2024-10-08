package com.restart;

import java.util.Stack;

public class TestMain {

	// implements the thread.sleep

	/*
	 * Characters such as "(", ")", "[", "]", "{", and "}" are considered brackets.
	 * 
	 * A collection of parentheses is considered to be a matched pair if the opening
	 * bracket occurs to the left of the corresponding closing bracket respectively.
	 * 
	 * Eg: -
	 * 
	 * Balanced ()[{}] , {([])}
	 * 
	 * Not Balanced ([{}] , ){}
	 * 
	 * using java8
	 */
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();

		for (char ch : expression.toCharArray()) {

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {

				if (stack.isEmpty()) {
					return false;
				}

				char lastOpenBracket = stack.pop();

				if (!isMatchingPair(lastOpenBracket, ch)) {
					return false;
				}

			}

		}

		return stack.isEmpty();
	}

	private static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');

	}

	public static void main(String[] args) throws InterruptedException {

		String exp1 = "()[{}]";
		String exp2 = "([{}]";
		System.out.println(isBalanced(exp1) ? "Balanced" : "not balanced");
		System.out.println(isBalanced(exp2) ? "Balanced" : "not balanced");

	}

}

//id,first_name,last_name,email,created
//1,Javid,Ahammmed,javid@gmail.com,2020-12-31
//2,javid,,javid@gmail.com,2021-02-24
//3,Prakash,,prakash@gmail.com,2021-02-24
//4,Caroline,Freds,caroline@yahoo.com,2021-03-14
//
//find the duplicate emails
//
//find the number of occurence using SQL


//SELECT email,COUNT(*) occurence_count FROM EmpTable GOUP BY email HAVING COUNT(*)>1;












