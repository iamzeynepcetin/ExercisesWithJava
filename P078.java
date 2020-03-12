/*   *
    ***
   *****
*/
class Array40{
	public static void main(String args[]) throws Exception{
		int n,i,k;
		System.out.println("ni giriniz");
		n=Keyboard.readInt();
		
		for(i=1;i<=n;i=i+2){
			for(k=1;k<=(n-i)/2;k++)
				System.out.print(" ");
			for(k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
			
