package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ppptest3 {
	static final int personNumber = 0;
	static int[] arr = null;
	static boolean[] check = null;
	static List<String> lineList = new ArrayList<>();
	
	static void dfs(int n, int d) {
		if (d >= n) {
			String str = "";
			for (int i = 0; i < arr.length; i++) {
				str += (arr[i] + "");
			}
			lineList.add(str);
			return;
		}
		
		for (int i = 1; i <= personNumber; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = i;
				dfs(n, d+1);
				check[i] = false;
			}
		}
	}
	
	static List<String> makeConflictStringArr(int numOfConflict, int[][] conflicts) {
		StringBuilder sb = new StringBuilder();
		List<String> conflictList = new ArrayList<>();
		
		for (int i = 0; i < conflicts.length; i++) {
			sb = new StringBuilder();
			for (int j = 0; j < conflicts[i].length; j++) {
				sb.append(conflicts[i][j]);
			}
			conflictList.add(sb.toString());
			conflictList.add(sb.reverse().toString());
		}
		
		return conflictList;
	}
	
	static void makeLineList() {
		dfs(personNumber, 0);
	}
	
	static int getNonConflictLineCount(List<String> lineList, List<String> conflictList) {
		int count = 0;
		boolean flag = true;
		
		for (int i = 0; i < lineList.size(); i++) {
			flag = true;
			for (int j = 0; j < conflictList.size(); j++) {
				if (lineList.get(i).contains(conflictList.get(j))) {
					flag = false;
					break;
				}
			}
			if (flag) count++;
		}
		return count;
	}
	
	private static void solution(int numOfConflict, int[][] conflicts) {
		arr = new int[personNumber];
		check = new boolean[personNumber+1];
		List<String> conflictList = makeConflictStringArr(numOfConflict, conflicts);
		makeLineList();
		
		System.out.println(getNonConflictLineCount(conflictList, conflictList));
	}
	
	private static class InputData {
		int numOfConflict;
		int[][] conflicts;
	}
	
	private static InputData processStdin() {
		InputData inputData = new InputData();
		
		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfConflict = Integer.parseInt(scanner.nextLine());
			inputData.conflicts = new int[inputData.numOfConflict][2];
			
			for (int i = 0; i < inputData.numOfConflict; i++) {
				String[] temp = scanner.nextLine().split(" ");
				inputData.conflicts[i][0] = Integer.parseInt(temp[0]);
				inputData.conflicts[i][1] = Integer.parseInt(temp[1]);
			}
		} catch(Exception e) {
			throw e;
		}
		
		return inputData;
	}
}
