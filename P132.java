//klavyeden girilen x ve nye gore belirtilen serinin toplamini ekrana yazdiran program
class Calisma20{
	public static void main(String args[])throws Exception{
	int i,n,x;
	System.out.println("x gir");
	x=Keyboard.readInt();
	System.out.println("n gir");
	n=Keyboard.readInt();
	double pay=x;
	double payda=1;
	double deger=1;
	
	for(i=1;i<=n;i++){
		pay*=(x+i);
		payda*=i*(i*2-1)*(i*2);
			if(i%2==0)
			deger+=pay/payda;
			else
			deger-=pay/payda;
	System.out.println(deger);
		
	}
	
	}
}
		
	