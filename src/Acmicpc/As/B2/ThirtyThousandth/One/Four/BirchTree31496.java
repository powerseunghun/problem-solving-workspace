package Acmicpc.As.B2.ThirtyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirchTree31496 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), S = null;
		int N = Integer.parseInt(str.split(" ")[0]), V = 0, res = 0;
		S = str.split(" ")[1];
		
		while (N-- > 0) {
			str = br.readLine();
			V = Integer.parseInt(str.split(" ")[1]);
			str = str.split(" ")[0];
			for (int i = 0; i < str.split("_").length; i++) {
				if (str.split("_")[i].equals(S)) {
					res += V;
					break;
				}
			}
		}
		System.out.println(res);
		br.close();
	}
}
