package com.ofs.java.soma.day4;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Concatenate using + operator...
		String name1= "Soma";
		String name2= "Sundaresh";
		
		System.out.println("Using '+' operator :"+(name1+" "+name2));
         		
        //Concatenate using concat keyword...
		System.out.println("Using concat keyword :"+name1.concat(name2));
		
		//Concatenate using StringBuffer...
		StringBuffer s = new StringBuffer(15);
		s.append(name1).append(" ").append(name2);
		System.out.println("Using StringBuffer :"+s.toString());
		
		//Concatenate using StringBuilder...
		StringBuilder ss = new StringBuilder(15);
		ss.append(name1).append(" ").append(name2);
		System.out.println("Using StringBuilder :"+ss.toString());
	}

}
