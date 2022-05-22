package Codeforce.OrderSubmit.TwoThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpyDetected {
	static int[] arr = null;
	static int[] count = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine()), n = 0;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			count = new int[101];
			arr = new int[n];
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				count[arr[i]]++;
			}
			for (int i = 0; i < arr.length; i++) {
				if (count[arr[i]] == 1) {
					sb.append((i+1)+"\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
