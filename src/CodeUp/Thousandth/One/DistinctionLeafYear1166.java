package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctionLeafYear1166 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
