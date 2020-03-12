//n klavyeden girilen pozitif sayi 1den nye kadar olan sayilarin toplamini ekrana yazdiran program

class Toplam{
	public static void main(String args[]) throws Exception{
	int i,n;
	int toplam=0;
	System.out.println("sayi girin");
	n=Keyboard.readInt();
	
  for(i=1;i<=n;i++)
		toplam+=i;
	System.out.println(toplam);
		
	}
}
