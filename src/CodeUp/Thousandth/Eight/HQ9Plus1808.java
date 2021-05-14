package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HQ9Plus1808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'H':
				System.out.print("Hello, world! ");
				break;
			case 'Q':
				System.out.print(s + " ");
				break;
			case '9':
				for (int j = 99; j >= 0; j--) {
					String bottle = "";
					if (j > 2) {
						System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer. ");
						System.out.println("Take one down and pass it around, " + (j-1) + " bottles of beer on the wall. ");
					}
					else if (j == 2) {
						System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer. ");
						System.out.println("Take one down and pass it around, " + (j-1) + " bottle of beer on the wall. ");
					}
					else if (j == 1) {
						System.out.println(j + " bottle of beer on the wall, " + j + " bottle of beer. ");
						System.out.println("Take one down and pass it around, no more bottles of beer on the wall. ");
					}
					else if (j == 0) {
						System.out.println("No more bottles of beer on the wall, no more bottles of beer. ");
						System.out.print("Go to the store and buy some more, 99 bottles of beer on the wall. ");
					}
				}
				break;
			}
		}
	}
}
