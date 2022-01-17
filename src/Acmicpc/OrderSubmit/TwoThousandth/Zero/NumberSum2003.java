package Acmicpc.OrderSubmit.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSum2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), left = 0, right = 0;
		int M = Integer.parseInt(tmp.split(" ")[1]), count = 0, val = 0;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while (true) {
			if (val >= M) {
				val -= arr[left++];
			}
			else if (right == N) break;
			else val += arr[right++];
			if (val == M) count++;
		}
		System.out.println(count);
		br.close();
	}
}
