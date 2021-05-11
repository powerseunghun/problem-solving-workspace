package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteMaliciousProgram1640 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] pr = new String[Integer.parseInt(br.readLine())];
		int count = 0;
		
		for (int i = 0; i < pr.length; i++) {
			pr[i] = br.readLine();
		}
		
		for (String str : pr) {
			if (str.contains("tap") || str.contains("xocure") || str.length() <= 3) {
				System.out.println(str);
				count++;
			}
		}
		
		if (count <= 3) {
			System.out.println("safe");
		}
		else if (count <= 6) {
			System.out.println("warning");
		}
		else System.out.println("danger");
	}
}
