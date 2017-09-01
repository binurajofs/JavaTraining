public class TrianglePattern5{
	public static void main(String[] args){
		int blank=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=1; k<=blank;k++){
				System.out.print(" ");
			}
			for(int a=1;a<=i;a++){
				System.out.print("*");
			}
			System.out.println("");
			blank=blank-2;
		}
	}
}