package Acmicpc.As.B4.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IdentifyingTea11549 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()), count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			if (a == Integer.parseInt(st.nextToken())) count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
