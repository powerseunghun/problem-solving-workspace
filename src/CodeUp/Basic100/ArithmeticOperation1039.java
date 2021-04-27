package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperation1039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		long A = Long.parseLong(tmp.split(" ")[0]);
		long B = Long.parseLong(tmp.split(" ")[1]);
		System.out.println(A + B);
	}
}
