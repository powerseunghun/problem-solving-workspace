package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ConwaySequence {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		
		int n = new Scanner(System.in).nextInt(), index = 0;
		for (int i = 0; i < n - 2; i++) {
			index = list.get(list.size() - 1);
			list.add(list.get(index - 1) + list.get(list.size() - index));
		}
		
		System.out.println(list.get(n-1));
	}
}
