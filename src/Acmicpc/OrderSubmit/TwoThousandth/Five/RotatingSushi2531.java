package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotatingSushi2531 {
	static int[] arr = null;
	static int[] check = null;
	static int res = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(tmp.split(" ")[2]);
		int c = Integer.parseInt(tmp.split(" ")[3]), sum = 0;
		
		arr = new int[N];
		check = new int[d+1];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < k; i++) {
			if (check[arr[i]] == 0) sum++;
			check[arr[i]]++;
		}
		res = sum;
		
		for (int i = 1; i < N; i++) {
			if (res <= sum) res = check[c] == 0 ? sum+1 : sum;
			check[arr[i-1]]--;
			if (check[arr[i-1]] == 0) sum--;
			if (check[arr[(i+k-1)%N]] == 0) sum++;
			check[arr[(i+k-1)%N]]++;
		}
		
		System.out.println(res);
		br.close();
	}
}
