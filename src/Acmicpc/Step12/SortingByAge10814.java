package Acmicpc.Step12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingByAge10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Map<String, Integer> order = new HashMap<>();
		int N = sc.nextInt();
		String[][] member = new String[N][2];
		
		for (int i = 0; i < N; i++) {
			member[i][0] = sc.next();
			member[i][1] = sc.next();
//			order.put(member[i][1], i);
		}
		
		Arrays.sort(member, new Comparator<String []>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for (int i = 0; i < member.length; i++) {
			for (int j = 0; j < member[i].length; j++) {
				System.out.print(member[i][j] + " ");
			}
			System.out.println();
		}
	}
}
