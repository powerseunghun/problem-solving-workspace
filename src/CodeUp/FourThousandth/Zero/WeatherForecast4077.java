package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WeatherForecast4077 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] arr = { {30, 80, 150}, {15, 35, 75}, {30, 90, 150}};
		int sum = 0;
		boolean check = false;
		boolean[] careWeight = new boolean[4];
		Arrays.fill(careWeight, false);
		
		for (int i = 0; i < arr.length; i++) {
			int val = Integer.parseInt(st.nextToken());
			sum = i < arr.length-1 ? sum += val : sum;
			System.out.print(val + " ");
			check = false;
			for (int j = 0; j < arr[i].length; j++) {
				if (val <= arr[i][j]) {
					switch(j) {
					case 0:
						System.out.println("Blue");
						break;
					case 1:
						System.out.println("Green");
						break;
					case 2:
						System.out.println("Yellow");
						break;
					}
					careWeight[j] = true;
					check = true;
					break;
				}
			}
			if (!check) {
				careWeight[3] = true;
				System.out.println("Red");
			}
		}
		for (int i = careWeight.length-1; i >= 0; i--) {
			if (careWeight[i]) {
				switch(i) {
				case 3:
					System.out.println("Stop");
					break;
				case 2:
					System.out.println("Careful");
					break;
				case 1:
					System.out.println("Possible");
					break;
				case 0:
					System.out.println("Recommend");
					break;
				}
				break;
			}
		}
		
		if (sum / 2 >= 115) {
			System.out.println("SMS");
		}
	}
}
