//dizinin en buyuk ve en kucuk elemanini bulan eleman

class Array26{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i,max,min,size;
		size=10;
		max=a[0];
		min=a[0];
		
		for(i=0;i<size;i++)
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];

		System.out.println("en buyuk: "+max + " en kucuk: "+min);
	}
}

		
