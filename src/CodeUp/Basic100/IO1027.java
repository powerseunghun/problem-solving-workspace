package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO1027 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		for (int i = 2; i >= 0; i--) {
			System.out.print(tmp.split("\\.")[i]);
			if (i == 0) break;
			System.out.print("-");
		}
	}
}
