package Acmicpc.OrderSubmit.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bigger4101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int a = 0, b = 0;
		
		while(true) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a == 0 && b == 0) break;
			
			if (a > b) System.out.println("Yes");
			else System.out.println("No");
		}
		
		br.close();
	}
}
