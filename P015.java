//eskenar ucgen mi kontrolu yapan program

class Eskenar {
	public static void main(String args[]) throws Exception{
		System.out.println("3 sayi giriniz");
		int a,b,c;
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		c=Keyboard.readInt();
		
		if(a==b)
			if(b==c)
				System.out.println("eskenar");
			else
				System.out.println("degil");
		else
			System.out.println("degil");
	}
}
	
