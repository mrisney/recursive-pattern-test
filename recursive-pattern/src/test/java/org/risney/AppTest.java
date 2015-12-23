package org.risney;

import org.risney.test.RecursivePatternMatcher;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testPatternOne()
    {
    	String pattern = "224610";
    	RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
    	assertTrue( patternMatcher.followsPattern(pattern) );
    }
    
    public void testPatternTwo()
    {
    	String pattern = "1112233558";
    	RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
    	assertTrue( patternMatcher.followsPattern(pattern) );
    }
    
    public void testPatternThree()
    {
    	String pattern = "1101102203";
    	RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
    	assertTrue( patternMatcher.followsPattern(pattern) );
    }
    
    public void testPatternFour()
    {
    	String pattern = "112";
    	RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
    	assertTrue( patternMatcher.followsPattern(pattern) );
    }
    
    public void testPatternFive()
    {
    	String pattern = "011";
    	RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
    	assertTrue( patternMatcher.followsPattern(pattern) );
    }
    
    public void testNonPattern()
    {
    	String pattern = "551020";
    	RecursivePatternMatcher patternMatcher = new RecursivePatternMatcher();
    	assertFalse( patternMatcher.followsPattern(pattern) );
    }
    
    
    
    
    
}
