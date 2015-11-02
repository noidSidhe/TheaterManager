package com.griffindor.dambldor;

import java.util.*;
import java.lang.*;
import java.io.*;

class TheaterManager exteds Actor //сомнительно Никичан!
{

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
	
	public static void main (String[] args) throws java.lang.Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/*Actor[] actors = new Actor[9];
		for(int i=0;i<10;i++) {
			actors = new Actor(reader.readLine(),Boolean.parseBoolean(reader.readLine());
		*/
		System.out.println(getWorkTheater());
		TheaterManager manager = new TheaterManager();
		System.out.println(getWorkTheater());		
		manager.aboutAllActors();
		manager.run();


		

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
	
	public void run() {
		System.out.println("Вас приветствует программа управления актерами TheaterManager!");
		System.out.println(getWorkTheater());
		
	}

	