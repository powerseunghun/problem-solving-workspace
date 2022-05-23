package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RequiredRemainder {
	static int getNumber(int x, int y, int k) {
		int res1 = (k/x * x) - (x-y);
		int res2 = (k/x * x) + y;
		if (res1 < 0) return res2;
		else if (res2 > k) return res1;
		else return Math.max(res1, res2); 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int t = Integer.parseInt(br.readLine()), x = 0, y = 0, k = 0;
		
		while (t-- > 0) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			k = Integer.parseInt(tmp.split(" ")[2]);
			
			sb.append(getNumber(x, y, k) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
