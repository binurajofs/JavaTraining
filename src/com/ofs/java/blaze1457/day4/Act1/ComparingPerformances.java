 
public class ComparingPerformances {
    
    public static void forLoop(){
        int count =0;
        for(int i=1; i<=100000; i++){
            count++;
        }
    }
    public static void whileLoop(){
        int count = 0, i = 1;
        while(i<=100000){
            count++;
        }
    }
    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        
        ComparingPerformances.forLoop();
        System.out.println("Time taken for FOR LOOP to execute is :"+(System.currentTimeMillis()-startTime) + "ms");// Time Taken is 1ms
        startTime = System.currentTimeMillis();
        ComparingPerformances.whileLoop();
        System.out.println("Time taken for WHILE LOOP to execute is :"+(System.currentTimeMillis()-startTime) + "ms");// Time Taken is 1ms
        
        // There is much performance difference in executing for loop and while loop
    }
}

