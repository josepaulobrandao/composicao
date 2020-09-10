package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) throws ParseException { 
		
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Client cli = new Client("Maria", "Maria@gmail.com", sdf.parse("20/10/1995"));
				
		System.out.println(cli);
				
		scanner.close();

	}

}
