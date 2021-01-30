package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DivisorOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> list = new HashSet<>();
		List sortList = null;
		int a = sc.nextInt(), b = sc.nextInt();
		
		for (int i = 1; i <= Math.sqrt(b); i++) {
			if (a % i == 0) {
				if (i == Math.sqrt(a)) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(a / i);
				}
			}
			if (b % i == 0) {
				if (i == Math.sqrt(b)) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(b / i);
				}
			}
		}
		sortList = new ArrayList(list);
		Collections.sort(sortList);
		
		for (int i = 0; i < sortList.size(); i++) {
			System.out.print(sortList.get(i) + " ");
		}
	}
}
