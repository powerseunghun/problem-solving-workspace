package Acmicpc.As.S5.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class TallestMan11292 {
	static String[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), tSb = null;;
		int T = 0;
		String str = null;
		double max = 0;
		
		while(true) {
			T = Integer.parseInt(br.readLine());
			if (T == 0) break;
			
			max = Double.MIN_VALUE;
			arr = new String[T];
			for (int i = 0; i < T; i++) {
				arr[i] = br.readLine();
				max = Math.max(max, Double.parseDouble(arr[i].split(" ")[1]));
			}
			tSb = new StringBuilder();
			for (String el : arr) {
				if (Double.parseDouble(el.split(" ")[1]) == max) {
					tSb.append(tSb.toString().equals("") ? el.split(" ")[0] : " " + el.split(" ")[0]);
				}
			}
			sb.append(tSb.toString()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
