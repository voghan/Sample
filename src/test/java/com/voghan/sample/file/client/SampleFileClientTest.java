package com.voghan.sample.file.client;

import java.io.File;

import junit.framework.TestCase;

public class SampleFileClientTest extends TestCase {

    public void testExecute() {
	try {
	    SampleFileClient client = new SampleFileClient();
	    
	    File input = new File("C:/Users/brian.vaughn.PERFICIENT/Documents/BBY_DI_FULL_20121123_1000/BBY_DI_FULL.dat");
	    
	    assertTrue(input.exists());
	    assertTrue(input.canRead());
	    
	    client.execute();
	    
	    File f = new File("C:/Users/brian.vaughn.PERFICIENT/Documents/BBY_DI_FULL_20121123_1000/BBY_DI_FULL.js");
	    
	    assertTrue(f.exists());
	    assertTrue(f.canRead());
	} catch (Exception e) {
	    e.printStackTrace();
	    fail(e.getMessage());
	}
    }
}
