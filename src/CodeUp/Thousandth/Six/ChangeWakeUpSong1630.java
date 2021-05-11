package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeWakeUpSong1630 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] wSong = new String[n];
		
		for (int i = 0; i < wSong.length; i++) {
			wSong[i] = br.readLine();
		}
		
		for (int i = 0; i < wSong.length; i++) {
			System.out.println(wSong[i]);
			if (i < wSong.length-1) System.out.println("AMOLED");
		}
	}
}
