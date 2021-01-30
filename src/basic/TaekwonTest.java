package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaekwonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] fs = new int[10];
		Set<Integer> memory = new HashSet<>();
		
		int count = 0;
		for (int i = 0; i < fs.length; i++) {
			fs[i] = sc.nextInt();
		}
		
		for (int i = 0; i < fs.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				memory.add(fs[j]);
				if (memory.size() == 2) break;
			}
			if (memory.contains(fs[i])) count++;
			memory.clear();
		}
		System.out.println(count);
		
	}
}
