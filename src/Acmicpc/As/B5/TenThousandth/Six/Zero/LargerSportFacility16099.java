package Acmicpc.As.B5.TenThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargerSportFacility16099 {
	static long[] arr = new long[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			for (int i = 0, idx = 0; i < arr.length*2; i+=2, idx++) {
				arr[idx] = Long.parseLong(tmp.split(" ")[i]);
				arr[idx] *= Long.parseLong(tmp.split(" ")[i+1]);
			}
			
			sb.append(arr[0] > arr[1] ? "TelecomParisTech" : arr[0] == arr[1] ? "Tie" : "Eurecom");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
