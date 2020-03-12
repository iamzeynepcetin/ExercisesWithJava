//klavyeden a ve b giriliyor a bden kucuk a bye esit a bden buyuk olabilir 
//her durumda adan bye kadar olan sayilari ekrana yazdiran program

class EkranaYaz2{
	public static void main(String args[]) throws Exception{
	int a,b,i;
	System.out.println("2 sayi gir");
	a=Keyboard.readInt();
	b=Keyboard.readInt();
	
	if(a<=b)
		for(i=a;i<=b;i++)
		  System.out.println(i);
	else
		for(i=a;i>=b;i--)
		  System.out.println(i);
	}
}
