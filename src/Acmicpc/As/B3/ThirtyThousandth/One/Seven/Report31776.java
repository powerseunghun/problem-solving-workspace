package Acmicpc.As.B3.ThirtyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Report31776 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0, N = Integer.parseInt(br.readLine()), v = 0, t = 0;
		StringTokenizer st = null;
		boolean flag = false;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			arr = new int[3];
			flag = false;
			t = -1;
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if (arr[i] != -1) {
					flag = true;
					continue;
				}
				arr[i] = Integer.MAX_VALUE;
			}
			res = flag && arr[0] <= arr[1] && arr[1] <= arr[2] ? res+1 : res;
		}
		
		System.out.print(res);
		br.close();
	}
}
