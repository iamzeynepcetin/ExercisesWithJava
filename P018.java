//Klavyeden girilen notun harf karsiligini ekrana yazdiran program

class HarfNotu{
	public static void main(String args[]) throws Exception{
	System.out.println("notu giriniz");
	int n=Keyboard.readInt();
	if(n>80)
		System.out.println("A");
	else
		if(n>60)
			System.out.println("B");
		else
			if(n>40)
			 	System.out.println("C");
			else
				if(n>20)
					System.out.println("D");
				else
					System.out.println("E");
	}
}
