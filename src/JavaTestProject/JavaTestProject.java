package JavaTestProject;

import java.util.Scanner;

/* This simply program will show you 
 * how many months, days, hours, 
 * minutes, seconds you have */

public class JavaTestProject {

	public static void main(String[] args) {

	// zadeklarowanie zmiennych
		String name, surname;
		int age;
		int month;
		int day;
		int hour;
		int minute;
		int second;
		
	// pobranie danych od uzytkownika
		Scanner scanName = new Scanner(System.in);
        System.out.println("What's your name?");
        name = scanName.nextLine();
        
		Scanner scanSurname = new Scanner(System.in);
        System.out.println("What's your surname?");
        surname = scanSurname.nextLine();
        
		Scanner scanAge = new Scanner(System.in);
        System.out.println("How old are you?");
        age = scanAge.nextInt();
        
	// obliczenia
       month = age * 12;
       day = age * 365;
       hour = age * (365 * 24);
       minute = age * (365 * 24 * 60);
       second = age * (365 * 24 * 60 * 60);
        
        System.out.println("Hi " + name + " " + surname + "!");
        System.out.println("You are " + age + " years old ");
        System.out.println(",so you have approximately: ");
        System.out.println(month + " months" + ",");
        System.out.println(day + " days" + ",");
        System.out.println(hour + " hours" + ",");
        System.out.println(minute + " minutes" + ",");
        System.out.println(second + " seconds" + ".");
	}

}
