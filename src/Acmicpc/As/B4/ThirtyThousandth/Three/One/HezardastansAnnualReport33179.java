package Acmicpc.As.B4.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HezardastansAnnualReport33179 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, res = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			res += (v+1)/2;
		}
		
		System.out.println(res);
		br.close();
	}
}
