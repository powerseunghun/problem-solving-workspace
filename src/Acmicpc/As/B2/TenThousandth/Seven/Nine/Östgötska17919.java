package Acmicpc.As.B2.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Östgötska17919 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = 0, t = 0;
		while(st.hasMoreTokens()) {
			if (st.nextToken().contains("ae")) {
				t++;
			}
			a++;
		}
		
		System.out.println((double)t/a*100.0 >= 40 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska");
		br.close();
	}
}
