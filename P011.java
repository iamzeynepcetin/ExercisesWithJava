//klavyeden girilen sayinin 0 le 100 arasinda olup olmadigini ekrana yazdiran program 0 ve 100 dahil degil

class True{
	public static void main(String args[]) throws Exception{
		int n;
		System.out.println("sayi gir");
		n=Keyboard.readInt();
		
		if(n>0)
			if(n<100)
				System.out.println(n+", 0 ile 100 arasinda");
			else
				System.out.println("degil");
		else
			System.out.println("degil");
	}
}
