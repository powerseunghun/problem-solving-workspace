package Acmicpc.As.B3.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DasBlinkenlights16625 {
	static int GCD(int a, int b) {
        if (b == 0) return a;
        else return GCD(b, a % b);
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int p = Integer.parseInt(tmp.split(" ")[0]);
		int q = Integer.parseInt(tmp.split(" ")[1]);
		int s = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println(p*q/GCD(p,q) <= s ? "yes" : "no");
		br.close();
	}
}
