package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VeryBigNumberCompare2112 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine());
		int a = 0, b = 0, index = 0;
		double max = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			if ((b * Math.log(a)) > max) {
				max = b * Math.log(a);
				index = i+1;
			}
		}
		System.out.println(index);
	}
}
