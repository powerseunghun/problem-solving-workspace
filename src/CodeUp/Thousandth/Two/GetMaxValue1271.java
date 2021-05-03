package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetMaxValue1271 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = -1, tmp = 0;
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			max = tmp >= max ? tmp : max;
		}
		
		System.out.println(max);
	}
}
