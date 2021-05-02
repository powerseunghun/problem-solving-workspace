package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapPrint1113 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		System.out.println(Integer.parseInt(tmp.split(" ")[1]) + " " + Integer.parseInt(tmp.split(" ")[0]));
	}
}
