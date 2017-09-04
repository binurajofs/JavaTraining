public class StringConcatenating{
	public static void main(String[] args){
		long now=System.currentTimeMillis();
		//Concatenation using + operator
		String s1="";
		for(int i=0;i<100000;i++){
			s1+="*";
		}
		System.out.println("performance of + operator is"+ (System.currentTimeMillis()-now)+"ms");
		// Concatenation using concat()
		now=System.currentTimeMillis();
		String s2="";
		for(int i=0; i<100000;i++){
			s2=s2.concat("*");
		}
		System.out.println("performance of concat  is"+ (System.currentTimeMillis()-now)+"ms");
		// Concatenation using StringBuffer
		now=System.currentTimeMillis();
		String s3="";
		StringBuffer tmp=new StringBuffer(s3);
		for(int i=0; i<100000;i++){
			tmp.append("*");
		}
		System.out.println("performance of StringBuffer is"+ (System.currentTimeMillis()-now)+"ms");
		// concatenation using StringBuilder		
		now=System.currentTimeMillis();

		 String s4="";
		StringBuilder temp =new StringBuilder(s4);
		for(int i=0;i<100000;i++){
			temp.append("*");
		}
		System.out.println("performance of stringbuilder  is"+ (System.currentTimeMillis()-now)+"ms");
	}
}