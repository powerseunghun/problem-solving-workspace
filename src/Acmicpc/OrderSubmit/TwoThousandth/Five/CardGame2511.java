package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGame2511 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] A = new int[10], B = new int[10];
		int sumA = 0, sumB = 0;
		char lastWin = ' ';
		StringTokenizer st = null;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			
			if (i == 0) {
				for (int j = 0; j < A.length; j++) {
					A[j] = Integer.parseInt(st.nextToken());
				}
			}
			else {
				for (int j = 0; j < B.length; j++) {
					B[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] > B[i]) {
				sumA += 3;
				lastWin = 'A';
			}
			else if (A[i] < B[i]) {
				sumB += 3;
				lastWin = 'B';
			}
			else {
				sumA++;
				sumB++;
			}
		}
		System.out.println(sumA + " " + sumB);
		if (sumA > sumB) {
			System.out.println("A");
		}
		else if (sumA < sumB) {
			System.out.println("B");
		}
		else {
			System.out.println(lastWin == ' ' ? "D" : lastWin == 'A' ? "A" : "B");
		}
		br.close();
	}
}