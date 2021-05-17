package CodeUp.TwoThousandth.Zero;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class AscendingDescending2007 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean ascFlag = true, descFlag = true;
		int[] arr = new int[n], tmp = null;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		tmp = arr.clone();
		
		Arrays.sort(tmp);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != tmp[i]) {
				ascFlag = false;
				break;
			}
		}
		
		for (int i = arr.length-1, tIdx = 0; i >= 0; i--, tIdx++) {
			if (arr[i] != tmp[tIdx]) {
				descFlag = false;
				break;
			}
		}
		
		if (ascFlag && !descFlag) System.out.println("오름차순");
		else if (!ascFlag && descFlag) System.out.println("내림차순");
		else System.out.println("섞임");
	}
}
