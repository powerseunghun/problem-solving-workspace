package cf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointsOnPlane {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		long l = 0;
		
		while(N-- > 0) {
			l = Long.parseLong(br.readLine());
			sb.append(l == 1 ? (long)Math.sqrt(l)-1 : (long)Math.sqrt(l)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
