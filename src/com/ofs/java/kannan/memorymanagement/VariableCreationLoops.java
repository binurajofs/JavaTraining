package com.ofs.java.kannan.memorymanagement;
public class VariableCreationLoops {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		for(long i=0;i<1000000000;i++) {
			long n=i;
			long k=i;
			long j=i;
			long l=i;
			}
		System.out.println(System.currentTimeMillis());
		long n;
		long k;
		long j;
		long l;;
		
		for(long i=0;i<1000000000;i++) {
			n=i;
			k=i;
			j=i;
			l=i;
		}
		System.out.println(System.currentTimeMillis());
		
		for(long i=0;i<1000000000;i++) {
			VariableCreationLoops obj = new VariableCreationLoops();
		}
		System.out.println(System.currentTimeMillis());
		
	}

}
