package Codeforce.OrderSubmit.OneThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VasyaTheHipster {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.print(Math.min(a, b) + " ");
		System.out.println((Math.max(a, b)-Math.min(a, b)) / 2);
		br.close();
	}
}
