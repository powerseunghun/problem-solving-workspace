package Acmicpc.Step18;

import java.util.Scanner;
import java.util.Stack;

public class BallanceWorld4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		String str = "", tmp = "";
		boolean flag = true;
		int pCount = 0;
		
		while(true) {
			str = sc.nextLine();
			if(str.equals(".")) break;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[') {
					pCount++;
					st.push(str.charAt(i));
				}
				else if (str.charAt(i) == ')' || str.charAt(i) == ']') {
					pCount++;
					switch(str.charAt(i)) {
					case ')':
						if (st.size() == 0) {
							flag = false;
							break;
						}
						else {
							tmp = st.pop() + "";
							if (!tmp.equals("(")) {
								flag = false;
								break;
							}
						}
						break;
					case ']':
						if (st.size() == 0) {
							flag = false;
							break;
						}
						else {
							tmp = st.pop() + "";
							if (!tmp.equals("[")) {
								flag = false;
								break;
							}
						}
						break;
					}
				}
			}
			if (pCount == 0 || (flag && st.size() == 0)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			flag = true;
			pCount = 0;
			st.clear();
		}
	}
}
