package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Good1253 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), l = 0, r = 0, res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = 0, val = 0, sum = 0; i < arr.length; i++) {
			val = arr[i];
			l = 0;
			r = arr.length-1;
			while (l < r) {
				if (l == i || r == i) {
					l += l == i ? 1 : 0;
					r -= r == i ? 1 : 0;
					continue;
				}
				sum = arr[l] + arr[r];
				if (sum == val) {
					res++;
					break;
				}
				else if (sum < val) l++;
				else r--;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
