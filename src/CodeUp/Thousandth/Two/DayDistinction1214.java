package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayDistinction1214 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int y = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		boolean isLeaf = ((y % 400 == 0) ||(y % 4 == 0 && y % 100 != 0));
		
		switch(m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30");
			break;
		default:
			if (isLeaf) System.out.println("29");
			else System.out.println("28");
			break;
		}
	}
}
