package Codeforce.OrderSubmit.OneHundred;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

public class ChatRoom {
	static int[] arr = new int[5];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), target = "hello";
		Arrays.fill(arr, -1);
		
		for (int i = 0, targetIdx = 0; i < str.length(); i++) {
			if (str.charAt(i) == target.charAt(targetIdx)) {
				targetIdx++;
				if (targetIdx > target.length()-1) {
					System.out.println("YES");
					return;
				}
			}
		}
		
		System.out.println("NO");
		br.close();
	}
}
