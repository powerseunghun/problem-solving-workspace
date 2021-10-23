package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ppptest2 {
	static int[] arr = null;
	static int maxAttackArea = Integer.MIN_VALUE;
	static List<Set<Integer>> areaList = new ArrayList<>();
	
	static void areaListInit(int numOfRegion, int[][] frequencies) {
		for (int i = 0; i < numOfRegion; i++) {
			areaList.add(new HashSet<>());
		}
		
		for (int i = 0; i < frequencies.length; i++) {
			for (int j = 0; j < frequencies[i].length; j++) {
				areaList.get(i).add(frequencies[i][j]);
			}
		}
	}
	
	static int getMaxValue(int[][] frequencies) {
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < frequencies.length; i++) {
			for (int j = 0; j < frequencies[i].length; j++) {
				res = Math.max(res, frequencies[i][j]);
			}
		}
		return res;
	}
	
	static void dfs(int n, int d, int idx, int maxVal) {
		if (d >= n) {
			int count = 0;
			for (int i = 0; i < areaList.size(); i++) {
				for (int j = 0; j < arr.length; j++) {
					if (areaList.get(i).contains(arr[j])) count++;
				}
			}
			maxAttackArea = Math.max(maxAttackArea, count);
			return;
		}
		
		for (int i = idx; i <= maxVal; i++) {
			arr[d] = i;
			dfs(n, d+1, i+1, maxVal);
		}
	}
	
	private static void solution(int numOfRegion, int numOfAttackableFrequency, int[][] frequencies) {
		arr = new int[numOfAttackableFrequency];
		int maxVal = getMaxValue(frequencies);
		areaListInit(numOfRegion, frequencies);
		
		dfs(numOfAttackableFrequency, 0, 1, maxVal);
		
		System.out.println(maxAttackArea);
	}
	
	private static class InputData {
		int numOfRegion;
		int numOfAttackableFrequency;
		int[][] frequencies;
	}
	
	private static InputData processStdin() {
		InputData inputData = new InputData();
		
		try (Scanner scanner = new Scanner(System.in)) {
			String[] temp = scanner.nextLine().split(" ");
			inputData.numOfRegion = Integer.parseInt(temp[0]);
			inputData.numOfAttackableFrequency = Integer.parseInt(temp[1]);
			inputData.frequencies = new int[inputData.numOfRegion][];
			
			for (int i = 0; i < inputData.numOfRegion; i++) {
				temp = scanner.nextLine().split(" ");
				
				int numOfFrequency = Integer.valueOf(temp[0]);
				inputData.frequencies[i] = new int[numOfFrequency];
				for (int j = 0; j < numOfFrequency; j++) {
					inputData.frequencies[i][j] = Integer.parseInt(temp[j+1]);
				}
			}
		} catch(Exception e) {
			throw e;
		}
		return inputData;
	}
	public static void main(String[] args) {
		InputData inputData = processStdin();
		solution(inputData.numOfRegion, inputData.numOfAttackableFrequency, inputData.frequencies);
	}
}
