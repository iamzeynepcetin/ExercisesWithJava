/*klavyeden s ve n giriliyor 
dizinin s nolu elemanindan baslayarak n adet elemanini kendi icinde tersine ceviren program*/

class Array22{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int i,temp;
	int size=10;
	int s,n;
	System.out.println("s yi gir: ");
	s=Keyboard.readInt();
	System.out.println("n yi gir: ");
	n=Keyboard.readInt();
	
	for(i=0;i<n/2;i++){
		temp=a[s+i];
		a[s+i]=a[s+n-1-i];
		a[s+n-1-i]=temp;
	}
	
	for(i=0;i<size;i++)
		System.out.println(a[i]);
	}
}
