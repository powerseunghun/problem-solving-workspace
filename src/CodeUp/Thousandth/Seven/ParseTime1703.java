package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseTime1703 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int h = s / 3600;
		s %= 3600;
		int m = s / 60;
		s %= 60;
		
		System.out.println(h + " " + m + " " + s);
	}
}
