package Acmicpc.As.B3.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RugbyClub2083 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, name = null;
		int age = 0, weight = 0;
		
		while (true) {
			tmp = br.readLine();
			name = tmp.split(" ")[0];
			age = Integer.parseInt(tmp.split(" ")[1]);
			weight = Integer.parseInt(tmp.split(" ")[2]);
			if (name.equals("#") && age == 0 && weight == 0) break;
			sb.append(name + " " + ((age > 17 || weight >= 80) ? "Senior\n" : "Junior\n"));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
