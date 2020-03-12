//dizinin elemanlarini bir one kaydiran ve dizinin ilk elemanini dizinin sonuna atayan program
//NE NEREYE ?

class Dizi6{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int n,i;
	int size=10;
	int temp;
	temp=a[0];
	for(i=1;i<size;i++)
		a[i-1]=a[i];
	a[size-1]=temp;
	
	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");
	}
}
	
