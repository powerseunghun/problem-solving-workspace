package Acmicpc.As.B3.ThirtyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Crawling33538 {
	static double[] arr = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		double t = Double.parseDouble(br.readLine());
		boolean flag = false;
		String str = null;
		arr = new double[n];
		arr2 = new double[n];
		
		for (int i = 0; i < Math.min(arr.length, arr2.length); i++) {
			str = br.readLine();
			arr[i] = Double.parseDouble(str.split(" ")[0]);
			arr2[i] = Double.parseDouble(str.split(" ")[1]);
		}
		
		for (int i = 0; i < n; i++) {
			if (l/arr[i]+l/arr2[i]<t) {
				flag = true;
			}
		}
		
		System.out.println(flag ? "HOPE" : "DOOMED");
		br.close();
	}
}
