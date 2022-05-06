package Acmicpc.As.B4.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TournamentSelection14038 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0, res = -1;
		
		for (int i = 0; i < 6; i++) {
			count += br.readLine().charAt(0) == 'W' ? 1 : 0; 
		}
		
		if (count >= 5) res = 1;
		else if (count >= 3) res = 2;
		else if (count >= 1) res = 3;
		
		System.out.println(res);
		br.close();
	}
}
