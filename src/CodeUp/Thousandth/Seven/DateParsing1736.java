package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateParsing1736 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sec = Integer.parseInt(br.readLine());
		int d = 0, h = 0, m = 0;
		d = sec / (24 * 3600);
		sec %= (24 * 3600);
		h = sec / (60 * 60);
		sec %= (60 * 60);
		m = sec / 60;
		sec %= 60;
		
		System.out.println(d + " " + h + " " + m + " " + sec);
	}
}
