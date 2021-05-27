package CodeUp.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DollarChange2801 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// const
		final int dollar = 1130;
		System.out.println(Integer.parseInt(br.readLine()) * dollar);
	}
}
