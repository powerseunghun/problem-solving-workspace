package Acmicpc.As.B4.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITPassportExamination11257 {
	static double[] base = { 35*0.3, 25*0.3, 40*0.3 };
	static double[] arr = new double[3];
	static int sum = 0;
	static boolean check() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < base[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			sb.append(tmp.split(" ")[0] + " ");
			
			sum = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Double.parseDouble(tmp.split(" ")[j+1]);
				sum += arr[j];
			}
			sb.append(sum + " " + (check() && (sum >= 55) ? "PASS\n" : "FAIL\n"));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
