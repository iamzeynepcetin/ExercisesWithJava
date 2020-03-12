//klavyeden a ve b giriliyor a bden kucuk a ile bnin arasindaki 5in katlarini ekrana yazdiran program
//a b dahil degil

class Bes{
	public static void main(String args[]) throws Exception{
		int i,a,b;
		System.out.println("iki sayi girin");
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		
    for(i=a+1;i<b;i++)
			if(i%5==0)
				System.out.println(i);
	}
}

/*		
	for(int i=a+(5-a%5);i<b;i=i+5)
		System.out.println(i);
*/ 
