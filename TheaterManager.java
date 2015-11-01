package com.griffindor.dambldor;

import java.util.*;
import java.lang.*;
import java.io.*;

class TheaterManager exteds Exception
{

	public static Boolean workTheater = True;

	public static void main (String[] args) throws java.lang.Exception
	{


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Actor[] actors = new Actor[9];
		for(int i=0;i<10;i++) {
			actors = new Actor(reader.readLine(),Boolean.parseBoolean(reader.readLine());
		}

		//вызов freeChange на каждом актере все время пока работает театр
		while (True) {
			if (workTheater == False)
				break;

			try {
				for (int i=0;i<actors.lenght;i++) {
					actors[i].freeChange(Date currentDate);
				}
			} catch (IOException e) {
				e.getStackTrace;
			}

			//Tom part
			Spectacle[] spectacles;
			for(int i=0; i<3;i++){
				spectacles = new Spectacle(
					Date.parseDate(reader.readLine()),
					Date.parseDate(reader.readLine()),
					Integer.parseInt(reader.readLine),
					reader.readLine()
				);
	}
}
