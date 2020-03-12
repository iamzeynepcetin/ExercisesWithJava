//ikizkenar ucgen mi kontrolu yapan kod (eskenar ikizkenar kabul edilmeyecek)

class Ikizkenar{
	public static void main(String args[]) throws Exception{
		System.out.println("3 sayi giriniz");
		int a,b,c;
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		c=Keyboard.readInt();

		if(a==b)
			if(b!=c)
				System.out.println("ikizkenar");
			else
				System.out.println("degil");
		else
			if(b==c)
				System.out.println("ikizkenar");	
			else
				if(a==c)
					System.out.println("ikizkenar");
				else
					System.out.println("degil");
	}
}
