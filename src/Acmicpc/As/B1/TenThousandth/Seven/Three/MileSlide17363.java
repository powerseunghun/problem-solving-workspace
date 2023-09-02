package Acmicpc.As.B1.TenThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MileSlide17363 {
	static int[] ascArr1 = {46, 79, 45, 124, 47, 92, 94, 60, 118, 62};
	static int[] ascArr2 = {46, 79, 124, 45, 92, 47, 60, 118, 62, 94};
	static Map<Integer, Integer> map = new HashMap<>();
	static char[][] arr = null;
	static void mapInit() {
		for (int i = 0; i < ascArr1.length; i++) {
			map.put(ascArr1[i], ascArr2[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		arr = new char[N][M];
		
		mapInit();
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for (int i = arr[0].length-1; i >= 0; i--) {
			for (int j = 0, v = 0; j < arr.length; j++) {
				v = arr[j][i];
				sb.append((char)(int)map.get(v));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
