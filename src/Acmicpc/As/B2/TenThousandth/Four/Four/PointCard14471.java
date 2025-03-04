package Acmicpc.As.B2.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PointCard14471 {
	static class A implements Comparable<A> {
		int A;
		int B;
		public A() {};
		public A(int A, int B) {
			this.A = A;
			this.B = B;
		}
		@Override
		public int compareTo(A o) {
			return this.A - o.A;
		}
	}
	static A[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = 0;
		arr = new A[M];
		
		for (int i = 0; i < M; i++) {
			str = br.readLine();
			arr[i] = new A(Integer.parseInt(str.split(" ")[0]), Integer.parseInt(str.split(" ")[1]));
		}
		Arrays.sort(arr);
		
		for (int i = 1; i < M; i++) {
			if (arr[i].A >= N) break;
			res += N-arr[i].A;
		}
		
		System.out.println(res);
		br.close();
	}
}
