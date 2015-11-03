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
        specs.put("Novela 1", 2);
        specs.put("Novela 2", 3);
        specs.put("Novela 3", 5);
    }
        
    public void aboutAllSpectacles() {
        System.out.println(specs.toString());
    }
	
    public void addSpectacle(String name, Integer numberOfActors) throws IOException {
        specs.put(name,numberOfActors);			
    }
	
    public void removeSpectacle(String name) {
        specs.remove(name);
    }
    
    public void changeSpec(String name, Integer num) {
        specs.put(name,num);
    }
}
