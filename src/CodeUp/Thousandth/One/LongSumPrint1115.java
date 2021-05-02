package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongSumPrint1115 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		System.out.println(Long.parseLong(tmp.split(" ")[0]) + Long.parseLong(tmp.split(" ")[1]));
	}
}
