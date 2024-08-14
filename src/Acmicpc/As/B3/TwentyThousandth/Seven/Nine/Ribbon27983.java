package Acmicpc.As.B3.TwentyThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ribbon27983 {
	static int N = 0;
	static int[] x = null, l = null;
	static char[] c = null;
	static void init(StringTokenizer st, int[] arr) {
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}
	static void init(StringTokenizer st, char[] arr) {
		for (int i = 0; i < N; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int resX = 0, resY = 0;
		boolean flag = false;
		N = Integer.parseInt(br.readLine());
		x = new int[N]; l= new int[N];
		c = new char[N];
		
		init(new StringTokenizer(br.readLine()), x);
		init(new StringTokenizer(br.readLine()), l);
		init(new StringTokenizer(br.readLine()), c);
		
		for (int i = 0; i < N-1 && !flag; i++) {
			for (int j = i+1; j < N && !flag; j++) {
				if (Math.abs(x[i]-x[j]) > l[i]+l[j] || c[i]==c[j]) continue;
				flag = true;
				resX = i+1; resY = j+1;
			}
		}
		
		System.out.println(flag ? "YES\n" + resX + " " + resY : "NO");
		br.close();
	}
}
