public class TrianglePattern4{
	public static void main(String[] args){
		int blank=5;
		while(i>=0){
			int j=4;
			while(j>=i){
				System.out.print(" ");
				j--;
			}
			int k=1;
			while(k<=(2*i-1)){
				if(k%2==0){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				k++;
			}
			System.out.println("");
			i--;
		}
	}
}