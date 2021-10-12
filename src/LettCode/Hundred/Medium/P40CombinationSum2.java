package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P40CombinationSum2 {
	static List<List<Integer>> res = new ArrayList<>();
	static Set<String> check = new HashSet<>();
	static void search(int sum, int target, int idx, int[] candidates, List<Integer> list) {
		if (sum >= target) {
			if (sum == target) {
				String str = "";
				for (int i = 0; i < list.size(); i++) {
					str += list.get(i);
				}
				if (!check.contains(str)) res.add(list);
				check.add(str);
			}
			return;
		}
		
		for (int i = idx; i < candidates.length; i++) {
			List<Integer> transList = new ArrayList<>();
			for (int j = 0; j < list.size(); j++) {
				transList.add(list.get(j));
			}
			transList.add(candidates[i]);
			search(sum+candidates[i], target, i+1, candidates, transList);
		}
	}
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	res.clear();
    	check.clear();
    	search(0, target, 0, candidates, new ArrayList<>());
    	
    	return res;
    }
	public static void main(String[] args) {
		int[] candidates = { 2,5,2,1,2 };
		int target = 5;
		combinationSum2(candidates, target);
		
		/**
		 * TLE
		 * candidates [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
		 * target 27
		 * candidates [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1] 
		 * target 30
		 */
	}
}
