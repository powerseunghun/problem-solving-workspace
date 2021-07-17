package Acmicpc.Step18;

import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;

public class Zero10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack<>();
		int K = sc.nextInt(), item = 0, sum = 0;
		
		for (int i = 0; i < K; i++) {
			item = sc.nextInt();
			if (item == 0) {
				st.pop();
				continue;
			}
			st.push(item);
		}
		
		Iterator it = st.iterator();
		while(it.hasNext()) {
			sum += (int) st.pop();
		}
		System.out.println(sum);
	}
}
