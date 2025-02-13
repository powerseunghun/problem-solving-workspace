package Acmicpc.As.B2.ThirtyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGame32141 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int H = Integer.parseInt(str.split(" ")[1]), idx = 0, v = 0, res = -1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			arr[idx++] = v;
		}
		for (int i = 0; i < arr.length; i++) {
			H -= arr[i];
			if (H <= 0) res = i+1;
		}
		
		System.out.println(res);
		br.close();
	}
}
