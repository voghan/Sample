package com.voghan.sample.string;

import junit.framework.TestCase;

public class RegexTest extends TestCase {

    public void testSlashes() {
	String test = "\\\\whatever\\";
	
	String out = test.replaceAll("\\\\", "/");
	out = out.replaceAll("//", "/");
	assertEquals("/whatever/", out);
    }
}
