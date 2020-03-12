//Selection sort=secerek siralama

class Array29{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i,size,min,p,k;
		size=10;
		
		for(k=0;k<size-1;k++){
			min=a[k];
			p=k;
			for(i=k+1;i<size;i++)
				if(a[i]<min){
					min=a[i];
					p=i;
				}
					a[p]=a[k];
					a[k]=min;
		}
		for(i=0;i<size;i++)
			System.out.println(a[i]);
	}

}
				
			
