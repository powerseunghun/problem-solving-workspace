package CodeUp.Thousandth.One;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BasicIO1015 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		
		System.out.println(sb.reverse());
	}
}
