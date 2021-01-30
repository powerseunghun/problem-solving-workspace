package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementalList {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int key = n;
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			if ((int) (key / n) > 1) break;
			else {
				list.add(key++);
			}
		}
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			}
			else {
				System.out.print(list.get(i) + ", ");
			}
		}
		System.out.print("}");
	}
}
