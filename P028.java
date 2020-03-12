//n klavyeden girilen pozitif bir sayidir 
//n cift ise 0 dan nye kadar olan cift sayilari tek ise 1den nye tek sayilari yazdir

class TekCift{
	public static void main(String args[]) throws Exception{
	int i,n;
	System.out.println("sayi giriniz");
	n=Keyboard.readInt();
	
	if(n%2==0)
		for(i=0;i<=n;i=i+2)
			System.out.println(i);
	else
		for(i=1;i<=n;i=i+2)
			System.out.println(i);
	}
}

/*	for(i=n%2;i<=n;i=i+2)
		System.out.println(i);
*/
