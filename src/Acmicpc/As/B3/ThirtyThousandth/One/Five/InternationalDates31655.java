package Acmicpc.As.B3.ThirtyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InternationalDates31655 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if (Integer.parseInt(str.split("/")[0]) > 12) {
			System.out.println("EU");
		} else if (Integer.parseInt(str.split("/")[1]) > 12) {
			System.out.println("US");
		} else {
			System.out.println("either");
		}
		br.close();
	}
}
