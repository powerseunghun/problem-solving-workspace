package Acmicpc.As.B2.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpAndDown6795 {
	static int[] arr = new int[5];
	static int[] res = new int[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int t1 = 0, l1 = 0, t2 = 0, l2 = 0;
		boolean flag = true;
		
		for (int i = 0, t = 0, w = 0; i < res.length; i++, t = 0) {
			flag = true;
			w = i == 0 ? 0 : 2;
			while (t < arr[4]) {
				if (flag) {
					t += arr[w];
					res[i] += arr[w];
				}
				else {
					t += arr[w+1];
					res[i] -= arr[w+1];
				}
				flag = !flag;
			}
			res[i] -= Math.abs(t-arr[4]);
		}
		System.out.println(res[0] + " " + res[1]);
		
		System.out.println(res[0] == res[1] ? "Tied" : res[0] > res[1] ? "Nikky" : "Byron");
		br.close();
	}
}
