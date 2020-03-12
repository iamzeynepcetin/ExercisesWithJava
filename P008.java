//Klavyeden girilen sayinin mutlak degerini ekrana yazdiran program

 class MutlakDeger{
	public static void main(String args[]) throws Exception
	{
		int a;
		System.out.println("sayi gir");
		a=Keyboard.readInt();
		  if(a<0)
		    System.out.println("mutlak degeri= "+(-a));
		  else
        System.out.println("mutlak degeri= "+a);

	}
}
