package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RemoveSmallest {
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine()), n = 0;
		boolean flag = true;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			st = new StringTokenizer(br.readLine());
			flag = true;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] - arr[i-1] > 1) {
					flag = false;
					sb.append("NO\n");
				}
			}
			if (flag) sb.append("YES\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
