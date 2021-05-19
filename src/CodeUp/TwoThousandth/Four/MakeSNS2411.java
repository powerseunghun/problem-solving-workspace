package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeSNS2411 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp = null;
		int mCount = 0, fmCount = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			switch(tmp.split(",")[1]) {
			case "M":
				mCount++;
				break;
			case "F":
				fmCount++;
				break;
			}
		}
		
		System.out.println(mCount);
		System.out.println(fmCount);
	}
}
