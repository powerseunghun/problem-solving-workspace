package Acmicpc.As.B2.SixThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeCards6122 {
	static int[] a = null, b = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int T = Integer.parseInt(str.split(" ")[1]), C = 0, HH = 0, MM = 0;
		
		a = new int[N+1];
		b = new int[N+1];
		while(T-- > 0) {
			str = br.readLine();
			C = Integer.parseInt(str.split(" ")[0]);
			HH = Integer.parseInt(str.split(" ")[2]);
			MM = Integer.parseInt(str.split(" ")[3]);
			
			if (str.contains("START")) {
				a[C] = HH*60+MM;
			} else {
				b[C] += HH*60+MM-a[C];
			}
		}
		for (int i = 1; i <= N; i++) {
			sb.append(b[i]/60).append(" ").append(b[i]%60).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
