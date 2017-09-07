      
package com.ofs.java.soma.day6.thread;



  class Task extends Thread{
	
	public static int i=0;
	public void run()
	{
		while(i<10)
			try {
				System.out.println("Value is:"+i);
				i++;
			}catch(Exception ae)
		{
				System.out.println("Error");
		}
	}
}
	 public class Task1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Task t = new Task();
         t.start();
	}

}
