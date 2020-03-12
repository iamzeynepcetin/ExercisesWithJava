/* *****
    ****
     ***
      **
       *
*/

class Array39{
	public static void main(String args[]) throws Exception{
		int n,i,k;
		System.out.println("ni giriniz");
		n=Keyboard.readInt();
		
		for(i=0;i<n;i++){
			for(k=1;k<=i;k++)
				System.out.print(" ");
			for(k=1;k<=n-i;k++)
				System.out.print("*");
			System.out.println();
		}
	}	
}
