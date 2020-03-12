//klavyeden s ve n giriliyor dizinin s nolu elemanindan baslayarak n adet elemanini kendi icinde bir one kaydiran program
//NE NEREYE ?

class Dizi8{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int size,i,n,s,temp;
	size=10;
	
	System.out.println("s ve ni gir ");
	s=Keyboard.readInt();
	n=Keyboard.readInt();
	
	temp=a[s];
	
	for(i=s+1;i<s+n;i++)
		a[i-1]=a[i];	
	a[s+n-1]=temp;
	
	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");
	}
}
