package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]);
		int num = 0, min = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 5 6 7 8 9
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					num = arr[i] + arr[j] + arr[k];
					if (num > min && num <= M) min = num;
				}
			}
		}
		System.out.println(min);
		br.close();
	}
}
