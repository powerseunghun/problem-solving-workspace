package Acmicpc.OrderSubmit.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrderOfSequence1722 {
	static int[] arr = null;
	static long[] seq = null;
	static boolean[] check = null;
	static void init(int N) {
		arr = new int[N+1];
		check = new boolean[N+1];
		seq = new long[N+1];
		seq[0] = 1;
		for (int i = 1; i < seq.length; i++) {
			seq[i] = seq[i-1]*i;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int flag = Integer.parseInt(st.nextToken());
		long k = 0, res = 1;
		
		init(N);
		switch(flag) {
		case 1:
			k = Long.parseLong(st.nextToken());
			for (int i = 0; i < N; i++) {
				for (int j = 1; j <= N; j++) {
					if (check[j]) continue;
					if (seq[N-i-1] < k) {
						k -= seq[N-i-1];
					}
					else {
						arr[i] = j;
						check[j] = true;
						break;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				sb.append(arr[i] + " ");
			}
			break;
		case 2:
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < N; i++) {
				for (int j = 1; j < arr[i]; j++) {
					if (!check[j]) res += seq[N-i-1];
				}
				check[arr[i]] = true;
			}
			break;
		}
		
		System.out.println(flag == 1 ? sb.toString() : res);
		br.close();
	}
}
