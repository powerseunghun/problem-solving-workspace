package Acmicpc.As.B4.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HourHand24083 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println((A+B) % 12 == 0 ? 12 : (A+B)%12);
		br.close();
	}
}
