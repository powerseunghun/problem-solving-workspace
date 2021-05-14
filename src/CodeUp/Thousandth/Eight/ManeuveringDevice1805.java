package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManeuveringDevice1805 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n], device = new int[n];
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			arr[i] = Integer.parseInt(tmp.split(" ")[0]);
			device[i] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int v = arr[i];
					int dv = device[i];
					arr[i] = arr[j];
					device[i] = device[j];
					arr[j] = v;
					device[j] = dv;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " " + device[i]);
		}
	}
}
