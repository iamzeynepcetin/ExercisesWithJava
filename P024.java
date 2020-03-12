//n klavyeden girilen pozitif bir sayidir 1den n e kadar olan sayilari ekrana yazdiran program

class GirilenSayi{
	public static void main(String args[]) throws Exception{
	int n,i;
	System.out.println("sayi girin");
	n=Keyboard.readInt();
	 
    for(i=1;i<=n;i++)
		  System.out.println(i);
	}
}
