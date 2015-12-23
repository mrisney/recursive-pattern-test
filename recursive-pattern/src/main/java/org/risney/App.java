package org.risney;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.risney.test.RecursivePatternMatcher;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger log = Logger.getLogger(App.class.getName());

	static String pattern1 = "224610";
	static String pattern2 = "1112233558";
	static String pattern3 = "1101102203";

	public static void main(String[] args) {

		RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
		if (patternMatcher.followsPattern(pattern1)) {
			log.log(Level.INFO,
					"match found:" + patternMatcher.getMatchingPattern());
		}
		

		if (patternMatcher.followsPattern(pattern2)) {
			log.log(Level.INFO,
					"match found:" + patternMatcher.getMatchingPattern());

		}

		if (patternMatcher.followsPattern(pattern3)) {
			log.log(Level.INFO,
					"match found:" + patternMatcher.getMatchingPattern());

		}
	}
	
}
