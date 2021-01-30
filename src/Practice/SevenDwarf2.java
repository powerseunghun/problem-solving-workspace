package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SevenDwarf2 {
	public static void main(String[] args) {
		int[] dwarfs = new int[9];
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < dwarfs.length; i++) {
			dwarfs[i] = sc.nextInt();
			sum += dwarfs[i];
		}
		
		for (int i = 0; i < dwarfs.length; i++) {
			for (int j = 0; j < dwarfs.length; j++) {
				if (i != j) {
					if (sum - (dwarfs[i] + dwarfs[j]) == 100) {
						map.put(dwarfs[i], i);
						map.put(dwarfs[j], j);
						i = 20;
						break;
					}
				}
			}
		}
		Arrays.sort(dwarfs);
		for (int i = 0; i < dwarfs.length; i++) {
			if (map.containsKey(dwarfs[i])) continue;
			else System.out.println(dwarfs[i]);
		}
	}
}
