package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lineup1618 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] line = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < line.length; i++) {
			line[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(line);
		
		for (int i = 0; i < line.length; i++) {
			System.out.print(line[i] + " ");
		}
	}
}
