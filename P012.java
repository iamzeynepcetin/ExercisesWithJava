//klavyeden 0 ile 1000 arasinda girilen sayinin basamak sayisini yazdiran program

class Basamak{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Sayi Giriniz : ");
		int n = Keyboard.readInt();
		if(n <= 1000)
			if(n >= 100)
				System.out.println("Sayi 3 Basamakli");
			else
				if (n >= 10)
					System.out.println("Sayi 2 Basamakli");
				else
					if(n > 0)
						System.out.println("Sayi 1 Basamakli");
	}
}
