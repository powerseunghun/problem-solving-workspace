package Acmicpc.As.B2.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Query14648 {
	static long[] arr = null, pArr = null;
	static void calc() {
		for (int i = 1; i < arr.length; i++) {
			pArr[i] = arr[i]+pArr[i-1];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.split(" ")[0]);
		int q = Integer.parseInt(str.split(" ")[1]);
		int a = 0, b = 0, c = 0, d = 0;
		char op = ' ';
		arr = new long[n+1];
		pArr = new long[n+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		calc();
		
		while(q-- > 0) {
			str = br.readLine();
			op = str.split(" ")[0].charAt(0);
			a = Integer.parseInt(str.split(" ")[1]);
			b = Integer.parseInt(str.split(" ")[2]);
			if (op == '1') {
				sb.append(pArr[b]-pArr[a-1]);
				long tmp = arr[a];
				arr[a] = arr[b];
				arr[b] = tmp;
				calc();
			} else {
				c = Integer.parseInt(str.split(" ")[3]);
				d = Integer.parseInt(str.split(" ")[4]);
				sb.append((pArr[b]-pArr[a-1]) - (pArr[d]-pArr[c-1]));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
