package aula20171027;

import java.util.ArrayList;
import java.util.List;

/**
 * Identify patterns and transform step array
 */
public class IdentifyPatternInStepArray {
	
	public static List<Character> identifyPatterns(char[] steps) {

		if (!isValidArray(steps)) {
			System.out.println("Not a valid step instructions array");
			System.exit(1);
		}
		List<Character> stepList = new ArrayList<>();
		for (char c : steps) {
			stepList.add(c);
		}
		stepList = transformStepArray(stepList);
		return stepList;
	}

	public static boolean isValidArray(char[] steps) {
		if (steps.length < 2) return false;
		return true;
	}

	public static List<Character> transformStepArray(List<Character> stepList) {
		for (int i = 0; i < stepList.size() - 2; i++) {
			if (stepList.get(i) == 'R' && stepList.get(i + 1) == 'R' && stepList.get(i + 2) != 'R') {
				stepList.set(i, 'I');
				stepList.remove(stepList.get(i + 1));
			}
			if (stepList.get(i) == 'R' && stepList.get(i + 1) == 'R' && stepList.get(i + 2) == 'R') {
				stepList.set(i, 'L');
				stepList.remove(stepList.get(i + 1));
				stepList.remove(stepList.get(i + 1));
			}
		}
		return stepList;

	}
}
