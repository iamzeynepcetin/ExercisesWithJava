//klavyeden girilen sayiyi basamaklarina ayirip diziye atayan program 7235 ise dizi 5327 olacak
class While9{
	public static void main (String args[])throws Exception{
		int a[]=new int[10];
		int i,n,p;
		System.out.println("sayi gir");
		n=Keyboard.readInt();
		
		p=0;
		while(n!=0){
		a[p]=n%10;
		p++;
		n=n/10;
		}
	
		for(i=0;i<p;i++)
		System.out.println(a[i]);
		
	}
}