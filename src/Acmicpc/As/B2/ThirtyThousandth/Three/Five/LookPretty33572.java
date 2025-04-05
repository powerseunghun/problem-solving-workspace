package Acmicpc.As.B2.ThirtyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LookPretty33572 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int N = Integer.parseInt(str.split(" ")[0]);
		long M = Long.parseLong(str.split(" ")[1]), sum = 0;
		
		while(st.hasMoreTokens()) {
			sum += Long.parseLong(st.nextToken());
		}
		
		System.out.println(N+M<=sum ? "DIMI" : "OUT");
		br.close();
	}
}
