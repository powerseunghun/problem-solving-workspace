package Acmicpc.As.B3.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextNumber4880 {
	static int[] arr = new int[3];
	static int judge() {
		if (arr[2] - arr[1] == arr[1] - arr[0]) return 1;
		else if (arr[2] / arr[1] == arr[1] / arr[0]) return 2;
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			
			switch(judge()) {
			case 1:
				sb.append("AP " + (arr[2] + (arr[2]-arr[1])) + "\n");
				break;
			case 2:
				sb.append("GP " + (arr[2] * (arr[2]/arr[1])) + "\n");
				break;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
