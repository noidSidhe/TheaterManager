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
public class Actor {
    
    Map<String, Boolean> actorsState = new HashMap<String, Boolean>();
	
    public Actor() {
        actorsState.put("Harry", true); 
    }
        
    public void aboutAllActors() {
        System.out.println(actorsState.toString());
	}
	
    public void addActor(String name, Boolean isFree) throws IOException {
        actorsState.put(name,isFree);			
    }

    public void removeActor(String name) {
        //do removing
    }
}
