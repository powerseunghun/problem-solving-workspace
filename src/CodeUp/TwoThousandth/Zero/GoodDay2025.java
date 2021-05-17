package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodDay2025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		boolean flag = true;
		int[] y = new int[10], md = new int[10];
		Arrays.fill(y, 0);
		Arrays.fill(md, 0);
		
		for (int i = 0; i < tmp.length(); i++) {
			if (i == 4 || i == 7) continue;
			if (i < 4) y[Integer.parseInt(tmp.charAt(i)+"")]++;
			else md[Integer.parseInt(tmp.charAt(i)+"")]++;
		}
		
		for (int i = 0; i < y.length; i++) {
			if (y[i] != md[i]) {
				flag = false;
				break;
			}
		}
		
		if (flag) System.out.println("yes");
		else System.out.println("no");
	}
}
