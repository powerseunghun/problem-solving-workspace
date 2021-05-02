package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleCondtion1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int max = a >= b ? a >= c ? a : c : b >= c ? b : c;
		boolean flag = true;
		
		if (max == a) {
			if ((b + c) > a) flag = true;
			else flag = false;
		}
		else if (max == b) {
			if ((a + c) > b) flag = true;
			else flag = false;
		}
		else {
			if ((a + b) > c) flag = true;
			else flag = false;
		}
		if (flag) System.out.println("yes");
		else System.out.println("no");
	}
}
