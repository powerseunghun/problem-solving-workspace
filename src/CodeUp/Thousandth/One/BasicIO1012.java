package CodeUp.Thousandth.One;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BasicIO1012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		System.out.println(tmp.split(" ")[0] + " " + tmp.split(" ")[1]);
	}
}
