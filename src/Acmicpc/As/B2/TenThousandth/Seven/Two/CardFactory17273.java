package Acmicpc.As.B2.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CardFactory17273 {
	static int[] arr1 = null, arr2 = null, sIds = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), v = 0, res = 0;
		
		arr1 = new int[N]; arr2 = new int[N]; sIds = new int[N];
		
		Arrays.fill(sIds, 0);
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			arr1[i] = Integer.parseInt(str.split(" ")[0]);
			arr2[i] = Integer.parseInt(str.split(" ")[1]);
		}
		
		while(M-- > 0) {
			v = Integer.parseInt(br.readLine());
			for (int i = 0; i < sIds.length; i++) {
				if (sIds[i] == 0) {
					sIds[i] = arr1[i] <= v ? 1 : 0;
				}
				else {
					sIds[i] = arr2[i] <= v ? 0 : 1;
				}
			}
		}
		
		for (int i = 0; i < sIds.length; i++) {
			res += sIds[i] == 0 ? arr1[i] : arr2[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
