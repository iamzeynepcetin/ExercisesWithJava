//2.dizi yardimiyla a dizisini n defa kaydiran program
//NE NEREYE ?

class Dizi7{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int b[]=new int[10];
	int i,n,size;
	size=10;
	System.out.println("n gir: ");
	n=Keyboard.readInt();
	
	for(i=0;i<n;i++)
		b[i]=a[i];
	
	for(i=n;i<size;i++)
		a[i-n]=a[i];
	
	for(i=0;i<n;i++)
		a[size-n+i]=b[i];

	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");
	}
}
