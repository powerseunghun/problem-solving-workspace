package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P39CombinationSum {
	static List<List<Integer>> res = new ArrayList<>();
	static void search(int sum, int target, int idx, int[] candidates, List<Integer> list) {
		if (sum >= target) {
			if (sum == target) res.add(list);
			return;
		}
		
		for (int i = idx; i < candidates.length; i++) {
			List<Integer> transList = new ArrayList<>();
			for (int j = 0; j < list.size(); j++) {
				transList.add(list.get(j));
			}
			transList.add(candidates[i]);
			search(sum+candidates[i], target, i, candidates, transList);
		}
	}
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	res.clear();
    	List<Integer> baseList = new ArrayList<>();
    	search(0, target, 0, candidates, baseList);
    	
    	return res;
    }
	public static void main(String[] args) {
		int[] candidates = { 2, 3, 5 };
		int target = 8;
		List<Integer> l = new ArrayList<>();
		search(0, target, 0, candidates, l);
	}
}
