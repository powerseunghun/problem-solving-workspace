package Programmers.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class MaxMathematicalExpression {
	// idx = 0 -> +, 1 -> -, 2 -> *
	static int[][] opPriority = {{0, 1, 2},{0, 2, 1},{1, 0, 2},{1, 2, 0},{2, 0, 1},{2, 1, 0}};
	static List<String> postFixs = new ArrayList<>();
	static Map<Character, Integer> map = new HashMap<>();
	static void priorityInit(int idx) {
		map.clear();
		map.put('+', opPriority[idx][0]);
		map.put('-', opPriority[idx][1]);
		map.put('*', opPriority[idx][2]);
	}
	static void changePostfix(String expression, int idx) {
		String tmp = "", postfix = "";
		Stack<String> st = new Stack<>();
		
		priorityInit(idx);
		
		for (int i = 0, val = 0; i < expression.length(); i++) {
			switch(expression.charAt(i)) {
			case '+': case '-': case '*':
				val = Integer.parseInt(tmp);
				postfix += val + " ";
				tmp = "";
				if (st.isEmpty()) {
					st.push(expression.charAt(i)+"");
				}
				else {
					while (!st.isEmpty() && map.get(st.peek().charAt(0)) >= map.get(expression.charAt(i))) {
						postfix += st.pop() + " ";
					}
					st.push(expression.charAt(i)+"");
				}
				break;
			default:
				tmp += expression.charAt(i);
				break;
			}
		}
		postfix += tmp + " ";
		
		while (!st.isEmpty()) {
			postfix += st.pop() + " ";
		}
		postFixs.add(postfix);
	}
	static long calcPostfix(String expression) {
		Stack<String> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(expression);
		String str = null;
		
		long val1 = 0, val2 = 0;
		
		while (st.hasMoreTokens()) {
			str = st.nextToken();
			switch(str) {
			case "+": case "-": case "*":
				val1 = Long.parseLong(stack.pop());
				val2 = Long.parseLong(stack.pop());
				if (str.equals("+")) stack.push((val1+val2)+"");
				else if (str.equals("-")) stack.push((val2 - val1)+"");
				else stack.push((val1*val2)+"");
				break;
			default:
				stack.push(str);
				break;
			}
		}
		
		return Math.abs(Long.parseLong(stack.pop()));
	}
	static long solution(String expression) {
        long answer = 0;
        
        postFixs.clear();
        for (int i = 0; i < opPriority.length; i++) {
        	changePostfix(expression, i);
        }
        
        for (int i = 0; i < postFixs.size(); i++) {
        	answer = Math.max(answer, calcPostfix(postFixs.get(i)));
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("100-200*300-500+20"));
		System.out.println(solution("50*6-3*2"));
	}
}
