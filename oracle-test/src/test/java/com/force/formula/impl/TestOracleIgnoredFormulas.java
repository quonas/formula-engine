/*
 * Copyright, 1999-2018, salesforce.com
 * All Rights Reserved
 * Company Confidential
 */
package com.force.formula.impl;

import junit.framework.TestSuite;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Contains ignored or bad tests for formulatests.xml
 * @author stamm
 * @since 0.2
 */
@RunWith(AllTests.class)
@Ignore //All XML defined tests are executed using FormulaOracleXMLTests
public class TestOracleIgnoredFormulas extends FormulaOracleTests {

	
    public TestOracleIgnoredFormulas(String owner) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        super("OracleIgnoredFormulaTests");
    }

    public static TestSuite suite()
    {
        try {
            return new TestOracleIgnoredFormulas("no");
        } catch (ParserConfigurationException | SAXException | IOException x) {
            throw new RuntimeException(x);
        }
    }

    @Override
    protected boolean filterTests(FormulaTestCaseInfo testCase) {
        return testCase.getTestLabels().contains("ignore");
    }    
}
