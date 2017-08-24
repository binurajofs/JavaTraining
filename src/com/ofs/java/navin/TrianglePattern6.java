public class TrianglePattern6{
	public static void main(String[] args){
		int blank=0;
		for(int i=4;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			for(int k=blank; k>=1;k--){
				System.out.print(" ");
			}
			for(int a=i;a>=1;a--){
				System.out.print("*");
			}
			System.out.println("");
			blank=blank+2;
		}
	}
}