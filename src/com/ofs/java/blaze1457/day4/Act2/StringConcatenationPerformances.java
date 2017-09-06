
public class StringConcatenationPerformances {
    
    public static void stringConcateUsingOperator(){
        String str1 = "Hello ", str2 = "Frontians!";
        for(int count=1; count<=10000; count++){
            str1 = str1+str2;
        }
    }    
    
    public static void stringConcateUsingConcat(){
        String str1 = "Hello ", str2 = "Frontians!";
        for(int count=1; count<=10000; count++){
            str1.concat(str2);
        }
    }    
    public static void stringConcateUsingStringBuffer(){
        StringBuffer str1 = new StringBuffer("Hello ");
        String str2 = "Frontians!";
        for(int count=1; count<=10000; count++){
            str1.append(str2);
        }
    }    
    public static void stringConcateUsingStringBuilder(){
        StringBuilder str1 = new StringBuilder("Hello ");
        String str2 = "Frontians!";
        for(int count=1; count<=10000; count++){
            str1.append(str2);
        }
    }        
    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        stringConcateUsingOperator();
        System.out.println("Time Taken for concatenation using '+' operator is: "+(System.currentTimeMillis()-startTime)+"ms");    // time taken is 1839ms
        startTime = System.currentTimeMillis();
        stringConcateUsingConcat();
        System.out.println("Time Taken for concatenation using concat is: "+(System.currentTimeMillis()-startTime)+"ms"); // time taken is 3ms
        startTime = System.currentTimeMillis();
        stringConcateUsingStringBuffer();
        System.out.println("Time Taken for concatenation using StringBuffer is: "+(System.currentTimeMillis()-startTime)+"ms"); // time taken is 2ms
        startTime = System.currentTimeMillis();
        stringConcateUsingStringBuilder();
        System.out.println("Time Taken for concatenation using StringBuilder is: "+(System.currentTimeMillis()-startTime)+"ms"); // time taken is 1ms
    }
}

