package Acmicpc.OrderSubmit.Thousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinMoneyManagement6236 {
	static int[] arr = null;
	static int binarySearch(int l, int r, int M) {
		while (l <= r) {
			int m = (l+r) / 2;
			int cnt = 1, tmpMoney = m;
			for (int i = 0; i < arr.length; i++) {
				if (tmpMoney < arr[i]) {
					tmpMoney = m;
					cnt++;
				}
				tmpMoney -= arr[i];
			}
			if (cnt > M) l = m+1;
			else r = m-1;
		}
		return l;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]);
		int max = 0, sum = 0;
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			max = Math.max(max, arr[i]);
		}
		
		System.out.println(binarySearch(max, sum, M));
		br.close();
	}
}
