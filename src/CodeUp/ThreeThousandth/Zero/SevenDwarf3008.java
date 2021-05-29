package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SevenDwarf3008 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] dwarfs = new int[9];
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < dwarfs.length; i++) {
			dwarfs[i] = Integer.parseInt(br.readLine());
			sum += dwarfs[i];
		}
		
		for (int i = 0; i < dwarfs.length; i++) {
			for (int j = 0; j < dwarfs.length; j++) {
				if (i != j && sum - (dwarfs[i] + dwarfs[j]) == 100) {
					map.put(dwarfs[i], i);
					map.put(dwarfs[j], j);
					i = 20;
					break;
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
