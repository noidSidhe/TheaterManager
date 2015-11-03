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

public class TheaterManager extends Actor{

    private Boolean workTheater = false;

    
    Actor act = new Actor();
    Spectacle spect = new Spectacle();
    

                
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
                editActor();
                break;
            case "edit spectacles":
                editSpectavcles();
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
        //System.out.println("");
        act.aboutAllActors();
        spect.aboutAllSpectacles();
        
        
    }
    
    public void editActor() throws IOException {
        System.out.print("Введите имя изменяемого актера: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.print("Введите показатель его занятости (true - свободен; false - занят): ");
        Boolean bool = sc.nextBoolean();
        act.changeEmployment(line,bool);
    }
    
    public void editSpectavcles() {
        System.out.print("Введите имя изменяемого спектакля: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.print("Введите колличество актеров для этого спектакля: ");
        Integer num = sc.nextInt();
        spect.changeSpec(line, num);
    }
    
    public void rule() {
        System.out.println("ruling...");
        Iterator 
    }
	
	public static void main (String[] args) throws java.lang.Exception {
                
		TheaterManager manager = new TheaterManager();
                
                
                System.out.println("Вас привествует программа TheaterManager");
                System.out.println("Добро пожаловать в командную строку!");
                System.out.println("Для получения справки введите help");
               
                manager.run();
                
	}	

 
}
    

