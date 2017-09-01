public class TrianglePattern2{
	public static void main(String[] args){
		int i=0;
		while(i<=5){
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
			i++;
		}
	}
}