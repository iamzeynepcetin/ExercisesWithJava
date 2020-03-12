
class Array42{
	public static void main(String args[]) throws Exception{
		int n,i,k;
		System.out.println("ni giriniz");
		n=Keyboard.readInt();
		
		for(i=1;i<=n;i++)
			if((i)%(n-1)==1){
				for(k=1;k<n;k++)
					System.out.print("*");	
				System.out.println();
			}
			else{
				System.out.print("*");
				for(k=1;k<=n-2;k++)
					System.out.print(" ");
				System.out.print("*");
				System.out.println();
			}
	}
}
