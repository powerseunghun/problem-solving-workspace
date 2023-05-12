package Acmicpc.As.B2.TenThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TourDeBinnus16585 {
	static int[] idx = new int[2];
	static String[] cmd = new String[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = null;
		int v = 0, sum = 0, cnt = 0, r = 0;
		
		for (int i = 0; i < idx.length; i++) {
			str = br.readLine();
			idx[i] = Integer.parseInt(str.split(" ")[0]);
			cmd[i] = str.split(" ")[1];
		}
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			r++;
			
			sum += cmd[0].equals("left") 
					? r <= idx[0] ? v : 0 
					: r >= idx[0] ? v : 0;
			cnt += cmd[1].equals("left") 
					? r <= idx[1] && v == 0 ? 1 : 0 
					: r >= idx[1] && v == 0 ? 1 : 0;
		}
		
		System.out.println(sum + " " + cnt);
		br.close();
	}
}
