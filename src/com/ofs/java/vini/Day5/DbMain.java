package com.ofs.java.vini.Day5;

import java.util.Scanner;

public class DbMain extends DbConnectivity  {

	private static Scanner in;

	
	public static void main(String[] args) {
		DbConnectivity dbConnectivity = new DbConnectivity();
		
		String name="";
		int id=0;
		in = new Scanner(System.in);
		boolean exit=false;
		do {
			System.out.println("Enter Value");
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Update");
			System.out.println("Press 3 for Delete");
			System.out.println("Press 4 for Display");
			System.out.println("Press 5 to exit");
			int response=in.nextInt();
			
			switch(response) {
			case 1:
				System.out.println("Enter the  Name");
			     name=in.next();
				System.out.println("Enter the ID");
				id = in.nextInt();
				dbConnectivity.insertData(name, id);
				break;
			case 2:
				System.out.println("Enter the Name");
				name=in.next();
				System.out.println("Enter the Updated ID");
				id = in.nextInt();
				dbConnectivity.updateMark(name, id);
				break;
			case 3:
				System.out.println("Enter the Subject Name to be deleted");
				name=in.next();
				dbConnectivity.deleteMark(name);
				break;
			case 4:
				dbConnectivity.display();
				break;
			case 5:
				exit=true;
				try {
				dbConnectivity.connection.close();
				}
				catch(Exception e) {
					System.out.println(e.toString());
				}
				break;
			default:
				System.out.println("Enter a valid Number");
				break;
			}
		}while(!exit);
		/*dbConnectivity.batchInsert();
		dbConnectivity.display();*/
		
	}

}