package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza26566 {
	static int[] arr = null;
	static final int l = 4;
	static String func() {
		return arr[0]*arr[3] > Math.acos(-1)*Math.pow(arr[2], 2)*arr[1] 
				? "Slice of pizza" : "Whole pizza";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String str = null;
		
		while(n-- > 0) {
			arr = new int[l];
			str = br.readLine() + " ";
			str += br.readLine();
			for (int i = 0; i < str.split(" ").length; i++) {
				arr[i] = Integer.parseInt(str.split(" ")[i]);
			}
			sb.append(func()).append(n > 0 ? "\n" : "");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
