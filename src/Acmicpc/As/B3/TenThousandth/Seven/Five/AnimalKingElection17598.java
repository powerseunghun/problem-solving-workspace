package Acmicpc.As.B3.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalKingElection17598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt1 = 0, cnt2 = 0;
		String tmp = null;
		
		for (int i = 0; i < 9; i++) {
			tmp = br.readLine();
			if (tmp.equals("Tiger")) cnt1++;
			else cnt2++;
		}
		
		System.out.println(cnt1 > cnt2 ? "Tiger" : "Lion");
		br.close();
	}
}
