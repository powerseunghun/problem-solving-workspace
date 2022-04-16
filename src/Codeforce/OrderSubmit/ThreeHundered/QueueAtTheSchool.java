package Codeforce.OrderSubmit.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueAtTheSchool {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int t = Integer.parseInt(tmp.split(" ")[1]);
		char[] arr = br.readLine().toCharArray();
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n-1; j++) {
				if (arr[j] == 'B' && arr[j+1] == 'G') {
					char ch = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = ch;
					j++;
				}
			}
		}
		for (char ch : arr) {
			System.out.print(ch);
		}
		br.close();
	}
}
