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
        actorsState.put("Ron", true);
        actorsState.put("Germiona", true);
        actorsState.put("Volondemort", true);
        actorsState.put("Dumbledor", true);
    }
        
    public void aboutAllActors() {
        System.out.println(actorsState.toString());
    }
	
    public void addActor(String name) throws IOException {
        actorsState.put(name,true);			
    }

    public void removeActor(String name) {
        actorsState.remove(name);
    }
    
    public void changeEmployment(String name, Boolean isFree) {
        actorsState.replace(name, isFree);
    }
}
