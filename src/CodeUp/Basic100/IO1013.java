package CodeUp.Basic100;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IO1013 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		System.out.println(tmp.split(" ")[0] + " " + tmp.split(" ")[1]);
	}
}
