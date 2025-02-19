package Acmicpc.As.B2.ThirtyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SquareFourAngle31945 {
	static final int l = 4;
	static int[] arr = null;
	static boolean func() {
		boolean flag1 = arr[0]==0 && arr[1]==1 && arr[2]==2 && arr[3]==3;
		boolean flag2 = arr[0]==0 && arr[1]==1 && arr[2]==4 && arr[3]==5;
		boolean flag3 = arr[0]==0 && arr[1]==2 && arr[2]==4 && arr[3]==6;
		boolean flag4 = arr[0]==1 && arr[1]==3 && arr[2]==5 && arr[3]==7;
		boolean flag5 = arr[0]==2 && arr[1]==3 && arr[2]==6 && arr[3]==7;
		boolean flag6 = arr[0]==4 && arr[1]==5 && arr[2]==6 && arr[3]==7;
		return flag1 || flag2 || flag3 || flag4 || flag5 || flag6;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			arr = new int[l];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			sb.append(func() ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
