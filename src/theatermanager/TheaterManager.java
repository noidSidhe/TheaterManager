package theatermanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Nikita
 */

public class TheaterManager {

    private Boolean workTheater = false;

    public void setWorkTheater(Boolean workTheater) {
        this.workTheater = workTheater;
    }
    public Boolean getWorkTheater() {
	return workTheater;
    }

    public TheaterManager() {
        setWorkTheater(true);
    }
        
    public void run() {
	System.out.println("running...");
    }
	
	public static void main (String[] args) throws java.lang.Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                
		TheaterManager manager = new TheaterManager();
                Actor act = new Actor();
                Spectacle spect = new Spectacle();
		
                manager.run();
                
               
                
	}	
}
    

