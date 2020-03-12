//klavyeden a ve b giriliyor a bden kucuk. a dan bye kadar olan sayilari ekrana yazdiran program

class EkranaYaz{
	public static void main(String args[]) throws Exception{
	int a,b;
	System.out.println("Iki sayi gir ");
	a=Keyboard.readInt();
	b=Keyboard.readInt();
		
    for(int i=a; i<=b;i++)
		  System.out.println(i);
	}
}
