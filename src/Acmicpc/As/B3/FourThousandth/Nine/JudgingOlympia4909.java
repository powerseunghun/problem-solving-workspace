package Acmicpc.As.B3.FourThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

// qt
public class JudgingOlympia4909 {
	static double[] arr = new double[6];
	static boolean checkArr() {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += arr[i] == 0 ? 1 : 0;
		}
		return count == arr.length;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		double sum = 0;
		
		while (true) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}
			if (checkArr()) break;
			Arrays.sort(arr);
			
			for (int i = 1; i < arr.length-1; i++) {
				sum += arr[i];
			}
			sum /= (arr.length-2);
			
			sb.append(new BigDecimal(sum).stripTrailingZeros() + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
