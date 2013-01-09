package com.voghan.sample.string;

import junit.framework.TestCase;

public class ClubLinkTest extends TestCase {

    public void testLink() {
	String clubName = "Chanhassen, MN";
	String link_name = "chanhassen-mn";
	String tmp = clubName.toLowerCase();
	
	tmp = convert( tmp );
	
	assertEquals(link_name, tmp);
    }
    
    
    public void testLinkMAC() {
	String clubName = "Minneapolis Athletic Club";
	String link_name = "minneapolis-athletic-club";
	String tmp = clubName.toLowerCase();
	
	tmp = convert( tmp );
	
	assertEquals(link_name, tmp);
    }
    
    public void testLinkStLouisPark() {
	String clubName = "St. Louis Park";
	String link_name = "st-louis-park";
	String tmp = clubName.toLowerCase();
	
	tmp = convert( tmp );
	
	assertEquals(link_name, tmp);
    }
    
    public void testLinkFlagShip() {
	String clubName = "Eden Prairie (Flagship), MN";
	String link_name = "eden-prairie-flagship-mn";
	String tmp = clubName.toLowerCase();
	
	tmp = convert( tmp );
	
	assertEquals(link_name, tmp);
    }
    
    public void testPrograms() {
	
	String club_url = "http://localhost:4502/cf#/content/ltfweb/en/clubs/chanhassen-mn.html";
	String l_base_url;
	String programs_url;
	String amenities_url;
	String connections_url;
	
	
	l_base_url = club_url.substring( 0, club_url.length() - 5 );
        
        programs_url = l_base_url + "/programs.html";
        amenities_url = l_base_url + "/amenities-hours.html";
        connections_url = l_base_url + "/club-connections.html";
        
        assertEquals("http://localhost:4502/cf#/content/ltfweb/en/clubs/chanhassen-mn/programs.html", programs_url);
        assertEquals("http://localhost:4502/cf#/content/ltfweb/en/clubs/chanhassen-mn/amenities-hours.html", amenities_url);
        assertEquals("http://localhost:4502/cf#/content/ltfweb/en/clubs/chanhassen-mn/club-connections.html", connections_url);
        
    }
    
    private String convert(String tmp)
    {
	tmp = tmp.replace(", ", "-");
	tmp = tmp.replace(".", "");
	tmp = tmp.replace("(", "");
	tmp = tmp.replace(")", "");
	tmp = tmp.replace(" ", "-");
	
	return tmp;
    }
}
