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

    public Boolean getWorkTheater() {
        return workTheater;
    }
    
    public void setWorkTheater(Boolean workTheater) {
        this.workTheater = workTheater;
    }
    
    public TheaterManager() {
        setWorkTheater(true);
    }
        
    public void run() throws IOException {
      while(getWorkTheater() == true) {
        System.out.print("command >>>");
        Scanner sc = new Scanner(System.in);
        String comand = sc.nextLine();
        switch(comand) {
            case "help":
                System.out.println("Список поддерживаемых команд:");
                System.out.println("info - выводит список всех актеров и спектаклей");
                System.out.println("edit actors - отредактировать актеров");
                System.out.println("edit spectacles - отредактировать расписание спектаклей");
                System.out.println("rule - выполнить распределение актеров по спектаклям");
                System.out.println("quit - покинуть приложение");
                break;
            case "info":
                info();
                break;
            case "edit actors":
                break;
            case "edit spectacles":
                break;
            case "rule":
                rule();
                break;
            case "quit":
                setWorkTheater(false);
                break;
            default:
                break;
        }
      }  
    }
    
    public void info() {
        System.out.println("info here...");  
    }
    
    public void rule() {
        System.out.println("ruling...");
    }
	
	public static void main (String[] args) throws java.lang.Exception {
                
		TheaterManager manager = new TheaterManager();
                Actor act = new Actor();
                Spectacle spect = new Spectacle();
                
                System.out.println("Вас привествует программа TheaterManager");
                System.out.println("Добро пожаловать в командную строку!");
                System.out.println("Для получения справки введите help");
               
                manager.run();
                
	}	
}
    

