//klavyeden girilen 3 kenar uzunlugu ucgen olusturur mu yazan program

class Ucgen{
	public static void main(String args[]) throws Exception{
		int a,b,c;
		System.out.println("3 sayi girin: ");
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		c=Keyboard.readInt();
		if(a+b>c)
			if(a+c>b)
				if(b+c>a)
					System.out.println("ucgen olusturur");
				else
					System.out.println("olusturmaz");
			else
				System.out.println("olusturmaz");
		else
			System.out.println("olusturmaz");
	}
}
