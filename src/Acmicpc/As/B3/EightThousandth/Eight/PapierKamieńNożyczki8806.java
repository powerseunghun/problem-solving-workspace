package Acmicpc.As.B3.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PapierKamieńNożyczki8806 {
	static double[] arr1 = null;
	static double[] arr2 = null;
	static String func() {
		double res1 = 0, res2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			res1 += arr1[i] * arr2[(i+1)%arr1.length];
		}
		for (int i = 0; i < arr2.length; i++) {
			res2 += arr2[i] * arr1[(i+1)%arr2.length];
		}
		if (res1 == res2) return "=";
		else if (res1 > res2) return "ADAM";
		else return "GOSIA";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int z = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		while (z-- > 0) {
			arr1 = new double[3];
			arr2 = new double[3];
			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < (i==0 ? arr1.length : arr2.length); j++) {
					if (i == 0) arr1[j] = Double.parseDouble(st.nextToken());
					else arr2[j] = Double.parseDouble(st.nextToken());
				}
			}
			sb.append(func() + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
