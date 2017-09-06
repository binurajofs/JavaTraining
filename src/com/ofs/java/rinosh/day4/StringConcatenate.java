package com.ofs.java.rinosh.day4;

public class StringConcatenate {

	public static void main(String[] args) {
		// + Operator Performance ***************************************
		String str = null;
		long time1 = System.currentTimeMillis();
		long freeMemory1 = Runtime.getRuntime().freeMemory();
		for (int i = 0; i < 100000; i++) {
			str = "Hi";
			str = str + " Bye";
		}
		long time2 = System.currentTimeMillis();
		long freeMemory2 = Runtime.getRuntime().freeMemory();
		long timetaken1 = time2 - time1;
		long memorytaken1 = freeMemory1 - freeMemory2;
		System.out.println("*********************");
		System.out.println("+ Operator:");
		System.out.println("Time taken= " + timetaken1 + " ms");
		System.out.println("Memory consumed= " + memorytaken1 + " bytes");
		

		// Concat method Performance *************************************
		String str1 = null;
		long time3 = System.currentTimeMillis();
		long freeMemory3 = Runtime.getRuntime().freeMemory();
		for (int j = 0; j < 100000; j++) {
			str1 = "Hi";
			str1 = str1.concat(" Bye");
		}
		long time4 = System.currentTimeMillis();
		long freeMemory4 = Runtime.getRuntime().freeMemory();
		long timetaken2 = time4 - time3;
		long memorytaken2 = freeMemory4 - freeMemory3;
		System.out.println("*********************");
		System.out.println("Concat method:");
		System.out.println("Time taken= " + timetaken2 + " ms");
		System.out.println("Memory consumed= " + memorytaken2 + " bytes");
		
		
		// StringBuffer method Performance ********************************
		StringBuffer tmp=new StringBuffer("");
		long time5 = System.currentTimeMillis();
		long freeMemory5 = Runtime.getRuntime().freeMemory();
		for (int j = 0; j < 100000; j++) {
			tmp.append("Hi");
			tmp.append(" Bye");
		}
		long time6 = System.currentTimeMillis();
		long freeMemory6 = Runtime.getRuntime().freeMemory();
		long timetaken3 = time6 - time5;
		long memorytaken3 = freeMemory5 - freeMemory6;
		System.out.println("*********************");
		System.out.println("StringBuffer method:");
		System.out.println("Time taken= " + timetaken3 + " ms");
		System.out.println("Memory consumed= " + memorytaken3 + " bytes");
		
		
		// StringBuilder method Performance ********************************
		StringBuilder tmp1=new StringBuilder("");
		long time7 = System.currentTimeMillis();
		long freeMemory7 = Runtime.getRuntime().freeMemory();
		for (int j = 0; j < 100000; j++) {
			tmp1.append("Hi");
			tmp1.append(" Bye");
		}
		long time8 = System.currentTimeMillis();
		long freeMemory8 = Runtime.getRuntime().freeMemory();
		long timetaken4 = time8 - time7;
		long memorytaken4 = freeMemory7 - freeMemory8;
		System.out.println("*********************");
		System.out.println("StringBuilder method:");
		System.out.println("Time taken= " + timetaken4 + " ms");
		System.out.println("Memory consumed= " + memorytaken4 + " bytes");

	}

}
