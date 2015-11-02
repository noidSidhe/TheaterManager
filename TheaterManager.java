package com.griffindor.dambldor;

import java.util.*;
import java.lang.*;
import java.io.*;


class TheaterManager {

	private Boolean workTheater = false;
	
	public void setWorkTheater(Boolean workTheater) {
		this.workTheater = workTheater;
	}
	
	public Boolean getWorkTheater() {
		return workTheater;
	}
	
	public TheaterManager() {
            getWorkTheater();
            setWorkTheater(true);
            getWorkTheater();    
	}
        
        public void run() {
		System.out.println("running...");
	}
	
	public static void main (String[] args) throws java.lang.Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                
		TheaterManager manager = new TheaterManager();
		manager.run();
               // Actor act = new Actor();
			//Tom part
			/*Spectacle[] spectacles;
			for(int i=0; i<3;i++){
				spectacles = new Spectacle(
					Date.parseDate(reader.readLine()),
					Date.parseDate(reader.readLine()),
					Integer.parseInt(reader.readLine),
					reader.readLine()
				);*/
			//end
	}	
}
	