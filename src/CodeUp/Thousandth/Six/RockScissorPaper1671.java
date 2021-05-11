package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockScissorPaper1671 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int g = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		if (g == c) System.out.println("tie");
		else {
			switch(g) {
			case 0:
				if (c == 1) System.out.println("win");
				else System.out.println("lose");
				break;
			case 1:
				if (c == 0) System.out.println("lose");
				else System.out.println("win");
				break;
			case 2:
				if (c == 0) System.out.println("win");
				else System.out.println("lose");
				break;
			}
		}
	}
}
