package theatermanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nikita
 */
public class Spectacle {
    
    Map<String, Integer> specs = new HashMap<String, Integer>();
	
    public Spectacle() {
        specs.put("Novela Harry Potter", 5); 
    }
        
    public void aboutSpectacles() {
        System.out.println(specs.toString());
    }
	
    public void addSpectacle(String name, Integer numberOfActors) throws IOException {
        specs.put(name,numberOfActors);			
    }
	
    public void removeSpectacle(String name) {
        //do removing
    }
}
