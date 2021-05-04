package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetSquareMaxArea1296 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		double h = n / 4.0;
		double w = (n - h * 2) / 2;
		
		System.out.println((int) (h * w));
	}
}
