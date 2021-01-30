package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class SurplusSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m;
		ArrayList<Integer> list = new ArrayList<>();
		boolean flag = true;
		
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		m = sc.nextInt();
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int diff = list.get(i) >= list.get(j) ? list.get(i) - list.get(j) : list.get(j) - list.get(i);
				if (diff % m == 0) {
					flag = false;
					break;
				}
			}
		}
		if (flag) System.out.println("yes");
		else System.out.println("no");
	}
}
