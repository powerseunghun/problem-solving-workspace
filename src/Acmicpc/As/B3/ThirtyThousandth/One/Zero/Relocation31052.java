package Acmicpc.As.B3.ThirtyThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Relocation31052 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int Q = Integer.parseInt(str.split(" ")[1]), O = 0, A = 0, B = 0;
		arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(Q-- > 0) {
			str = br.readLine();
			O = Integer.parseInt(str.split(" ")[0]);
			A = Integer.parseInt(str.split(" ")[1]);
			B = Integer.parseInt(str.split(" ")[2]);
			
			if (O == 1) {
				arr[A] = B;
			} else {
				sb.append(Math.abs(arr[A]-arr[B])).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
