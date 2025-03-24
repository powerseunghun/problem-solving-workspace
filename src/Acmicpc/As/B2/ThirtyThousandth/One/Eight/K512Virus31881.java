package Acmicpc.As.B2.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class K512Virus31881 {
	static boolean arr[] = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int Q = Integer.parseInt(str.split(" ")[1]), cmd = 0, x = 0, res = N;
		arr = new boolean[N];
		
		Arrays.fill(arr, false);
		
		while(Q-- > 0) {
			str = br.readLine();
			cmd = Integer.parseInt(str.split(" ")[0]);
			switch(cmd) {
			case 1:
				x = Integer.parseInt(str.split(" ")[1]);
				if (!arr[--x]) {
					arr[x] = true;
					res--;
				}
				break;
			case 2:
				x = Integer.parseInt(str.split(" ")[1]);
				if (arr[--x]) {
					arr[x] = false;
					res++;
				}
				break;
			case 3:
				sb.append(res).append("\n");
				break;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
