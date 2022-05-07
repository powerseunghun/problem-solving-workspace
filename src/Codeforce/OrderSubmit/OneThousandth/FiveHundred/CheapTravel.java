package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheapTravel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int a = Integer.parseInt(tmp.split(" ")[2]);
		int b = Integer.parseInt(tmp.split(" ")[3]);
		
		System.out.println(Math.min(n*a, (n/m * b) + (n % m * a)));
		br.close();
	}
}
