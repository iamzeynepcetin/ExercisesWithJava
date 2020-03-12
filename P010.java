//a ile b arasindaki buyukluk iliskisini ekrana yazdiran program

class BuyuklukIliski{
	public static void main(String args[]) throws Exception{
		int a,b;
		System.out.println("2 sayi giriniz");
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		
    if(a>b)
			System.out.println(a+" buyuktur " +b);
		else
			if(a==b)
				System.out.println(a+" esittir "+b);
			else
				System.out.println(b+ " buyuktur "+a);
		
	}
}
