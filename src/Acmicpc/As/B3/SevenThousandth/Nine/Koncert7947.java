package Acmicpc.As.B3.SevenThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koncert7947 {
	static final int count = 10;
	static double[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int z = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while (z-- > 0) {
			arr = new double[3];
			for (int i = 0; i < count; i++) {
				tmp = br.readLine();
				for (int j = 0; j < arr.length; j++) {
					arr[j] += Double.parseDouble(tmp.split(" ")[j]);
				}
			}
			sb.append(Math.round(arr[0]/count) + " " + Math.round(arr[1]/count) + " " + Math.round(arr[2]/count) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
