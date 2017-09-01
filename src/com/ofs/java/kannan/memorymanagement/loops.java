package com.ofs.java.kannan.memorymanagement;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		for(int i=1;i>=0;i++) {
			System.out.println(i);
			if(i==1000000) {
				break;
			}
		}
		while(j>0) {
			System.out.println(j);
			if(j==1000000) {
				break;
			}
		}
		
	}

}
