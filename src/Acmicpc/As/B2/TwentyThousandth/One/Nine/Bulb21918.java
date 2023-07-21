package Acmicpc.As.B2.TwentyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bulb21918 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), c = 0, a = 0, b = 0;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(M-- > 0) {
			str = br.readLine();
			c = Integer.parseInt(str.split(" ")[0]);
			a = Integer.parseInt(str.split(" ")[1])-1;
			b = Integer.parseInt(str.split(" ")[2]);
			switch(c) {
				case 1:
					arr[a] = b;
					break;
				case 2: case 3: case 4:
					b--;
					for (int i = a; i <= b; i++) {
						if (c == 2) {
							arr[i] = arr[i] == 0 ? 1 : 0;
						}
						else {
							arr[i] = c == 3 ? 0 : 1;
						}
					}
					break;
			}
		}
		
		for (int el : arr) {
			sb.append(el + " ");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
