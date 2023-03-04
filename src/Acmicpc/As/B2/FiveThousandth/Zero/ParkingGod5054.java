package Acmicpc.As.B2.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ParkingGod5054 {
	static Integer[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, res = 0;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			res = 0;
			n = Integer.parseInt(br.readLine());
			arr = new Integer[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			for (int i = 0; i < arr.length; i++) {
				res += i == 0 ? arr[arr.length-1]-arr[0] : arr[i]-arr[i-1];
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
