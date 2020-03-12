//dizinin en buyuk elemanini bulan program
class Array25{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i,max;
		int size=10;
		max=a[0];
		for(i=0;i<size;i++)
			if(a[i]>max)
				max=a[i];
	System.out.println("en buyuk eleman: "+max);
	}
}
			
