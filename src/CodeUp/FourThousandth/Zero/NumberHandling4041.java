package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHandling4041 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		int sum = 0;
		for (int i = 0; i < str.toString().length(); i++) {
			sum += str.toString().charAt(i) - '0';
		}
		
		System.out.println(Integer.parseInt(str.reverse().toString()));
		System.out.println(sum);
		
	}
}
