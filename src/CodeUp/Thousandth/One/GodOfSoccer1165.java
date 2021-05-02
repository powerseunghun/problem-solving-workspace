package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GodOfSoccer1165 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int t = Integer.parseInt(tmp.split(" ")[0]);
		int s = Integer.parseInt(tmp.split(" ")[1]);
		
		while (t < 90) {
			s++;
			t+= 5;
		}
		System.out.println(s);
	}
}
