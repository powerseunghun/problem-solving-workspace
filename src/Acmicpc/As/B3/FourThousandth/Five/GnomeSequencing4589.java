package Acmicpc.As.B3.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class GnomeSequencing4589 {
	static int[] arr1 = new int[3];
	static Integer[] arr2 = new Integer[3];
	static boolean cmp() {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) return false;
		}
		return true;
	}
	static boolean check() {
		for (int i = 0; i < 2; i++) {
			if (i == 0) Arrays.sort(arr2);
			else Arrays.sort(arr2, Collections.reverseOrder());
			
			if (cmp()) return true;
		}
		return false;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("Gnomes:\n");
		int T = Integer.parseInt(br.readLine()), val = 0;
		StringTokenizer st = null;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr1.length; i++) {
				val = Integer.parseInt(st.nextToken());
				arr1[i] = val;
				arr2[i] = val;
			}
			sb.append(check() ? "Ordered\n" : "Unordered\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
