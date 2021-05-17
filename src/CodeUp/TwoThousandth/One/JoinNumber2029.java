package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JoinNumber2029 {
	static int getLength(int n) {
		if (n == 1) return 2;
		else return getLength(n - 1) + (int)(Math.pow(2.0, n-2));
	}
	static void makeArr(int[] beforeArr, int[] afterArr) {
		int index = 0;
		for (int i = 0; i < beforeArr.length; i++, index+=2) {
			afterArr[index] = beforeArr[i];
		}
		for (int i = 0; i < afterArr.length; i++) {
			if (afterArr[i] == 0) {
				afterArr[i] = afterArr[i-1] + afterArr[i+1]; 
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int m = Integer.parseInt(tmp.split(" ")[0]), n = Integer.parseInt(tmp.split(" ")[1]);
		
		int[] beforeArr = {1, 1}, afterArr = null;
		
		for (int i = 1; i < m; i++) {
			afterArr = new int[getLength(i+1)];
			makeArr(beforeArr, afterArr);
			beforeArr = afterArr.clone();
			for (int j = 0; j < afterArr.length; j++) {
				afterArr[j] = 0;
			}
		}
		
		System.out.println(beforeArr[n - 1]);
	}
}
