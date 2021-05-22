package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NkPowerLarge2640 {
	// yet overflow reformation 
	static long getPower(int n, int k) {
		if (k == 0) return 1;
		else if (k == 1) return n;
		else {
			if (k % 2 == 0) {
				return (getPower(n, k/2) * getPower(n, k/2)) % 1000000007;
			}
			else return (getPower(n, k/2+1) * getPower(n, k/2))  % 1000000007;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(getPower(n, k));
	}
}
