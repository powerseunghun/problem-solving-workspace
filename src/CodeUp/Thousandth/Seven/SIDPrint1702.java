package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIDPrint1702 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int c = Integer.parseInt(tmp.split(" ")[1]);
		tmp = tmp.replace(" ", "");
		
		if (c % 2 == 0) {
			System.out.println(tmp + " " + tmp);
		}
		else System.out.println(tmp);
	}
}
