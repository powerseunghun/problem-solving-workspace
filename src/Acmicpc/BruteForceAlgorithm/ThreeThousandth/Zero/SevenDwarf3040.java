package Acmicpc.BruteForceAlgorithm.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SevenDwarf3040 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dwarf = new int[9];
		boolean[] check = new boolean[9];
		int sum = 0;
		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = Integer.parseInt(br.readLine());
			sum += dwarf[i];
		}
		for (int i = 0; i < dwarf.length-1; i++) {
			for (int j = i+1; j < dwarf.length; j++) {
				if (sum - (dwarf[i] + dwarf[j]) == 100) {
					check[i] = true;
					check[j] = true;
					i = 10;
					break;
				}
			}
		}
		
		for (int i = 0; i < check.length; i++) {
			if (!check[i]) {
				System.out.println(dwarf[i]);
			}
		}
		
	}
}
