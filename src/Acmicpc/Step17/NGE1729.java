package Acmicpc.Step17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class NGE1729 {
	public static void main(String[] args) {
		// time limit
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> index = new HashMap<>();
		Stack st = new Stack();
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] ngeArr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			ngeArr[i] = -1;
		}
		
		for (int i = 0; i < N; i++) {
			if (st.size() == 0) {
				index.put(arr[i], i);
				st.push(arr[i]);
			}
			else {
				while(arr[i] > (int)(st.get(st.size()-1))) {
					ngeArr[index.get(st.pop())] = arr[i];
					if (st.size() == 0) break;
				}
				st.push(arr[i]);
				index.put(arr[i], i);
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(ngeArr[i] + " ");
		}
	}
}
