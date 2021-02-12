package Programmers.level2;

public class SkillTree {
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
        	String tmp = "";
        	for (int j = 0; j < skill_trees[i].length(); j++) {
        		if (skill.contains(skill_trees[i].charAt(j) + "")) {
        			tmp += skill_trees[i].charAt(j);
        		}
        	}
        	answer = skill.startsWith(tmp) ? answer + 1 : answer;
        }
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
