package com.griffindor.dambldor;

import java.util.*;
import java.lang.*;
import java.io.*;


class Actor
{
	Map<String, Boolean> actorsState = new HashMap<String, Boolean>();
	
	public Actor() {
            actorsState.put("Harry", true); 
        }
        
        public void aboutAllActors() {
            System.out.println(actorsState.toString());
	}
	
	public void addActor(String name, Boolean isFree) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            actorsState.put(reader.readLine(),Boolean.parseBoolean(reader.readLine()));
				
	}
	
	public void removeActor(String name) {
                //do removing
	}
}
