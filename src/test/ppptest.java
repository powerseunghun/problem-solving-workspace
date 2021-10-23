package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ppptest {
	static void init(PriorityQueue<Integer> pq, List<Integer> branchList) {
		for (int i = 2; i <= 100000; i++) {
			pq.add(i);
		}
		branchList.add(1);
	}
	
	static void func(PriorityQueue<Integer> pq, List<Integer> branchList, Operation[] operations) {
		for (int i = 0, inputVal = 0; i < operations.length; i++) {
			if (operations[i].type.equals(OperationType.branch)) {
				inputVal = pq.poll();
				branchList.add(inputVal);
			}
			else {
				Integer removeVal = operations[i].value;
				branchList.remove(removeVal);
				pq.add(removeVal);
			}
		}
		Collections.sort(branchList);
	}
	
	static String printBranchList(List<Integer> branchList) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < branchList.size(); i++) {
			sb.append(branchList.get(i) + " ");
		}
		return sb.toString();
	}
	
	private static void solution(int numOfOperation, Operation[] operations) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		List<Integer> branchList = new ArrayList<>();
		
		init(pq, branchList);
		func(pq, branchList, operations);
		
		System.out.println(printBranchList(branchList));
	}
	
	private static class InputData {
		int numOfOperation;
		Operation[] operations;
	}
	
	private static class Operation {
		OperationType type;
		Integer value;
		public Operation(OperationType type, Integer value) {
			this.type = type;
			this.value = value;
		}
	}
	
	private static enum OperationType {
		branch,
		merge;
	}
	
	private static InputData processStdin() {
		InputData inputData = new InputData();
		
		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfOperation = Integer.parseInt(scanner.nextLine());
			inputData.operations = new Operation[inputData.numOfOperation];
			
			for (int i = 0; i < inputData.numOfOperation; i++) {
				String[] temp = scanner.nextLine().split(" ");
				
				Integer value = null;
				OperationType operationType = OperationType.valueOf(temp[0]);
				if (OperationType.merge == operationType) {
					value = Integer.valueOf(temp[1]);
				}
				inputData.operations[i] = new Operation(operationType, value);
			}
		}catch (Exception e) {
			throw e;
		}
		return inputData;
	}
	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();
		
		solution(inputData.numOfOperation, inputData.operations);
	}
}
