package Acmicpc.As.B3.ThirtyThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Рассадка30775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long M = Long.parseLong(str.split(" ")[0]);
		long K = Long.parseLong(str.split(" ")[1]), sum = 0;
		
		while(st.hasMoreTokens()) {
			sum += Long.parseLong(st.nextToken());
		}
		
		System.out.println((sum+M-1)/M);
		br.close();
	}
}
