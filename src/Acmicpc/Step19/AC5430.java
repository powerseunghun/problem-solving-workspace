package Acmicpc.Step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class AC5430 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		boolean isReverse = false, isError = false;
		Deque<Integer> q = new LinkedList<>();
		ArrayList<Integer> printList = new ArrayList<>();
		
		int T = Integer.parseInt(br.readLine());
		Object val = null;
		for (int i = 0; i < T; i++) {
			q.clear();
			printList.clear();
			isReverse = false;
			isError = false;
			
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine().replace("[", "").replace("]", ""), ",");
			
			while (st.hasMoreTokens()) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			for (int j = 0; j < p.length(); j++) {
				switch(p.charAt(j)) {
				case 'R':
					isReverse = !isReverse;
					break;
				case 'D':
					val = isReverse ? q.pollLast() : q.pollFirst();
					if (val == null) {
						isError = true;
						break;
					}
					break;
				}
			}
			if (isError) System.out.println("error");
			else {
				while (!q.isEmpty()) {
					printList.add(isReverse ? q.pollLast() : q.pollFirst());
				}
				System.out.println(printList.toString().replace(" ", ""));
			}
		}
	}
}
