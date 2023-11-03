package Acmicpc.As.S5.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Radio3135 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int res = Integer.MAX_VALUE, t = 0;
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			t = Integer.parseInt(br.readLine());
			res = Math.min(res, Math.abs(t-B)+1);
		}
		
		System.out.println(Math.min(res, Math.abs(A-B)));
		br.close();
	}
}
