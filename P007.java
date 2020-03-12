//Klavyeden girilen 2 sayinin birbirinin kati olup olmadigini ekrana yazdiran program

 class TamKati{
	public static void main(String args[]) throws Exception
	{
		int a, b;
		System.out.println("a ve b olarak 2 sayi gir");
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		  if(a%b==0)
		    System.out.println("tam kati");
		  else
		    System.out.println("tam kati degil");
		
	}
}
