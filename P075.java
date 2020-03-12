/*Azalan ucgen cizimi:*****
		      ****
		      ***
		      **
                      *
*/

class Array37{
	public static void main(String args[]) throws Exception{
		int i,k,n;
		System.out.println("n i gir");
		n=Keyboard.readInt();
		for(i=0;i<n;i++){
			for(k=n-i;k>0;k--)
				System.out.print("*");
			System.out.println();
		}
	}
}
