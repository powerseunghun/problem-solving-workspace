package Acmicpc.As.B3.TwentyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class カレー作り22396 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int R = 0, W = 0, C = 0, G = 0, target = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			R = Integer.parseInt(tmp.split(" ")[0]);
			W = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			G = Integer.parseInt(tmp.split(" ")[3]);
			if (R == 0 && W == 0 && C == 0 && G == 0) break;
			
			target = W*C-R < 0 ? 0 : W*C-R;
			sb.append((int)(Math.ceil((double)target/G)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
