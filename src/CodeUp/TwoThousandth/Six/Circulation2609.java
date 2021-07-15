package CodeUp.TwoThousandth.Six;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Circulation2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		double c = (double)a/b;
		String str = Double.toString(c);
		
		System.out.println(c);
		System.out.println(str);
	}
}
