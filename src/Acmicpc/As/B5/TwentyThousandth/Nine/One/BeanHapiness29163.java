package Acmicpc.As.B5.TwentyThousandth.Nine.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeanHapiness29163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, oCnt = 0, eCnt = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken()) % 2;
			oCnt = v != 0 ? oCnt+1 : oCnt;
			eCnt = v == 0 ? eCnt+1 : eCnt;
		}
		
		System.out.println(eCnt > oCnt ? "Happy" : "Sad");
		br.close();
	}
}
