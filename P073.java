//klavyeden girilen nye gore belirtilen deseni(nxn) ekrana bastiran program 

class Array35{
	public static void main(String args[]) throws Exception{
		int i, n, k ;
		System.out.println("n degeri gir");
		n=Keyboard.readInt();
		for(i=0;i<n;i++){
			for(k=0;k<n;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
