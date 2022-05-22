package Acmicpc.As.B4.TwentyThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Affischutskicket24183 {
	static double[] arr1 = {229, 297, 210};
	static double[] arr2 = {324, 420, 297};
	static int[] arr3 = {2, 2, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int val = 0;
		double sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			val = Integer.parseInt(st.nextToken());
			sum += arr1[i] * arr2[i] * val * arr3[i];
		}
		
		System.out.printf("%.6f\n", sum/Math.pow(10, 6));
		br.close();
	}
}
