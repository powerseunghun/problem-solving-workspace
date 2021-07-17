package Acmicpc.Step18;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class FindVPS9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), lpCount = 0, rpCount = 0;
		sc.nextLine();
		Stack st = new Stack();
		String str = "";
		Iterator it = null;
		boolean flag = true;
		
		for (int i = 0; i < T; i++) {
			str = sc.nextLine();
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					st.push(str.charAt(j));
				}
				else if (str.charAt(j) == ')'){
					if (st.size() == 0) {
						flag = false;
						break;
					}
					else {
						st.pop();
					}
				}
			}
			if (flag && st.size() == 0) System.out.println("YES");
			else System.out.println("NO");
			flag = true;
			st.clear();
		}
	}
}
