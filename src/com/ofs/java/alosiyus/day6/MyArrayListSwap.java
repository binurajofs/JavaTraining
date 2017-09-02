package com.ofs.java.alosiyus.day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class MyArrayListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Details> list = new ArrayList<Details>();
		System.out.println("Enter the numbers to swap");
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
        list.add(new Details("num1",x));
        list.add(new Details("num2",y));
        
        Collections.sort(list,new MyComp());
        System.out.println("Swaped list entries: ");
        for(Details e:list){
            System.out.println(e);
            s.close();
        }
	}

}
class MyComp implements Comparator<Details>{
	 
    @Override
    public int compare(Details e1, Details e2) {
        if(e1.getSalary() < e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Details{
     
    private String name;
    private int Marks;
     
    public Details(String n, int s){
        this.name = n;
        this.Marks = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return Marks;
    }
    public void setSalary(int salary) {
        this.Marks = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Marks: "+this.Marks;
    }
}
