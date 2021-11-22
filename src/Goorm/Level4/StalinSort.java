package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StalinSort {
	static int getIndexBinarySearch(int left, int right, int val, int[] lisArray) {
		int mid = 0; 
		while (left < right) {
			mid = (left+right)/2;
			if (lisArray[mid] < val) {
				left = mid+1;
			}
			else right = mid;
		}
		return right;
	}
	static int stalinSort(List<Integer> arr) {
		int count = 0;
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i-1) > arr.get(i)) {
				arr.remove(i);
				count++;
				i--;
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().replaceAll(" ", "")), idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arr = new ArrayList<>();
		int[] lisArray = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < arr.size(); i++) {
			if (i == 0) {
				lisArray[idx++] = arr.get(i);
				
			}
			else {
				if (lisArray[idx-1] < arr.get(i)) {
					lisArray[idx++] = arr.get(i);
				}
				else lisArray[getIndexBinarySearch(0, idx-1, arr.get(i), lisArray)] = arr.get(i);
			}
		}
		System.out.println(Math.min(stalinSort(arr), N-idx));
		br.close();
	}
}
