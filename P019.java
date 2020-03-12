//klavyeden girilen 3 farkli sayinin en buyugunu ekrana yazdiran program

class EnBuyuk{
	public static void main(String args[]) throws Exception{
		System.out.println("3 sayi giriniz");
		int a,b,c;
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		c=Keyboard.readInt();
		
		if(a>b)
			if(a>c)
				System.out.println("en buyuk "+a);
			else
				System.out.println("en buyuk "+c);
		else
			if(b>c)
				System.out.println("en buyuk "+b);
			else
				System.out.println("en buyuk "+c);
	}
}
