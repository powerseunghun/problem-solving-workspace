package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoffeeShop1275 {
	static int[] arr = null, sumArr = null;
	static void init() {
		for (int i = 0; i < arr.length; i++) {
			sumArr[i] = arr[i];
			sumArr[i] += i >= 2 ? sumArr[i-1] : 0;
		}
	}
	static void reCalc(int a, int b) {
		int diff = Math.abs(arr[a] - b);
		
		for (int i = a; i < sumArr.length; i++) {
			sumArr[i] -= diff;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N+1];
		sumArr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		init();
		
		for (int i = 0, x = 0, y = 0, a = 0, b = 0, s = 0, e = 0; i < M; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			a = Integer.parseInt(tmp.split(" ")[2]);
			b = Integer.parseInt(tmp.split(" ")[3]);
			s = Math.min(x, y);
			e = Math.max(x, y);
			sb.append(sumArr[e] - sumArr[s-1] + "\n");
			reCalc(a, b);
		}
		System.out.println(sb.toString());
		br.close();
	}
}
