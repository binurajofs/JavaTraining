package com.ofs.java.kannan.database;

import java.util.Scanner;

public class DbActions {

	public static void main(String[] args) {
		DbConnectivity dbConnectivity = new DbConnectivity();
		//dbConnectivity.createTable();
		//dbConnectivity.insertData("Maths", 90);
		//dbConnectivity.display();
		String subject="";
		int marks;
		Scanner in = new Scanner(System.in);
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
				System.out.println("Enter the Subject Name");
				subject=in.next();
				System.out.println("Enter the Mark");
				marks = in.nextInt();
				dbConnectivity.insertData(subject, marks);
				break;
			case 2:
				System.out.println("Enter the Subject Name");
				subject=in.next();
				System.out.println("Enter the Updated Mark");
				marks = in.nextInt();
				dbConnectivity.updateMark(subject, marks);
				break;
			case 3:
				System.out.println("Enter the Subject Name to be deleted");
				subject=in.next();
				dbConnectivity.deleteMark(subject);
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
