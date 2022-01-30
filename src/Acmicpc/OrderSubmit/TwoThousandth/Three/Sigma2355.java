package Acmicpc.OrderSubmit.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sigma2355 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Integer.parseInt(tmp.split(" ")[0]);
		long B = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(((Math.abs(A-B)+1) * (A+B)) / 2);
		br.close();
	}
}
