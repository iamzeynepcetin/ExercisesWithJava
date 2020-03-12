//a dizisini kendi icinde tersine ceviren program

class Array21{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int i;
	int size=10;
	int temp;
	
	for(i=0;i<size/2;i++){
	temp=a[i];
	a[i]=a[size-i-1];
	a[size-i-1]=temp;
	}
	
	for(i=0;i<size;i++)
	System.out.println(a[i]);
	}
}
