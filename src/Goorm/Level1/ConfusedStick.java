package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConfusedStick {
	static int counts[] = new int[4];
	static void fillArr(String str) {
		for (int i = 0, idx = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case '1':
				idx = 0;
				break;
			case 'I':
				idx = 1;
				break;
			case 'l':
				idx = 2;
				break;
			case '|':
				idx = 3;
				break;
			default:
				idx = 4;
				break;
			}
			if (idx < 4) counts[idx]++;
		}
	}
	static void print() {
		for (int el : counts) {
			System.out.println(el);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		fillArr(str);
		print();
	}
}
