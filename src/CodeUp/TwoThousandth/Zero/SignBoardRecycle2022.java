package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignBoardRecycle2022 {
	static int count = 0;
	static char[] arr = null;
	static int[] idxInStr = null;
	static String target = null;
	static boolean signCheck = false;
	static void dfs(int n, int d, String str, int startIdx, int wantChar) {
		if (signCheck) return;
		if (d >= n) {
			int base = 0;
			boolean check = true;
			for (int i = 0; i < idxInStr.length-1; i++) {
				if (i == 0) {
					base = idxInStr[i+1] - idxInStr[i];
				}
				else {
					if ((idxInStr[i+1] - idxInStr[i]) != base) {
						check = false;
						break;
					}
				}
			}
			if (check) {
				count++;
				signCheck = true;
			}
			return;
		}
		
		boolean flag = false;
		for (int i = startIdx; i < str.length(); i++) {
			if (str.charAt(i) == target.charAt(wantChar)) {
				arr[d] = str.charAt(i);
				idxInStr[d] = i;
				dfs(n, d+1, str, i+1, wantChar+1);
				flag = true;
			}
		}
		if (!flag) return;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		target = br.readLine();
		String[] signs = new String[N];
		arr = new char[target.length()];
		idxInStr = new int[target.length()];
		
		for (int i = 0; i < N; i++) {
			signs[i] = br.readLine();
			signCheck = false;
			dfs(target.length(), 0, signs[i], 0, 0);
		}
		
		System.out.println(count);
	}
}
