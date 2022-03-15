package Acmicpc.OrderSubmit.Thousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinMoneyManagement6236 {
	static int[] arr = null;
	static boolean check(int m, int limit) {
		int cnt = 0, tmpMoney = 0;
		for (int i = 0; i < arr.length; i++) {
			if (m < arr[i]) return true;
			if (tmpMoney < arr[i]) {
				tmpMoney = m;
				cnt++;
				if (cnt > limit) {
					return true;
				}
			}
			tmpMoney -= arr[i];
		}
		return false;
	}
	static int binarySearch(int l, int r, int M) {
		while (l <= r) {
			int m = (l+r) / 2;// count = 0, tmpMoney = 0;
//			boolean flag = false;
//			for (int i = 0; i < arr.length; i++) {
//				if (m < arr[i]) {
//					l = m+1;
//					flag = true;
//					break;
//				}
//				if (tmpMoney < arr[i]) {
//					tmpMoney = m;
//					count++;
//					if (count > M) {
//						l = m+1;
//						flag = true;
//						break;
//					}
//				}
//				tmpMoney -= arr[i];
//			}
//			if (!flag) r = m-1;
			if (check(m, M)) l = m+1;
			else r = m-1;
		}
		return l;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]);
		int max = Integer.MIN_VALUE;
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		
		System.out.println(binarySearch(1, max*M, max));
		br.close();
	}
}
