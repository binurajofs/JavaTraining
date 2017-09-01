public class LoopsPerformance{
	public static void main(String[] args){
		long count=0;
		long now=System.currentTimeMillis();
		// this method shows the performance of for loop
		for(int i=0;i<9999999;i++){
			count=System.currentTimeMillis();
			count+=i;
			count--;
		}
		System.out.println("Performance of for loop is:"+(System.currentTimeMillis()-now)+"ms");
		count=0;
		int array[]=new int[9999999];
		for(int i=0;i<9999999;i++){
			array[i]=i;
		}
		now=System.currentTimeMillis();
		// this method shows the performance of for each loop
		for(int i:array){
			count=System.currentTimeMillis();
			count+=i;
			count--;
			
		}
		System.out.println("Performance of for each loop is:"+(System.currentTimeMillis()-now)+"ms");
		count=0;
		now=System.currentTimeMillis();
		// this method shows the performance of for each loop
		int i=0;
		while(i<9999999){
			count=System.currentTimeMillis();
			count+=i;
			count--;
			i++;
		}
		System.out.println("Performance of while loop is:"+(System.currentTimeMillis()-now)+"ms");
		count=0;
		now=System.currentTimeMillis();
		// this method shows the performance of do while loop
		i=0;
		do{
			count=System.currentTimeMillis();
			count+=i;
			count--;
			i++;
		}while(i<9999999);
		System.out.println("Performance of while loop is:"+(System.currentTimeMillis()-now)+"ms");
	
	}
}