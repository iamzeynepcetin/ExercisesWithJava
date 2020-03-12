/*artarak giden yildiz deseni:*
                              **
                              ***
                              ****
			      *****
*/

class Array36{
	public static void main(String args[]) throws Exception{
		int i , n ,k;
		System.out.println("n giriniz");
		n=Keyboard.readInt();
		for(i=0;i<n;i++){
			for(k=0;k<i+1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
