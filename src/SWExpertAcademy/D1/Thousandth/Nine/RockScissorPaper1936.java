package SWExpertAcademy.D1.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockScissorPaper1936 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		if (A == 1) {
			if (B == 2) System.out.println("B");
			else System.out.println("A");
		}
		else if (A == 2) {
			if (B == 1) System.out.println("A");
			else System.out.println("B");
		}
		else {
			if (B == 1) System.out.println("B");
			else System.out.println("A");
		}
	}
}
