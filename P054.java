//dizinin ilk n adet elemanini dizinin sonuna atayan ve bastaki elemanlari sifirlayan kod

class Dizi5{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int n=7;
	int i;
	int size=10;
			
	for(i=size-1;i>=size-n;i--)
		a[i]=a[i-n/2];
	for(i=0;i<size-n;i++)
		a[i]=0;
	
	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");
	}
}
