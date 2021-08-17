package Acmicpc.Sorting.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class EatOrEaten7795 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), aIdx = 0, bIdx = 0, sum = 0;
		Integer[] arrA = null, arrB = null;
		
		for (int i = 0, a = 0, b = 0; i < T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arrA = new Integer[a];
			arrB = new Integer[b];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arrA.length; j++) {
				arrA[j] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arrB.length; j++) {
				arrB[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arrA, Collections.reverseOrder());
			Arrays.sort(arrB, Collections.reverseOrder());
			aIdx = 0;
			bIdx = 0;
			sum = 0;
			while (aIdx < arrA.length && bIdx < arrB.length) {
				if (arrA[aIdx] > arrB[bIdx]) {
					sum += arrB.length-bIdx;
					aIdx++;
				}
				else bIdx++;
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());
	}
}
