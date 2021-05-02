package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeforeThirtyMinute1174 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]) + 24;
		int b = Integer.parseInt(tmp.split(" ")[1]) + (a * 60) - 30;
		
		a = (b / 60) % 24;
		b = b % 60;
		
		System.out.println(a + " " + b);
	}
}
