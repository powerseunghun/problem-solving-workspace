package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WardInstallation1523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[9+5][9+5];
		int a1 = 0, a2 = 0, b1 = 0, b2 = 0, c1 = 0, c2 = 0, d1 = 0, d2 = 0, count = 0;
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], '0');
		}
		
		String tmp = br.readLine();
		a1 = Integer.parseInt(tmp.split(" ")[0]);
		a2 = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		b1 = Integer.parseInt(tmp.split(" ")[0]);
		b2 = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		c1 = Integer.parseInt(tmp.split(" ")[0]);
		c2 = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		d1 = Integer.parseInt(tmp.split(" ")[0]);
		d2 = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = c1+2; i <= d1+2; i++) {
			for (int j = c2+2; j <= d2+2; j++) {
				arr[i][j] = '3';
			}
		}
		arr[a1+2][a2+2] = arr[a1+2][a2+2] == '3' ? '4' : '1';
		
		for (int i = a1; i <= a1+4; i++) {
			for (int j = a2; j <= a2+4; j++) {
				arr[i][j] = arr[i][j] == '0' ? '2' : arr[i][j];
			}
		}
		
		for (int i = b1; i <= b1+4; i++) {
			for (int j = b2; j <= b2+4; j++) {
				arr[i][j] = arr[i][j] == '2' ? 'c' : 'b';
			}
		}
		arr[b1+2][b2+2] = 'a';

		for (int i = 3; i <= 11; i++) {
			for (int j = 3; j <= 11; j++) {
				if (arr[i][j] == '4') flag = true;
			}
		}
		
		for (int i = 3; i <= 11; i++) {
			for (int j = 3; j <= 11; j++) {
				if (flag) {
					if (arr[i][j] == '2' || arr[i][j] == '3' || arr[i][j] == '4') count++;
				}
				else {
					if (arr[i][j] == '1' || arr[i][j] == '2') count++;
				}
			}
		}
		System.out.println(count);
	}
}
