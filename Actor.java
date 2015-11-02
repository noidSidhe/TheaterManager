package com.griffindor.dambldor;

import java.util.*;
import java.lang.*;
import java.io.*;


class Actor
{
	Map actorsMap<String, Boolean> = new HashMap<String, Boolean>();
	actorsMap.put("Гарри Поттер", true; "Рон Уизли", true; "Гермиона Грейджер", true); //test 
	
	/*private String name;
	private Boolean isFree;
	
	public Actor(String name, Boolean isFree) {
		this.name = name;
		this.isFree = isFree;
	}
	
	public void setIsFree(Boolean isFree) {
		this.isFree = isFree;
	}
	public Boolean sgetIsFree() {
		return isFree;
	}
	*/
	
	public void aboutAllActors() {
		System.out.println(actorsMap.toString());
	}
	
	public void addActor(String name, Boolean isFree) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		actorsMap.put(reader.readLine(),Boolean.parseBoolean(reader.readLine()));
				
	}
	
	public void removeActor(String name) {
		/*Scanner sc = new Scanner(System.in);
		Sytem.out.println("Введите имя увольняемого актера: ");
		String line = sc.nextLine();
		if (map.equals(null)) 
			System.out.println();
			return;
		else {
			
		}*/
	}
}
