//Klavyeden s ve n giriliyor dizinin s nolu elemanindan baslayarak n adet elemanini ekrana yazdiran program

class Dizi4{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int n,s,i;
	int size=10;
	System.out.println("s ve n gir: ");
	s=Keyboard.readInt();
	n=Keyboard.readInt();
	
	for(i=s;i<s+n;i++)
		System.out.print(a[i]+" ");
	}
}
