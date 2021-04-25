package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicIO1023 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		System.out.println(tmp.split("\\.")[0] + "\n" + tmp.split("\\.")[1]);
	}
}
