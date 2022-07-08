package Acmicpc.As.B3.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NASLJEDSTVO9664 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), O = Integer.parseInt(br.readLine());
		int t = O / (N-1);
		
		if (O - t*(N-1) == 0) {
			System.out.println((O+t-1) + " " + (O+t) + "\n");
		}
		else {
			System.out.println((O+t) + " " + (O+t) + "\n");
		}
		
		br.close();
	}
}
