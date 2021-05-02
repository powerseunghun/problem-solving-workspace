package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondarySmallNumber1167 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int max = a >= b ? a >= c ? a : c : b >= c ? b : c;
		
		if (max == a) {
			System.out.println(b >= c ? b : c);
		}
		else if (max == b) {
			System.out.println(a >= c ? a : c);
		}
		else {
			System.out.println(a >= b ? a : b);
		}
	}
}
