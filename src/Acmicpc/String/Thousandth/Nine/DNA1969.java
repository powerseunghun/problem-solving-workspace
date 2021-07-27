package Acmicpc.String.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class DNA1969 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]), max = 0, maxIdx = 0;
		int minDist = 0;
		int[] alphaCount = new int[26];
		String[] dna = new String[N];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < dna.length; i++) {
			dna[i] = br.readLine();
		}
		
		for (int i = 0; i < M; i++) {
			Arrays.fill(alphaCount, 0);
			max = 0;
			for (int j = 0; j < dna.length; j++) {
				alphaCount[dna[j].charAt(i)-65]++;
				max = Math.max(alphaCount[dna[j].charAt(i)-65], max);
			}
			for (int j = 0; j < alphaCount.length; j++) {
				if (alphaCount[j] == max) {
					sb.append((char)(j+'A'));
					maxIdx = j;
					break;
				}
			}
			for (int j = 0; j < alphaCount.length; j++) {
				if (j != maxIdx && alphaCount[j] != 0) minDist += alphaCount[j]; 
			}
		}
		System.out.println(sb.toString());
		System.out.println(minDist);
	}
}
