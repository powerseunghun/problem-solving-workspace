package Acmicpc.As.B3.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ILoveCroatia9517 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()), T = 0, b = 0;
		char Z = ' ';
		String tmp = null;
		
		br.readLine();
		while (true) {
			tmp = br.readLine();
			T = Integer.parseInt(tmp.split(" ")[0]);
			Z = tmp.split(" ")[1].charAt(0);
			b += T;
			if (b >= 210) break;
			
			K = Z=='T' ? K+1 == 9 ? 1 : K+1 : K;
		}
		
		System.out.println(K);
		br.close();
	}
}
