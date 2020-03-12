//a dizisini b dizisine ters atayan program

class Array20{
	public static void main(String args[]) throws Exception{
        int a[]={4,8,3,1,18,9,21,20,5,17};
	int size=10;
	int i;
	int b[]=new int[size];
	
	for(i=0;i<size;i++)
		b[size-i-1]=a[i];

 	for (i=0;i<size;i++)
		System.out.println(b[i]);
	}
}
