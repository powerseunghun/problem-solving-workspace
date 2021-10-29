package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayMerge {
	static void mergeTwoArray(int[] A, int[] B, int[] C) {
		int aIdx = 0, bIdx = 0, cIdx = 0;
		while (aIdx < A.length && bIdx < B.length) {
			if (A[aIdx] < B[bIdx]) {
				C[cIdx] = A[aIdx];
				aIdx++;
				cIdx++;
			}
			else {
				C[cIdx] = B[bIdx];
				bIdx++;
				cIdx++;
			}
		}
		while (aIdx < A.length) {
			C[cIdx] = A[aIdx];
			aIdx++;
			cIdx++;
		}
		while (bIdx < B.length) {
			C[cIdx] = B[bIdx];
			bIdx++;
			cIdx++;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int s1 = Integer.parseInt(tmp.split(" ")[0]);
		int s2 = Integer.parseInt(tmp.split(" ")[1]);
		int[] A = new int[s1], B = new int[s2], C = new int[s1+s2];
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < (i == 0 ? A.length : B.length); j++) {
				switch(i) {
				case 0:
					A[j] = Integer.parseInt(st.nextToken());
					break;
				case 1:
					B[j] = Integer.parseInt(st.nextToken());
					break;
				}
			}
		}
		mergeTwoArray(A, B, C);
		
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
	}
}
