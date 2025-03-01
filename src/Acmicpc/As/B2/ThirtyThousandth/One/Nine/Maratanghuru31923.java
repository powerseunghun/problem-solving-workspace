package Acmicpc.As.B2.ThirtyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maratanghuru31923 {
	static int[] A = null, B = null, R = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(str.split(" ")[0]);
		int P = Integer.parseInt(str.split(" ")[1]);
		int Q = Integer.parseInt(str.split(" ")[2]);
		boolean flag = true;
		
		A = new int[N];
		B = new int[N];
		R = new int[N];
		
		for (int i=0, idx=0; i < 2; i++, idx=0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				if (i == 0) {
					A[idx++] = Integer.parseInt(st.nextToken());
				} else {
					B[idx++] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		for (int i = 0; i < A.length && flag; i++) {
			for (int j = 0; j <= 10000; j++) {
				if (A[i]+j*P == B[i]+j*Q) {
					A[i] = 0;
					B[i] = 0;
					R[i] = j;
					break;
				}
			}
			if (A[i] != B[i]) {
				flag = false;
			}
		}
		
		if (flag) {
			System.out.println("YES");
			for (int i = 0; i < R.length; i++) {
				System.out.print(R[i] + " ");
			}
		} else {
			System.out.println("NO");
		}
		br.close();
		
	}
}
