package com.voghan.sample.file.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class SampleFileClient {
    static Logger log = Logger.getLogger(SampleFileClient.class);
    String mFileName;
    String mDirectory;
    String mOutputFile;

    public static void main(String[] args) {
	
	SampleFileClient client = new SampleFileClient();
	client.execute();
    }
    
    public void execute() {
	try {
	    log.debug("...starting to execute");
	    mDirectory = "C:/Users/brian.vaughn.PERFICIENT/Documents/BBY_DI_FULL_20121123_1000/";
	    mFileName = "BBY_DI_FULL.dat";
	    
	    File f = new File(mDirectory + mFileName);
	    
	    if ( f.exists() ) {
		processFile(f);
	    }
	    log.debug("...execution complete....");
	} catch(Exception e) {
	    e.printStackTrace();
	    log.debug(e.getMessage(), e);
	}
    }
    
    public void processFile(File file) throws IOException {
	
	log.debug("...starting to processFile");
	
	List<Tile> tiles = readFile(file);
	
	String str = transform(tiles);
	
	writeFile(str);
	
	log.debug("...processFile completed ...e");
    }
    
    public List<Tile> readFile(File file) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
	String inputLine;               
	Map<String, Tile> tileMap = new HashMap<String, Tile>();
	
	log.debug("...starting to readFile");
	try {
	    	boolean header = true;
        	while ((inputLine = in.readLine()) != null) {
        	    if (header) { 
        		header = false;
        		continue;
        	    }
        	    
        	    StringTokenizer token = new StringTokenizer(inputLine, "\t");
        	    log.debug("Token count:" +token.countTokens());
        	    
        	    if ( token.countTokens() > 73 ) {
        		
        		TileVersion version = createTile(token);
        		Tile tile = null;
        		
        		if ( tileMap.containsKey(version.getVersionsId())) {
        		    tile = (Tile) tileMap.get(version.getVersionsId());
        		} else {
        		    tile = new Tile(version.getF000(), version.getF002(), version.getF003(), version.getF006());
        		}
        		tile.getVersions().add(version);
        		tileMap.put(tile.getVersionsId(), tile);
        	    }
        	    
        	}       
	} finally {
	    in.close();
	}
	
	
	log.debug("...readFile completed ...");
	return (List<Tile>)tileMap.values();
    }
    
    private TileVersion createTile(StringTokenizer token) {
	TileVersion tileVersion = new TileVersion();
	tileVersion.setF000(cleanToken(token));
	tileVersion.setF001(cleanToken(token));
	tileVersion.setF002(cleanToken(token));
	tileVersion.setF003(cleanToken(token));
	tileVersion.setF004(cleanToken(token));
	tileVersion.setF005(cleanToken(token));
	tileVersion.setF006(cleanToken(token));
	tileVersion.setF007(cleanToken(token));
	tileVersion.setF008(cleanToken(token));
	tileVersion.setF009(cleanToken(token));
	
	tileVersion.setF010(cleanToken(token));
	tileVersion.setF011(cleanToken(token));
	tileVersion.setF012(cleanToken(token));
	tileVersion.setF013(cleanToken(token));
	tileVersion.setF014(cleanToken(token));
	tileVersion.setF015(cleanToken(token));
	tileVersion.setF016(cleanToken(token));
	tileVersion.setF017(cleanToken(token));
	tileVersion.setF018(cleanToken(token));
	tileVersion.setF019(cleanToken(token));
	
	tileVersion.setF020(cleanToken(token));
	tileVersion.setF021(cleanToken(token));
	tileVersion.setF022(cleanToken(token));
	tileVersion.setF023(cleanToken(token));
	tileVersion.setF024(cleanToken(token));
	tileVersion.setF025(cleanToken(token));
	tileVersion.setF026(cleanToken(token));
	tileVersion.setF027(cleanToken(token));
	tileVersion.setF028(cleanToken(token));
	tileVersion.setF029(cleanToken(token));
	
	tileVersion.setF030(cleanToken(token));
	tileVersion.setF031(cleanToken(token));
	tileVersion.setF032(cleanToken(token));
	tileVersion.setF033(cleanToken(token));
	tileVersion.setF034(cleanToken(token));
	tileVersion.setF035(cleanToken(token));
	tileVersion.setF036(cleanToken(token));
	tileVersion.setF037(cleanToken(token));
	tileVersion.setF038(cleanToken(token));
	tileVersion.setF039(cleanToken(token));
	
	tileVersion.setF040(cleanToken(token));
	tileVersion.setF041(cleanToken(token));
	tileVersion.setF042(cleanToken(token));
	tileVersion.setF043(cleanToken(token));
	tileVersion.setF044(cleanToken(token));
	tileVersion.setF045(cleanToken(token));
	tileVersion.setF046(cleanToken(token));
	tileVersion.setF047(cleanToken(token));
	tileVersion.setF048(cleanToken(token));
	tileVersion.setF049(cleanToken(token));
	
	tileVersion.setF050(cleanToken(token));
	tileVersion.setF051(cleanToken(token));
	tileVersion.setF052(cleanToken(token));
	tileVersion.setF053(cleanToken(token));
	tileVersion.setF054(cleanToken(token));
	tileVersion.setF055(cleanToken(token));
	tileVersion.setF056(cleanToken(token));
	tileVersion.setF057(cleanToken(token));
	tileVersion.setF058(cleanToken(token));
	tileVersion.setF059(cleanToken(token));
	
	tileVersion.setF060(cleanToken(token));
	tileVersion.setF061(cleanToken(token));
	tileVersion.setF062(cleanToken(token));
	tileVersion.setF063(cleanToken(token));
	tileVersion.setF064(cleanToken(token));
	tileVersion.setF065(cleanToken(token));
	tileVersion.setF066(cleanToken(token));
	tileVersion.setF067(cleanToken(token));
	tileVersion.setF068(cleanToken(token));
	tileVersion.setF069(cleanToken(token));
	
	tileVersion.setF070(cleanToken(token));
	tileVersion.setF071(cleanToken(token));
	tileVersion.setF072(cleanToken(token));
	tileVersion.setF073(cleanToken(token));

	return tileVersion;
    }

    private String cleanToken(StringTokenizer token) {
	String val = "";
	if ( token.hasMoreTokens()) {
	    val = token.nextToken().replaceAll("\u0000", "");
	}
	return val;
    }

    public String transform(List<Tile> tiles) {
	log.debug("...starting to transform");
	
	Gson gson = new Gson();
	Docs docs = new Docs(tiles);
	
	String json = gson.toJson(docs);
	
	log.debug("...transform completed ...");
	
	return json;
    }
    
    public void writeFile(String str) throws IOException {
	mOutputFile = mDirectory + "BBY_DI_FULL.js";
	FileOutputStream fw = new FileOutputStream(mOutputFile);
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fw, "UTF-8"));
	
	log.debug("...starting to writeFile");
	try {
	    bw.write(str);
	    bw.flush();
	} finally {
	    bw.close();
	    log.debug("...writeFile completed ...");
	}
    }
    
    class Docs{
	private List<Tile> docs;
	
	Docs(List<Tile> tiles) {
	    docs = tiles;
	}
	
	public List<Tile> getDocs() {
	    return docs;
	}
    }
}
