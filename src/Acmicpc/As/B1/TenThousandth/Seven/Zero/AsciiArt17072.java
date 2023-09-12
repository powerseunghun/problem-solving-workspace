package Acmicpc.As.B1.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AsciiArt17072 {
	static final int asciiWeight = 510000;
	static char[] transAsciiArr = { '#', 'o', '+', '-', '.' };
	static int[] weight = { 2126, 7152, 722 };
	static char[][] arr = null;
	static int[] asciiArr = new int[3];
	static int getIntensity() {
		int res = 0;
		for (int i = 0; i < asciiArr.length; i++) {
			res += asciiArr[i] * weight[i];
		}
		return res;
	}
	static char getTransChar(int intensity) {
		int idx = (int)((intensity == 0 ? 1 : intensity) / asciiWeight);
		return transAsciiArr[idx > 4 ? 4 : idx];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		arr = new char[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < asciiArr.length; k++) {
					asciiArr[k] = Integer.parseInt(st.nextToken());
				}
				arr[i][j] = getTransChar(getIntensity());
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
		br.close();
	}
}
