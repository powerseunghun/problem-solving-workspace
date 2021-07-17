package Acmicpc.Step18;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackSequence1874 {
	// optimization x.. time limit 2000ms
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> pops = new ArrayList<>();
		int n = sc.nextInt(), num = 1;
		int[] seq = new int[n + 1];
		boolean flag = true;
		
		for (int i = 1; i <= n; i++) {
			seq[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			if (st.size() == 0) {
				st.push(num++);
				sb.append("+\n");
			}
			// find seq[i]
			while((int)st.get(st.size() - 1) != seq[i]) {
				st.push(num++);
				sb.append("+\n");
				if (n+2 <= num) {
					flag = false;
					break;
				}
			}
			if ((int)(st.get(st.size()-1)) == seq[i]) {
				pops.add((int)st.pop());
				sb.append("-\n");
			}
		}
		if (flag) {
			System.out.println(sb);
		}
		else {
			System.out.println("NO");
		}
	}
}
