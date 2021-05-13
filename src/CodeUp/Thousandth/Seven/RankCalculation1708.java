package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RankCalculation1708 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] gArr = new int[Integer.parseInt(br.readLine())];
		int[] rArr = new int[gArr.length];
		String tmp = br.readLine();
		Arrays.fill(rArr, 1);
		
		for (int i = 0; i < gArr.length; i++) {
			gArr[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		for (int i = 0; i < rArr.length; i++) {
			for (int j = 0; j < rArr.length; j++) {
				if (i==j) continue;
				if (gArr[i] < gArr[j]) rArr[i]++;
			}
		}
		
		for (int i = 0; i < gArr.length; i++) {
			System.out.println(gArr[i] + " " + rArr[i]);
		}
	}
}
