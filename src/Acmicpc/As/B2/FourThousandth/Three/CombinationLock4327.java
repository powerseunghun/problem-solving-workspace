package Acmicpc.As.B2.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationLock4327 {
	static int func(int a, int b) {
		return (a-b+40)%40*9;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int a = 0, b = 0, c = 0, d = 0;
		
		while(true) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			d = Integer.parseInt(str.split(" ")[3]);
			if (a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			sb.append(1080+func(a, b)+func(c, b)+func(c,d)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
