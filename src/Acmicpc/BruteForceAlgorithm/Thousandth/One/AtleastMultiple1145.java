package Acmicpc.BruteForceAlgorithm.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AtleastMultiple1145 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1, count = 0;; i++, count = 0) {
			for (int j = 0; j < arr.length; j++) {
				if (i % arr[j] == 0) count++;
			}
			if (count >= 3) {
				System.out.println(i);
				return;
			}
		}
	}
}
