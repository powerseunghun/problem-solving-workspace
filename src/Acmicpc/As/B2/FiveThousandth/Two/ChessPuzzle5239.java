package Acmicpc.As.B2.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChessPuzzle5239 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		boolean flag = true;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			arr1 = new int[n];
			arr2 = new int[n];
			for (int i = 0, idx = 0; i < Math.min(arr1.length, arr2.length); i++, idx+=2) {
				arr1[i] = Integer.parseInt(str.split(" ")[idx+1]);
				arr2[i] = Integer.parseInt(str.split(" ")[idx+2]);
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			flag = true;
			for (int i = 1; i < Math.min(arr1.length, arr2.length) && flag; i++) {
				if (arr1[i] == arr1[i-1] || arr2[i] == arr2[i-1]) {
					flag = false;
				}
			}
			sb.append(flag ? "SAFE" : "NOT SAFE").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
