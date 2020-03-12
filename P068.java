//Bubble sort=kabarcik siralama

class Array30{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int size,i,k,temp;
		size=10;
		for(k=0;k<size-1;k++)
			for(i=0;i<size-1-k;i++)
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
	for(i=0;i<size;i++)
		System.out.println(a[i]);
	}
}
				
		
