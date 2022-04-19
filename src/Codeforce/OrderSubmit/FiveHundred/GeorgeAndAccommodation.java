package Codeforce.OrderSubmit.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeorgeAndAccommodation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		String tmp = null;
		
		for (int i = 0, p = 0, q = 0; i < N; i++) {
			tmp = br.readLine();
			p = Integer.parseInt(tmp.split(" ")[0]);
			q = Integer.parseInt(tmp.split(" ")[1]);
			if (Math.abs(p-q) >= 2) cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
