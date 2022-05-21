package Codeforce.OrderSubmit.TwoThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpyDetected {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine()), n = 0;
		boolean flag = true;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			flag = false;
			arr = new int[n+1];
			st = new StringTokenizer(br.readLine());
			
			for (int i = 1; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if (i == 1) continue;
				
				if (arr[i-1] != arr[i]) {
					flag = true;
					sb.append(i+"\n");
					break;
				}
			}
			if (!flag) sb.append("1\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
