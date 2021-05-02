package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeCalc1169 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = 2012 - Integer.parseInt(br.readLine()) + 1 + "";
		int t = Integer.parseInt(a) >= 2000 ? 3 : 1;
		
		System.out.println(Integer.parseInt(a.substring(2, 4)) + " " + t);
	}
}
