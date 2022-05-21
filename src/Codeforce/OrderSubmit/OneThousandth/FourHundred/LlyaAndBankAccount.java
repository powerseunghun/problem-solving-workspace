package Codeforce.OrderSubmit.OneThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LlyaAndBankAccount {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		String tmp = null;
		
		int money1 = 0, money2 = 0;
		
		if (sb.toString().charAt(0) != '-') {
			System.out.println(sb.toString());
			return;
		}
		else if (sb.toString().length() == 2) {
			System.out.println("0");
			return;
		}
		else {
			tmp = sb.toString();
			
			for (int i = 0; i < 2; i++) {
				switch(i) {
				case 0:
					sb.replace(sb.toString().length()-1, sb.toString().length(), "");
					arr[i] = Integer.parseInt(sb.toString());
					sb = new StringBuffer(tmp);
					break;
				case 1:
					sb.replace(sb.toString().length()-2, sb.toString().length()-1, "");
					arr[i] = Integer.parseInt(sb.toString());
					break;
				}
			}
		}
		System.out.println(arr[0] >= arr[1] ? arr[0] : arr[1]);
		br.close();
	}
}
