package Acmicpc.As.B3.ThirtyThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DraggedOutDuel32587 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str1 = br.readLine();
		String str2 = br.readLine();
		char c1 = 0, c2 = 0;
		int res1 = 0, res2 = 0;
		
		for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			c1 = str1.charAt(i);
			c2 = str2.charAt(i);
			switch(c1) {
			case 'R':
				if (c2 == 'S') res1++;
				else if (c2 == 'P') res2++;
				break;
			case 'S':
				if (c2 == 'R') res2++;
				else if (c2 == 'P') res1++;
				break;
			case 'P':
				if (c2 == 'R') res1++;
				else if (c2 == 'S') res2++;
				break;
			}
		}
		
		System.out.println(res1 > res2 ? "victory" : "defeat");
		br.close();
	}
}
