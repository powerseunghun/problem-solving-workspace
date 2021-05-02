package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Yutnori1207 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] count = new int[2];
		Arrays.fill(count, 0);
		
		while (st.hasMoreTokens()) {
			count[Integer.parseInt(st.nextToken())]++;
		}
		
		if (count[0] == 4) {
			System.out.println("모");
		}
		else {
			switch(count[1]) {
			case 1:
				System.out.println("도");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("걸");
				break;
			case 4:
				System.out.println("윷");
				break;
			}
		}
	}
}
