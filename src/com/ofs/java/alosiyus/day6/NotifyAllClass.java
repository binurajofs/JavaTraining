package com.ofs.java.alosiyus.day6;
class AClass extends Thread{
AClass a;
public void get(AClass a){
   this.a=a;
}
public void run(){
   System.out.println("one");
   synchronized (a) {
       try{
           a.wait();
           System.out.println("one wake up");
           this.wait();
       }catch(Exception e){
           System.out.println(e);
       }
   }
}
    }
class BClass extends Thread{
AClass a;
public void get(AClass a){
    this.a=a;
}
public void run(){
    System.out.println("two");
    synchronized (a) {
        try{
            a.wait();
            System.out.println("two wake up");
        }catch(Exception e){
            System.out.println(e);
        }
    }
 }
     }
class CClass extends Thread{
AClass a;
public void get(AClass a){
    this.a=a;
}
public void run(){
    synchronized (a) {
        a.notifyAll();
        System.out.println("NotifyAll");
    }
}
    } 
public class NotifyAllClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass a=new AClass();
	    BClass b=new BClass();
	    CClass c=new CClass();
	    a.get(a);
	    a.start();
	    b.get(a);
	    b.start();
	    c.get(a);
	    c.start();
	}

}
