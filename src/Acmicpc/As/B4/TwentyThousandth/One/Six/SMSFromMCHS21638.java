package Acmicpc.As.B4.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SMSFromMCHS21638 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int t1 = 0, v1 = 0, t2 = 0, v2 = 0;
		t1 = Integer.parseInt(tmp.split(" ")[0]);
		v1 = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		t2 = Integer.parseInt(tmp.split(" ")[0]);
		v2 = Integer.parseInt(tmp.split(" ")[1]);
		
		if (v2 >= 10 && t2 < 0) System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		else if (t1 > t2) System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		else if (v2 > v1) System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		else System.out.println("No message");
		
		br.close();
	}
}
