package Acmicpc.As.B2.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackedFloatingMountains5238 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		boolean flag = true;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			arr = new int[n];
			for (int i = 1; i < arr.length+1; i++) {
				arr[i-1] = Integer.parseInt(str.split(" ")[i]);
			}
			flag = true;
			for (int i = 2; i < arr.length; i++) {
				if (arr[i] != arr[i-1]+arr[i-2]) {
					flag = false;
					break;
				}
			}
			sb.append(flag ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
