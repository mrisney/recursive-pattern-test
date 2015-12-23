package org.risney.test;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class RecursivePatternMatcher {
	private static final Logger log = Logger.getLogger(RecursivePatternMatcher.class.getName());
	private List<Integer> matchingPattern;

	public RecursivePatternMatcher() {

	}
   public boolean followsPattern(String input) {
		matchingPattern = new LinkedList<Integer>(); 
		for (int i = 1; i < input.length(); i++) {
			for (int j = 0; j < i; j++) {
				long valueN2 = Long.parseLong(input.substring(0, j + 1));
				long valueN1 = Long.parseLong(input.substring(j + 1, i + 1));
			
				matchingPattern.add( (int) (long) valueN1);
				matchingPattern.add( (int) (long) valueN2);
				if (valueN1 < valueN2)
					continue;
			
				String valueN = "" + valueN2 + valueN1;
				if (valueN.length() == input.length()) {
					return false;
				}

				while (valueN.length() < input.length()) {				
					long nextValue = valueN2 + valueN1;
					matchingPattern.add( (int) (long) nextValue);
					valueN += nextValue;
					valueN2 = valueN1;
					valueN1 = nextValue;
				}
				if (valueN.equals(input)) {
					// meets criteria
					return true;
				}
			}
		}
		return false;
	}

	public List<Integer> getMatchingPattern() {
		return matchingPattern;
	}
}
