package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperation1053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
