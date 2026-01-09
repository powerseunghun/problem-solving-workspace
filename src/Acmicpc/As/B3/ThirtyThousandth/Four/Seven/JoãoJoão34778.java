package Acmicpc.As.B3.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JoãoJoão34778 {
	static final int l = 4;
	static int[] arr = new int[l+1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		while(st.hasMoreTokens()) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		for (int i = 1; i < arr.length; i++) {
			res = arr[i] == 0 ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
