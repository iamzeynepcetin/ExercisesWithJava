//Klavyeden girilen 2 sayidan buyuk olani bulup ekrana yazdiran program

class HangisiBuyuk{
	public static void main(String args[]) throws Exception
	{
		int x, y;
		System.out.println("iki sayi giriniz");
		x=Keyboard.readInt();
		y=Keyboard.readInt();
		  
      if(x>y)
		    System.out.println("Buyuk sayi "+x);
		  else
		    System.out.println("Buyuk sayi "+y);
		
	}
}
