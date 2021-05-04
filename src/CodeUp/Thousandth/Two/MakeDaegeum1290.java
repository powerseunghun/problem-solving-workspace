package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeDaegeum1290 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), count = 0;
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) count++;
		}
		
		System.out.println(count);
	}
}
