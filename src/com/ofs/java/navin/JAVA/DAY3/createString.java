public class createString{
	public static void main(String[] args){
		//First method to create String object
		String s1 = "Wish you";
		//Second method to create String object
		char[] ch = {'G','o','o','d'};
		String s2 = new String(ch);
		// Third method to create String Object
		String s3 = new String("Day");
		//Displaying so created strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}